package lesson20.task2_withHomework;

import java.util.Date;

/**
 * Created by Ruslan on 31.05.2018.
 */
public class Demo {
    public static void main(String[] args) {
        Transaction tr1 = new Transaction(1213, "Kiev", 4, "for drugs",
                TransactionType.OUTCOME, new Date());
        Transaction tr2 = new Transaction(1214, "Odessa", 35, "for drugs",
                TransactionType.OUTCOME, new Date());
        Transaction tr3 = new Transaction(1215, "Kiev1", 0, "for drugs",
                TransactionType.INCOME, new Date());
        Transaction tr123 = new Transaction(1213455, "i;ohlgi", 40, "for drugs",
                TransactionType.INCOME, new Date());
        TransactionDAO trDAO = new TransactionDAO();
        Controller controller = new Controller();
        try {
            controller.save(tr123);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
