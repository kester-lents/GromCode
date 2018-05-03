package lesson16_17.Homework_maxOrMinWord;

/**
 * Created by Ruslan on 03.05.2018.
 */
public class Solution extends lesson16_17.Homework_countWords.Solution {
    public static void main(String[] args) {


        //System.out.println(maxWord(str));
        //System.out.println(minWord(str));
        //System.out.println(countWords(str));
    }
    static String maxWord(String input) {
        if (input == null)
            return null;
        String res = input.trim();
        if (res.isEmpty())
            return null;

        String[] array = arrayWithoutSpaces(input);
        for (String word : array) {
            if (!validationWord(word))
                return null;
        }
        int max = 0;
        String maxWord = null;
        for (String word : array) {
            if (word.length() > max) {
                max = word.length();
                maxWord = word;
            }
        }
        return maxWord;
    }

    static String minWord(String input) {
        if (input == null)
            return null;
        String res = input.trim();
        if (res.isEmpty())
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
}
