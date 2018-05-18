package lesson5;

import java.util.Arrays;

/**
 * Created by Ruslan on 09.06.2017.
 */
public class sortArray_Insertion {

    public static void main(String[] args) {
        int[] array = {5, 3, 10, 2, 0, -10};
        System.out.println(Arrays.toString(sortAscending(array)));
        //System.out.println(Arrays.toString(sortDescending(array)));
    }

    public static int[] sortAscending(int[] array) {

        int i, j, value;
        for (i = 1; i < array.length; i++) {
            value = array[i];
            for (j = i - 1; j >= 0 && array[j] > value; j--) {
                array[j + 1] = array[j];
            }
            array[j + 1] = value;
        }

        return array;
    }
        }







