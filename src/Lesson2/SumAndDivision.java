package Lesson2;

/**
 * Created by Ruslan on 03.08.2017.
 */
public class SumAndDivision {
    public static void main(String[] args) {
        int sum = 0;
        int x, y;

        for (int i =0; i <= 1000; i++) {
            sum += i;
        }
        x = sum / 1234;
        y = sum % 1234;

        while (x < y) {
            System.out.println("true");
            break;

            }
        while (x > y) {
            System.out.println("false");
            break;
        }

    }
}
