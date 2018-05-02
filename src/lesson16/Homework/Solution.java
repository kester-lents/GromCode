package lesson16.Homework;

/**
 * Created by Ruslan on 02.05.2018.
 */
public class Solution {
    public static void main(String[] args) {
        String str = " dgdf dsf sd   sdg df ";
        System.out.println(countWords(str));
    }

    //подсчитать количество слов в стринге, слово - это стринг, разделенный пробелом.
    //есть метод контейнс, но он не
    //есть прекрасный метод чарет, обрезаем пробелы
    static int countWords(String input) {
        int index = 0;
        String res = input.trim();
        for (int i = 0; i < res.length(); i++) {
            if (res.charAt(i) == ' ' && res.charAt(i + 1) != ' ')
                index++;
        }
        if (!res.isEmpty())
            index += 1;

        return index;
    }
}
