package lesson4;

/**
 * Created by Ruslan on 07.06.2017.
 */
public class findDivCount_task {
    public static void main(String[] args) {
        System.out.println(findDivCount((short) 1, (short) 17, 4));
    }

    public static int findDivCount(short a, short b, int n) {
        int count = 0;

        for (int i = a; i <= b; i++)
        {
            if (i % n == 0) {
                count++;
            }
        }
        return count;
    }
}







