package lesson16.Homework;

import java.util.Arrays;

/**
 * Created by Ruslan on 02.05.2018.
 */
public class Solution {
    public static void main(String[] args) {
        String str = null;

        System.out.println(countWords2(str));

        //System.out.println(maxWord(str));
        //System.out.println(minWord(str));
        //System.out.println(countWords(str));
    }

    /*countWords
    1. Проверяем, не пустой ли Стринг (или полон пробелов).
    2. Делим стринг на массив подстрингов (arrayWithoutSpaces)
    3. Проверяем на валидность слово (validationWord).
    4. Считаем количество одинарных пробелов с стринге.
    5. Количество слов = количество пробелов + 1.
    */

    static int countWords2(String input) {
        if (input == null)
        return 0;
        String res = input.trim();
        if (res.isEmpty())
            return 0;

        String[] array = arrayWithoutSpaces(input);
        for (String word : array) {
            if (!validationWord(word))
                return 0;
        }

        int index = 0;
        for (int i = 0; i < res.length(); i++) {
            if (Character.isWhitespace(res.charAt(i)) && !Character.isWhitespace(res.charAt(i + 1)))
                index++;
        }
        return index += 1;
    }

    static String[] arrayWithoutSpaces(String input) {
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

    static Boolean validationWord(String word) {
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if (Character.isLetter(c) || Character.isWhitespace(c)) {
                return true;
            }
        }
        return false;
    }

    /*static int countWords(String input) {
        if (input.isEmpty())
            return 0;

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (!validationWord(c)) {
                return 0;
            }
        }
        int index = 0;
        String res = input.trim();
        for (int i = 0; i < res.length(); i++) {
            if (Character.isWhitespace(res.charAt(i)) && !Character.isWhitespace(res.charAt(i + 1)))
                index++;
        }
        return index += 1;
    }*/


/*1. Разделить Стринг на слова.
2. Сравнивать элементы массива и записывать количество повторений отдельный массив, а также количество
этот элемент в еще один массив. Массивы равны по размерности.
3. Найти максимальный индекс в одном массиве, и по этому индексу вывести элемент другого массива.
*/

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
    static String maxWord(String input) {
        String[] words = arrayWithoutSpaces(input);
        System.out.println(Arrays.toString(words));
        int max = 0;
        String maxWord = null;
        for (String word : words) {
            if (word.length() > max) {
                max = word.length();
                maxWord = word;
            }
        }
        return maxWord;
    }

    static String minWord(String input) {
        String[] words = arrayWithoutSpaces(input);
        System.out.println(Arrays.toString(words));
        int min = 10;
        String minWord = null;
        for (String word : words) {
            if (word.length() < min) {
                min = word.length();
                minWord = word;
            }
        }
        return minWord;
    }

}
