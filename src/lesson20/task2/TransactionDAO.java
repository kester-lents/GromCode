package lesson20.task2;

import java.util.Calendar;
import java.util.Date;

/**
 * Created by Ruslan on 29.05.2018.
 */
public class TransactionDAO {
    private Transaction[] transactions = new Transaction[10];

    public Transaction save(Transaction transaction) {
    /*
    сумма транзакции больше указанного лимита
    сумма транзакций за день больше дневного лимита
    количество транзакций за день больше указанного лимита
    если город оплаты (совершения транзакции) не разрешен
    не хватило места
    */


        return null;
    }

    Transaction[] transactionList() {

        return null;
    }

    Transaction[] transactionList(String city) {

        return null;
    }

    Transaction[] transactionList(int amount) {

        return null;
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









