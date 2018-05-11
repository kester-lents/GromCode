package lesson16_17.Theory;

import java.util.Arrays;

/**
 * Created by Ruslan on 27.04.2018.
 */
public class StringUsage {
    public static void main(String[] args) {

        String test = "someString";
        String result = test + "_end";
        System.out.println(result);
        char charVariable = 't';
        char charVariable1 = 'o';
        char [] chars = {charVariable,charVariable1};
        String test1 = new String(chars);
        System.out.println(test1);

        String test2 = new String("hello there");
        System.out.println(test2);

        String str = "hello.there.you";
        String [] strings = str.split("\\.");
        System.out.println(Arrays.toString(strings));


    }
}
