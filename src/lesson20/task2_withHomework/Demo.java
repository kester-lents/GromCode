package lesson20.task2_withHomework;

import java.util.Arrays;
import java.util.Date;

/**
 * Created by Ruslan on 31.05.2018.
 */
public class Demo {
    public static void main(String[] args) {
        Transaction tr123 = new Transaction(1213455, "i;ohlgi", 40, "for drugs",
                TransactionType.INCOME, new Date());
        TransactionDAO trDAO = new TransactionDAO();
       /* transactions[0] = new Transaction(1213, "Kiev", 4, "for drugs",
                TransactionType.OUTCOME, new Date());
        transactions[1] = new Transaction(1214, "Odessa", 35, "for drugs",
                TransactionType.OUTCOME, new Date());
        transactions[2] = new Transaction(1215, "Kiev1", 0, "for drugs",
                TransactionType.INCOME, new Date());*/

        try {
            //System.out.println(Arrays.toString();
            trDAO.save(new Transaction(1213, "Kiev", 4, "for drugs",
                    TransactionType.OUTCOME, new Date()));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
