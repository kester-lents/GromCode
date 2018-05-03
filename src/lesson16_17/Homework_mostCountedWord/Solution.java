package lesson16_17.Homework_mostCountedWord;

import java.util.Arrays;

/**
 * Created by Ruslan on 03.05.2018.
 */
public class Solution {

    public static void main(String[] args) {

    }
    static String mostCountedWord(String input) {
        String[] words = arrayWithoutSpaces(input);
        int[] indexes = new int[words.length];
        String[] duplicates = new String[words.length];
        int index = 0;
        for (int i = 0; i < words.length; i++) {
            for (int j = i + 1; j < words.length; j++) {
                if (words[j].equals(words[i])) {
                    indexes[i] = index++;
                    duplicates[i] = words[j];
                }
            }
        }
        System.out.println(Arrays.toString(indexes));
        System.out.println(Arrays.toString(duplicates));

        return null;
    }


    /*1. Разделить Стринг на слова.
       2. Сравнить длину отдельных слов.
        */
    /*1. Разделить Стринг на слова.
2. Сравнивать элементы массива и записывать количество повторений отдельный массив, а также количество
этот элемент в еще один массив. Массивы равны по размерности.
3. Найти максимальный индекс в одном массиве, и по этому индексу вывести элемент другого массива.
*/
    protected static String[] arrayWithoutSpaces(String input) {
        String[] words = input.split(" ");
        int index = 0;
        int i = 0;
        for (String el : words) {
            if (!el.isEmpty())
                index++;
        }
        String[] result = new String[index];
        for (String el : words) {
            if (!el.isEmpty())
                result[i++] = el;
        }

        return result;
    }

    protected static Boolean validationWord(String word) {
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if (Character.isLetter(c)) {
                continue;
            }
            else return false;
        }
        return true;
    }
}
