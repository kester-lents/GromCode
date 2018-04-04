package lesson11.interfaceExample;

/**
 * Created by Ruslan on 26.03.2018.
 */
public interface DbProvider {


    void connectToDb();

    void disconnectFromDb();

    void encryptData();
}