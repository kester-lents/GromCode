package Lesson5;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created by Ruslan on 09.06.2017.
 */
public class sortArray_Bubble {

    public static void main(String[] args) {
        int[] array = {5, 3, 10, 2, 0, -10};
        System.out.println(Arrays.toString(sortAscending(array)));
        System.out.println(Arrays.toString(sortDescending(array)));
    }

    public static int[] sortAscending(int[] array) {

        for (int i = array.length - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j] > array[j + 1]) {
                    int tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;


                }
            }
        }
        return array;

    }

    public static int[] sortDescending(int[] array) {

        for (int i = array.length - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j] < array[j + 1]) {
                    int tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                }
            }
        }
        return array;
    }
}





