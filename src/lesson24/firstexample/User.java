package lesson24.firstexample;

/**
 * Created by Ruslan on 12.06.2018.
 */
public class User {
    private int age;

    public User(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "age=" + age +
                '}';
    }
}
