package lesson28.Homework;

import java.util.Comparator;

/**
 * Created by Ruslan on 04.07.2018.
 */
public class FullComparator implements Comparator<Capability> {

    @Override
    public int compare(Capability o1, Capability o2) {
        /* если channelName не равно - сравниваю по нему
                если равно - перехожу к fingerprint
                если fingerprint не равно - сравниваю по нему
                если равно - перехожу к dateCreated
                если dateCreated не равно - сравниваю по нему
                если равно - объекты равны
                */
        if (o1 != null && o2 != null) {
            int value1 = o1.getChannelName().compareTo(o2.getChannelName());
            if (value1 == 0) {
                int value2 = o1.getFingerprint().compareTo(o2.getFingerprint());
                if (value2 == 0) {
                    return o1.getDateCreated().compareTo(o2.getDateCreated());
                } else {
                    return value2;
                }
            }
            return value1;
        }
        return 0;
    }
}
