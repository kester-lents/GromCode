package lesson20.task2_withHomework;

import lesson20.task2_withHomework.Exception.BadRequestException;
import lesson20.task2_withHomework.Exception.InternalServerException;
import lesson20.task2_withHomework.Exception.LimitExceeded;

import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by Ruslan on 29.05.2018.
 */
public class TransactionDAO {
    private Transaction[] transactions = new Transaction[10];
    private Utils utils = new Utils();

    public Transaction save(Transaction transaction) throws Exception {
        validate(transaction);
        int index = 0;
        for (Transaction tr : transactions) {
            if (tr == null) {
                transactions[index] = transaction;
                System.out.println("done");
                return transactions[index];
            } else index++;
        }
        if (index == transactions.length)
            throw new InternalServerException("There aren't enough space to save transaction " + transaction.getId());
        return null;
    }

    private void validate(Transaction transaction) throws Exception {
        /*
        если есть дубликаты +
    сумма транзакции больше указанного лимита +
    сумма транзакций за день больше дневного лимита +
    количество транзакций за день больше указанного лимита +
    если город оплаты (совершения транзакции) не разрешен
    не хватило места в массиве
    */
        findDuplicates(transaction);
        if (transaction.getAmount() > utils.getLimitSimpleTransactionAmount())
            throw new LimitExceeded("Transaction limit exceed " + transaction.getId() + " can't be saved");

        int sum = 0;
        int count = 0;
        for (Transaction tr : getTransactionsPerDay(transaction.getDateCreated())) {
            sum += tr.getAmount();
            count++;
        }
        if (sum > utils.getLimitTransactionsPerDayAmount())
            throw new LimitExceeded("Transaction limit per day amount exceed " + transaction.getId() + " can't be saved");

        if (count > utils.getLimitTransactionsPerDayCount())
            throw new LimitExceeded("Transaction limit per day count exceed " + transaction.getId() + " can't be saved");

        int i = 0;
        for (String cities : utils.getCities()) {
            if (transaction.getType() == TransactionType.OUTCOME && !transaction.getCity().equals(cities))
                i++;
        }
        if (i == utils.getCities().length)
            throw new BadRequestException("The city in transaction " + transaction.getId() + " can't be chose");
    }

    void findDuplicates(Transaction transaction) throws Exception {
        for (Transaction tr : transactions) {
            if (tr != null && tr.getAmount() == transaction.getAmount() && tr.getCity().equals(transaction.getCity()) &&
                    tr.getId() == tr.getId() && tr.getDescription().equals(transaction.getDescription()) &&
                    tr.getType().equals(transaction.getType()))
                throw new BadRequestException("transaction " + transaction.getId() + " is already existed in array");
        }
    }

    Transaction[] transactionList() {
        System.out.println(Arrays.toString(transactions));
        return transactions;
    }

    Transaction[] transactionList(String city) throws BadRequestException {
        int i = 0;
        int index = 0;
        for (Transaction tr : transactions) {
            if (tr != null && tr.getCity().equals(city))
                i++;
        }
        if (i == 0)
            throw new BadRequestException("There aren't transactions with city " + city);
        Transaction[] result = new Transaction[i];
        for (Transaction tr : transactions) {
            if (tr != null && tr.getCity().equals(city))
                result[index] = tr;
        }
        System.out.println(Arrays.toString(result));
        return result;
    }

    Transaction[] transactionList(int amount) throws BadRequestException {
        int i = 0;
        int index = 0;
        for (Transaction tr : transactions) {
            if (tr != null && tr.getAmount() == amount)
                i++;
        }
        if (i == 0)
            throw new BadRequestException("There aren't transactions with amount " + amount);
        Transaction[] result = new Transaction[i];
        for (Transaction tr : transactions) {
            if (tr != null && tr.getAmount() == amount)
                result[index++] = tr;
        }
        System.out.println(Arrays.toString(result));
        return result;
    }

    private Transaction[] getTransactionsPerDay(Date dateOfCurTransaction) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(dateOfCurTransaction);

        int month = calendar.get(Calendar.MONTH);
        int day = calendar.get(Calendar.DAY_OF_MONTH);

        int count = 0;
        for (Transaction transaction : transactions) {
            if (transaction != null) {
                calendar.setTime(transaction.getDateCreated());
                int trMonth = calendar.get(Calendar.MONTH);
                int trDay = calendar.get(Calendar.DAY_OF_MONTH);

                if (trMonth == month && trDay == day)
                    count++;
            }
        }
        Transaction[] result = new Transaction[count];
        int index = 0;
        for (Transaction transaction : transactions) {
            if (transaction != null) {
                calendar.setTime(transaction.getDateCreated());
                int trMonth = calendar.get(Calendar.MONTH);
                int trDay = calendar.get(Calendar.DAY_OF_MONTH);

                if (trMonth == month && trDay == day)
                    result[index] = transaction;
                index++;
            }

        }
        return result;
    }

    public void setTransactions(Transaction[] transactions) {
        this.transactions = transactions;
    }

    public Transaction[] getTransactions() {
        return transactions;
    }
}









