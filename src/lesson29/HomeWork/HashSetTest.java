package lesson29.HomeWork;

import java.util.HashSet;

/**
 * Created by Ruslan on 25.09.2018.
 */
public class HashSetTest {
    public static void main(String[] args) {
        useHashSet();
    }

    static void useHashSet(){
        HashSet<Order> hashSet = new HashSet<>();
        HashSet<Order> hashSet1 = new HashSet<>();

        Order order1 = new Order(123,34234,"EUR","Drugs","2332423");
        Order order2 = new Order(12343,34234868,"EUR","Drugs","2332423");
        Order order3 = new Order(111123,34234,"USD","Drugs","2332423");

        hashSet.add(order1);
        hashSet.add(order2);
        hashSet.add(order3);
        System.out.println(hashSet);

        hashSet.remove(order3);
        System.out.println(hashSet);

        hashSet1.add(order2);
        hashSet.retainAll(hashSet1);
        System.out.println(hashSet);

        hashSet.add(order3);
        hashSet.removeAll(hashSet1);
        System.out.println(hashSet);

       Object [] array = hashSet.toArray();
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

        System.out.println(hashSet.size());
    }
}
