package lesson20.task2_withHomework;

import java.util.Arrays;
import java.util.Date;

/**
 * Created by Ruslan on 31.05.2018.
 */
public class Demo {
    public static void main(String[] args) {
        TransactionDAO trDAO = new TransactionDAO();
        Transaction tr123 = new Transaction(1213455, "i;ohlgi", 40, "for drugs",
                TransactionType.OUTCOME, new Date());
        Transaction tr1 = new Transaction(121345, "Odessa", 34, "for drugs",
                TransactionType.INCOME, new Date());
        Transaction tr2 = new Transaction(1214, "Odessa", 35, "for drugs",
                TransactionType.OUTCOME, new Date());
        Transaction tr3 = new Transaction(1215, "Kiev", 0, "for drugs",
                TransactionType.INCOME, new Date());

        try {
            trDAO.save(tr2);
            trDAO.save(tr3);
            trDAO.transactionList();

            System.out.println();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
