package Lesson3;

/**
 * Created by Ruslan on 02.06.2017.
 */
public class TernaryOperator {
    public static void main(String[] args) {
        int a;
        int b = 100;

        a = b > 200 ? b : b - 500;
        b=a;
        System.out.println(a);

    }
}
