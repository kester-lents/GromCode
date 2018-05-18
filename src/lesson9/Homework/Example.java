package lesson9.Homework;

/**
 * Created by Ruslan on 21.03.2018.
 */
public class Example {
    public static void main(String[] args) {
    int [] test = new int[]{1,2,4,34,4};
    int a = test.length;
    for (int i = 0;i < a-1; i++)
        for (int j = i+1; j <a;j++)
            if (test[i]==test[j])
                System.out.println(test[i]);
    }
    /*int mass = array.length;
    int z = 0;
    String[] test = new String[array.length];
        for (int a = 0; a < mass - 1; a++) {
        for (int b = a + 1; b < mass; b++) {
            if (array[a].equals(array[b]) && array[a] == name) {
                test[z] = array[a];
                z++;
                user = test[0];
            }
        }
    }*/


}
