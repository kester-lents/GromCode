package lesson10.AbstractFirstExample;

/**
 * Created by Ruslan on 26.03.2018.
 */
public class MySQLProvider extends DbProvider {

    @Override
    void connectToDb() {
        //logic for MySQL
    }

    @Override
    void disconnectFromDb() {
        //logic for MySQL
    }
}
