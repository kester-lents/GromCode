package lesson28;

import lesson28.Homework.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

public class DemoComparator {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd");

        Capability capability1 = new Capability(1001, "test4", "Arrr", true, sdf.parse("2007-12-15"));
        Capability capability2 = new Capability(1005, "test2", "Zrrrr", false, sdf.parse("2010-12-15"));
        Capability capability3 = new Capability(900, "test3", "Orrrr", true, sdf.parse("2013-12-15"));
        Capability capability4 = new Capability(900, "test1", "Lrrrr", false, sdf.parse("2008-12-15"));


        ArrayList<Capability> capabilities = new ArrayList<>();
        capabilities.add(capability1);
        capabilities.add(capability2);
        capabilities.add(capability3);
        capabilities.add(capability4);

        System.out.println(capabilities);
        System.out.println();

        capabilities.sort(new FullComparator());
        System.out.println(capabilities);

    }
}
