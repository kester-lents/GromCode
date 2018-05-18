package lesson5;

import java.util.Arrays;

/**
 * Created by Ruslan on 08.06.2017.
 */
public class FirstArray {
    public static void main(String[] args) {
        int a;
        a = 10;

        // type of array [} name of array = new type of array [length of array]

        int [] firstArray = new int [3]; // declaration

        // array name [index] - get array element
        firstArray [0] = 11;
        firstArray [1] = 200;
        firstArray [2] = -10;

        System.out.println(firstArray[0]);
        System.out.println(firstArray[1]);
        System.out.println(firstArray[2]);

        for (int i = 0; i < firstArray.length; i++) {
            System.out.println(firstArray[i]);
        }
        System.out.println(Arrays.toString(firstArray));


        int b = 10;
        int [] secondArray = {1, 10, 15, 20, -50};
        System.out.println(Arrays.toString(secondArray));

        // for-each
        for (int element : secondArray) {
            System.out.println(element);
        }
        for (int i = 0; i < firstArray.length; i++) {
            int element = firstArray[i];
            System.out.println(element);
        }







    }
}
