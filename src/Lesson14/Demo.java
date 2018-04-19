package Lesson14;

/**
 * Created by Ruslan on 18.04.2018.
 */
public class Demo {
    public static void main(String[] args) {
        Object objectTest = new Object();
        System.out.println(objectTest.toString());
        System.out.println(objectTest.getClass().getName());
        objectTest = new Object();
        System.out.println(objectTest.toString());
        System.out.println(objectTest.getClass().getName());
        objectTest = new Object();
        System.out.println(objectTest.toString());
        System.out.println(objectTest.getClass().getName());
    }
}
