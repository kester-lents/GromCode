package lesson18.Theory;

/**
 * Created by Ruslan on 11.05.2018.
 */
public class ArrayException {
    public static void main(String[] args) {
        int[] array = {1, 5, 0};
        try {
            System.out.println(array[3]);
        } catch (Exception e) {
            System.err.println("element was not found");
        }/*catch (type2 e){

        }*/ finally {

        }


        System.out.println("Cool.... ");
        System.out.println("Cool2.... ");
    }
}
