package Lesson5;

import java.util.Arrays;

/**
 * Created by Ruslan on 09.06.2017.
 */
public class unicNumbers {

    public static void main(String[] args) {
        int array[] = {1, 3, 5, 5, 10, 10, 10};
        System.out.println(uniqueCount(array));
    }


    public static int uniqueCount(int[] array) {

        int count = 0;
        int countUnique = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] == array[i]) {
                    count++;
                    break;
                }
            }

        }

        return array.length - count;

    }
}
