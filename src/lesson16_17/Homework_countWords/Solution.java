package lesson16_17.Homework_countWords;

/**
 * Created by Ruslan on 02.05.2018.
 */
public class Solution {
    public static void main(String[] args) {
        String str = " hgjgvg";
        System.out.println(countWords(str));
    }
    /*countWords
    1. Проверяем, не пустой ли Стринг (или полон пробелов).
    2. Делим стринг на массив подстрингов (arrayWithoutSpaces)
    3. Проверяем на валидность слово (validationWord).
    4. Считаем количество одинарных пробелов с стринге.
    5. Количество слов = количество пробелов + 1.
    */
   private static int countWords(String input) {
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

        int index = array.length;
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
            }
            else return false;
        }
        return true;
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







}
