package lesson20.task2_withHomework;

/**
 * Created by Ruslan on 29.05.2018.
 */
public class Controller {
    private TransactionDAO transactionDAO = new TransactionDAO();

    public Transaction save(Transaction transaction) throws Exception {

        return TransactionDAO.save(transaction);
    }

    public Transaction[] transactionList() throws Exception {

        return TransactionDAO.transactionList();
    }

    public Transaction[] transactionList(String city) throws Exception {

        return TransactionDAO.transactionList(city);
    }

    public Transaction[] transactionList(int amount) throws Exception {

        return TransactionDAO.transactionList(amount);
    }
}
