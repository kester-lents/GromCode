package lesson28.Homework;

import lesson28.Homework.Capability;

import java.util.Comparator;

/**
 * Created by Ruslan on 04.07.2018.
 */
public class isActiveComparator implements Comparator<Capability> {
    @Override
    public int compare(Capability o1, Capability o2) {
        System.out.println("isActiveComparator is used");
        if (o1.isActive() && !o2.isActive())
            return -1;
        else if ((o1.isActive()) && o2.isActive() || (!o1.isActive()) && !o2.isActive())
            return 0;
        else return 1;
    }
}
