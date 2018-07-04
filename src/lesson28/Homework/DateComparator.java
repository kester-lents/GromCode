package lesson28.Homework;


import java.util.Comparator;

/**
 * Created by Ruslan on 04.07.2018.
 */
public class DateComparator implements Comparator<Capability> {
    @Override
    public int compare(Capability o1, Capability o2) {
        if (o1.getDateCreated().before(o2.getDateCreated()))
            return 1;
        else if (o1.getDateCreated().after(o2.getDateCreated()))
            return -1;
        else return 0;
    }
}
