package Lesson18.Homework;

import java.util.Arrays;

/**
 * Created by Ruslan on 17.05.2018.
 */
public class Solution {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(findNumbers(" hello 124324 8uh9u kh 9 y9u8 01  ")));
        System.out.println(Arrays.toString(findNumbersWithoutTryCatch(" hello 124324 8uh9u kh 9 y9u8 01  ")));

    }

    /*  - Поделить текст на слова по пробелу.
        - Найти размер результирующего массива.
        - Записать в него элементы.
        - Исключения выводить в консоль.
        */
    static int[] findNumbers(String text) {
        if (text == null)
            return null;
        if (text.isEmpty())
            return null;

        String[] str = text.split(" ");
        int index = 0;
        int i = 0;
        for (String word : str) {
            try {
                Integer.parseInt(word);
                index++;
            } catch (Exception e) {
            }
        }
        if (index < 0)
            return null;

        int[] digits = new int[index];

        for (String word : str) {
            try {
                int digit = Integer.parseInt(word);
                digits[i++] = digit;
            } catch (Exception e) {
                System.out.println("not a number");
            }
        }

        return digits;
    }


    static int[] findNumbersWithoutTryCatch(String text) {
        if (text == null)
            return null;
        if (text.isEmpty())
            return null;

        String[] str = text.split(" ");
        int index = 0;
        int i = 0;
        for (String word : str) {
            if (isNumeric(word))
                index++;
        }
        if (index < 0)
            return null;

        int[] digits = new int[index];

        for (String word : str) {
            if (isNumeric(word)) {
                int digit = Integer.parseInt(word);
                digits[i++] = digit;
            } else System.out.println("not a number");
        }

        return digits;
    }

    static boolean isNumeric(String s) {
        return s != null && s.matches("[-+]?\\d*\\.?\\d+");
    }


}
