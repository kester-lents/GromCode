package lesson28.Homework;

import java.util.Comparator;

/**
 * Created by Ruslan on 04.07.2018.
 */
public class DateComparator implements Comparator<Capability> {
    @Override
    public int compare(Capability o1, Capability o2) {
        if (o1 != null && o2 != null)
            return o2.getDateCreated().compareTo(o1.getDateCreated());

        return 0;
    }
}
