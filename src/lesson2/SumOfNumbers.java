package lesson2;

/**
 * Created by Ruslan on 03.08.2017.
 */
public class SumOfNumbers {
    public static void main(String[] args) {
        long sum = 0;
        for (int i = 0; i <= 10000000; i++) {
            sum += i;
        }
        System.out.println(sum);

    }
}
