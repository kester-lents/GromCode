package lesson4;

/**
 * Created by Ruslan on 07.06.2017.
 */
public class StringMethod {
    public static void main(String[] args) {

        System.out.println(yo("Hello world. ", "Let's code ", "and have fun!", "yeah", "wow"));
    }

    public static String yo (String l, String m, String n, String o, String p ){
        String yo;
        yo = concat(l, m, n) + concat(n, o, p);
        return yo;

    }

    public static String concat (String a, String b, String c) {
        String concat = a + b + c;
        return concat;
    }


}
