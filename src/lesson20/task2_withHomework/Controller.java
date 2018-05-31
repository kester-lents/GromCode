package lesson20.task2_withHomework;

/**
 * Created by Ruslan on 29.05.2018.
 */
public class Controller {
    private TransactionDAO transactionDAO = new TransactionDAO();

    public Transaction save(Transaction transaction) throws Exception {

        return transactionDAO.save(transaction);
    }

    Transaction[] transactionList() {

        return transactionDAO.transactionList();
    }

    Transaction[] transactionList(String city) throws Exception {

        return transactionDAO.transactionList(city);
    }

    Transaction[] transactionList(int amount) throws Exception {

        return transactionDAO.transactionList(amount);
    }
}
