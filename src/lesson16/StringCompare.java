package lesson16;

import java.util.Arrays;

/**
 * Created by Ruslan on 27.04.2018.
 */
public class StringCompare {
    public static void main(String[] args) {
        System.out.println(new String("abc") == new String("abc"));
        System.out.println(new String("abc").equals(new String("abc")));
        System.out.println("abc" == "abc");
        System.out.println("Abc".equals("abc"));

        String s1 = "test";
        String s2 = "test";

        System.out.println(s1 == s2);

        s1.intern(); //принудительно добавляет объект (Стринг в данном случае) в Стринг Пул

        //using intern
        String s3 = new String("pppp");
        String s4 = "pppp";
        System.out.println(s3 == s4);
        s3 = s3.intern();
        System.out.println(s3 == s4);

        //bytes of string

        String str = "testStringVar";
        System.out.println(Arrays.toString(str.getBytes())); //превращает Стринг в массив байтов

        System.out.println(new String(str.getBytes()));
    }
}
