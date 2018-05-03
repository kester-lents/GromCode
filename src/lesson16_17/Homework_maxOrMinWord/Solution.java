package lesson16_17.Homework_maxOrMinWord;

/**
 * Created by Ruslan on 03.05.2018.
 */
public class Solution {
    public static void main(String[] args) {

        String str = "  ";
        System.out.println(maxWord(str));


        //System.out.println(minWord(str));
        //System.out.println(countWords(str));
    }

    static String maxWord(String input) {
        if (input == null)
            return null;
        input = input.trim();
        if (input.isEmpty())
            return null;

        String[] array = arrayWithoutSpaces(input);
        for (String word : array) {
            if (!validationWord(word))
                return null;
        }
        String maxWord = null;
        int max = 0;
        for (String word : array) {

                if (word.length() > max) {
                    max = word.length();
                    maxWord = word;
                }
            
        }
        if (maxWord.equals(""))
            return null;
        return maxWord;
    }

    static String minWord(String input) {
        if (input == null)
            return null;
        input = input.trim();
        if (input.isEmpty())
            return null;

        String[] array = arrayWithoutSpaces(input);
        for (String word : array) {
            if (!validationWord(word))
                return null;
        }
        int min = 10;
        String minWord = null;
        for (String word : array) {
            if (word.length() < min) {
                min = word.length();
                minWord = word;
            }
        }
        return minWord;
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
}
