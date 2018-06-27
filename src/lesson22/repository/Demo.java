package lesson22.repository;


import java.util.Arrays;

/**
 * Created by Ruslan on 25.04.2018.
 */
public class Demo {
    public static void main(String[] args) {

        User user1 = new User(1001, "Daniil", "uhohu9yu2h9rh98h");
        User user2 = new User(1003, "Andre", "uhohu9yu2h9rh98h");
        User user3 = new User(1004, "Test", "uhohu9yu2h9rh98h");
        UserRepository.save(user2);
        UserRepository.save(user1);
        System.out.println(UserRepository.update(user3));

        System.out.println(UserRepository.getUsers().toString());
    }
}
