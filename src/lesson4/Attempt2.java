package lesson4;

/**
 * Created by Ruslan on 13.06.2017.
 */
public class Attempt2 {
    public static void main(String[] args) {
        System.out.println(compareSums(3, 5, 3, 4));
    }
    public static boolean compareSums(int a, int b, int c, int d) {
        return sum(a, b) > sum(c, d);
    }
    public static long sum(int from, int to) {
        long sum = 0;
        for (long i = from; i <= to; i++) {
            sum+=i;
        }
        return sum;


    }
}
