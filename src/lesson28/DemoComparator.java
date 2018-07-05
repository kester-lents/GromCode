package lesson28;

import lesson28.Homework.Capability;
import lesson28.Homework.DateComparator;
import lesson28.Homework.FullComparator;
import lesson28.Homework.isActiveComparator;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Comparator;

/**
 * Created by Ruslan on 04.07.2018.
 */
public class DemoComparator {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd");

        Capability capability1 = new Capability(1001, "test4", "Arrr", true, sdf.parse("2007-12-15"));
        Capability capability2 = new Capability(1005, "test3", "Zrrrr", false, sdf.parse("2010-12-15"));
        Capability capability3 = new Capability(900, "test2", "Orrrr", true, sdf.parse("2013-12-15"));
        Capability capability4 = new Capability(900, "test1", "Lrrrr", false, sdf.parse("2008-12-15"));


        ArrayList<Capability> capabilities = new ArrayList<>();
        capabilities.add(capability1);
        capabilities.add(capability2);
        capabilities.add(capability3);
        capabilities.add(capability4);

        System.out.println(capabilities);

        /*capabilities.sort(new DateComparator());
        System.out.println(capabilities);*/
        System.out.println();

        /*capabilities.sort(Comparator.comparing(Capability::getChannelName).
                thenComparing(Capability::getFingerprint).thenComparing(new DateComparator()));*/
        capabilities.sort(new FullComparator());
        System.out.println(capabilities);

        Comparator<Capability> comparator = new Comparator<Capability>() {
            @Override
            public int compare(Capability o1, Capability o2) {
                return 0;
            }
        };
    }
}
