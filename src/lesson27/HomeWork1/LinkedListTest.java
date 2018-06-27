package lesson27.HomeWork1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

/**
 * Created by Ruslan on 20.06.2018.
 */
public class LinkedListTest {
    public static void main(String[] args) {
        useList();
    }

    static LinkedList<Order> useList() {
        LinkedList<Order> list = new LinkedList<>();

        Order order1 = new Order(123, 3434, "EUR", "bazuka", "32y9ertyh");
        Order order2 = new Order(12346, 3434534, "USD", "gun", "32y9yreh");
        Order order3 = new Order(123453, 3345434, "UAN", "shotgun", "32dfy9yh");
        Order order4 = new Order(12323, 343344, "EUR", "drugs", "32y9yewh");
        Order order5 = new Order(12653, 334434, "EUR", "escort", "32y9yerth");
        ArrayList<Order> list1 = new ArrayList<>();
        list1.addAll(Arrays.asList(order1, order2, order3, order4, order5));

        list.add(order1);
        list.add(1, order3);
        list.remove(0);
        list.remove(order3);
        list.addAll(list1);
        System.out.println(list.subList(2, 4));
        list.set(0, order2);
        System.out.println(list.contains(order1));
        Order[] array = list.toArray(new Order[list.size()]);
        System.out.println(Arrays.toString(array));
        list.clear();

        System.out.println(list.toString());

        return list;
    }
}
