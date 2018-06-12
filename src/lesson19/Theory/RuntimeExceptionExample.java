package lesson19.Theory;

/**
 * Created by Ruslan on 18.05.2018.
 */
public class RuntimeExceptionExample {
    public static void main(String[] args) {
        arithmeticException(2);
        try {
            arithmeticException(0);
        } catch (ArithmeticException e) {
            System.out.println("something wrong");
        }
        npe(new Object());
        npe(null);
    }

    private static void arithmeticException(int a) {
        System.out.println(10 / a);
    }
    private static void npe(Object object){
        /*try {
            Sys.out.println(object.hashCode());   Плохой вариант!!!!
        }catch (NullPointerException e){
            Sys.out.println();
        }*/
        if (object != null){
            System.out.println(object.hashCode()); //Хороший вариант!
        }
    }
}
