package Lesson9.Homework;

/**
 * Created by Ruslan on 19.03.2018.
 */
public class Demo {
    public static void main(String[] args) {
        UserRepository ur = new UserRepository(new User[]{new User(12345, "Ruslan", "good"),
                new User(233534, "Ruslan", "very good"),
                new User(3435345, "Ruslan", "perfect")});
        //System.out.println(Arrays.toString(ur.getUserNames()));
        //System.out.println(ur.getUserNameById(233534));
        //System.out.println(ur.findById(0));
        System.out.println(ur.update(new User(233534, "Ruslanert", "vdfgery good")));

    }
}


