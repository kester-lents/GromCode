package lesson15.HomeWork_modifiedLesson9;

import java.util.Arrays;

/**
 * Created by Ruslan on 25.04.2018.
 */
public class Demo {
    public static void main(String[] args) {

        UserRepository ur = new UserRepository();
        System.out.println(Arrays.toString(ur.getUsers()));
        System.out.println();
        System.out.println(ur.update(new User(1001, "Ruslan123", "123123")));
        System.out.println(Arrays.toString(ur.getUsers()));

    }
}
