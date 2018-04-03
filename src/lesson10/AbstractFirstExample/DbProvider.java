package lesson10.AbstractFirstExample;

/**
 * Created by Ruslan on 26.03.2018.
 */
public abstract class DbProvider {

    private String dbHost;

    //public DbProvider(String dbHost) {
    //  this.dbHost = dbHost;
    //}

    abstract void connectToDb();

    abstract void disconnectFromDb();

    void printDbHost() {
        System.out.println("Db host is " + dbHost);
    }
}
