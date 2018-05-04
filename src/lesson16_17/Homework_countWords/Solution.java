package lesson16_17.Homework_countWords;

import java.util.Arrays;

/**
 * Created by Ruslan on 02.05.2018.
 */
public class Solution {
    public static void main(String[] args) {

        String str = " hello ya you ";
        System.out.println(mostCountedWord(str));
    }

    /*
    - Убираем со входящего стринга лишние пробелы, и разбиваем на слова.
    - Пробегаемся по массиву и считаем количество индексов, которые выходит при условии контейнс подстринга его
    первому, второму и т.д. элментов. Количество вхождений записываем в массив индексов.


    */
    static String mostCountedWord(String input) {
        if (input == null)
            return null;
        if (input.isEmpty())
            return null;

        String[] words = wordsArray(input);
        int[] indexes = new int[words.length];
        for (int i = 0; i < words.length; i++) {
            for (int j = i + 1; j < words.length; j++) {
                if (words[i].equals(words[j]))
                    indexes[i]++;

            }

        }
       // System.out.println(Arrays.toString(indexes));
        int maxcount = 0;
        int index = 0;
        for (int i = 0; i < indexes.length; i++) {
            if (indexes[i] > maxcount)
                index = i;
        }
        if (index != 0)
            return words[index];

        return null;
    }


    /*
    1. Проверяет не налл ли входящий Стринг, или не пустой ли.
    2. Разделяем стринг на подстринги, и создаем новый массив без пробелов.
    3. Проходим по массиву и проверяем на валидность слово.
    4. Сравниваем слова с мин/макс и перезаписываем их.
        */
    static String maxWord(String input) {
        if (input == null)
            return null;
        if (input.isEmpty())
            return null;

        String[] array = arrayWithoutSpaces(input);

        String maxWord = null;
        int max = 0;
        for (int i = 0; i < array.length; i++) {
            if (validationWord(array[i])) {
                if (array[i].length() > max) {
                    max = array[i].length();
                    maxWord = array[i];
                }
            }
        }
        return maxWord;
    }

    static String minWord(String input) {
        if (input == null)
            return null;
        if (input.isEmpty())
            return null;

        String[] array = arrayWithoutSpaces(input);

        String minWord = null;
        int min = 10;
        for (int i = 0; i < array.length; i++) {
            if (validationWord(array[i])) {
                if (array[i].length() < min) {
                    min = array[i].length();
                    minWord = array[i];
                }
            }
        }
        return minWord;
    }

    /*countWords
    1. Проверяем, не пустой ли Стринг (или полон пробелов).
    2. Делим стринг на массив подстрингов (arrayWithoutSpaces)
    3. Проверяем на валидность слово (validationWord).
    4. Считаем количество одинарных пробелов с стринге.
    5. Количество слов = количество пробелов + 1.
    6. Или (намного проще вариант) - количество элементов в массиве вордовых и есть резалт.
    */
    private static int countWords(String input) {
        if (input == null)
            return 0;
        if (input.isEmpty())
            return 0;

        int index = 0;
        String[] array = arrayWithoutSpaces(input);
        for (String word : array) {
            if (!validationWord(word))
                index++;
        }

        index = array.length - index;
        /*for (int i = 0; i < res.length(); i++) {
            if (Character.isWhitespace(res.charAt(i)) && !Character.isWhitespace(res.charAt(i + 1)))
                index++;
        }*/
        return index /*+= 1*/;
    }

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
            } else return false;
        }
        return true;
    }

    protected static String[] wordsArray(String input) {
        String[] array = arrayWithoutSpaces(input);
        int index = 0;
        int i = 0;
        for (String word : array) {
            if (validationWord(word))
                index++;
        }
        String[] result = new String[index];
        for (String word : array) {
            if (validationWord(word))
                result[i++] = word;
        }
        return result;

    }

}

//Первые попытки

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





