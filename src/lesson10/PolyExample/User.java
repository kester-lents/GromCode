package lesson10.PolyExample;

/**
 * Created by Ruslan on 26.03.2018.
 */
public class User extends Human {

    public User(String name) {
        super(name);
    }

    @Override
    void run() {
        System.out.println("User class is called...");
        super.run();
    }
}
