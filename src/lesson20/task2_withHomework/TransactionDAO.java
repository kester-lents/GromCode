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
        if (transaction == null)
            throw new NullPointerException("Транзакция равна null");

        validate(transaction);

        int index = 0;
        for (Transaction tr : transactions) {
            if (tr == null) {
                transactions[index] = transaction;
                return transactions[index];
            } else index++;
        }

        throw new InternalServerException("There aren't enough space to save transaction " + transaction.getId());

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
        checkTransactionAmount(transaction);
        checkTransactionDayAmountAndCount(transaction);
        checkTransactionCity(transaction);
    }

    void findDuplicates(Transaction transaction) throws Exception {
        for (Transaction tr : transactions) {
            if (tr != null && tr.equals(transaction))
                throw new BadRequestException("transaction " + transaction.getId() + " is already existed in array");
        }
    }

    void checkTransactionAmount(Transaction transaction) throws LimitExceeded {
        if (transaction.getAmount() > utils.getLimitSimpleTransactionAmount())
            throw new LimitExceeded("Transaction limit exceed " + transaction.getId() + " can't be saved");
    }

    void checkTransactionDayAmountAndCount(Transaction transaction) throws LimitExceeded {
        int sum = 0;
        int count = 0;
        for (Transaction tr : getTransactionsPerDay(transaction.getDateCreated())) {
            sum += tr.getAmount();
            count++;
        }
        if (sum + transaction.getAmount() > utils.getLimitTransactionsPerDayAmount())
            throw new LimitExceeded("Transaction limit per day amount exceed " + transaction.getId() + " can't be saved");

        if (count + 1 > utils.getLimitTransactionsPerDayCount())
            throw new LimitExceeded("Transaction limit per day count exceed " + transaction.getId() + " can't be saved");

    }

    void checkTransactionCity(Transaction transaction) throws BadRequestException {
        for (String city : utils.getCities()) {
            if (transaction.getCity() != null && transaction.getCity().equals(city))
                return;
        }
        throw new BadRequestException("The city in transaction " + transaction.getId() + " can't be chose");
        //System.out.println("done city");
    }

    public Transaction[] transactionList() {
        int i = 0;
        int index = 0;
        for (Transaction tr : transactions) {
            if (tr != null)
                i++;
        }
        Transaction[] result = new Transaction[i];
        for (Transaction tr : transactions) {
            if (tr != null) {
                result[index] = tr;
                index++;
            }
        }
        return result;
    }

    public Transaction[] transactionList(String city) {
        int i = 0;
        int index = 0;
        for (Transaction tr : transactions) {
            if (tr != null && tr.getCity().equals(city))
                i++;
        }
        Transaction[] result = new Transaction[i];
        for (Transaction tr : transactions) {
            if (tr != null && tr.getCity().equals(city)) {
                result[index] = tr;
                index++;
            }
        }
        return result;
    }

    public Transaction[] transactionList(int amount) {
        int i = 0;
        int index = 0;
        for (Transaction tr : transactions) {
            if (tr != null && tr.getAmount() == amount)
                i++;
        }
        Transaction[] result = new Transaction[i];
        for (Transaction tr : transactions) {
            if (tr != null && tr.getAmount() == amount) {
                result[index] = tr;
                index++;
            }
        }
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

}









