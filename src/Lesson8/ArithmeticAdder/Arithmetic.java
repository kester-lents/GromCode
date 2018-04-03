package Lesson8.ArithmeticAdder;

/**
 * Created by Ruslan on 14.09.2017.
 */
public class Arithmetic {


    boolean check(int[] array) {
        int max = array[0];
        int min = array[0];

        for (int el : array) {
            if (el > max)
                max = el;
        }
        for (int el : array) {
            if (el < min)
                min = el;
        }
        if (max + min > 100)
            return true;
        else return false;

    }

}
