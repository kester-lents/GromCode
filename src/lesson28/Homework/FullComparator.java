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
        if (!o1.getChannelName().equals(o2.getChannelName()))
            return o1.getChannelName().compareTo(o2.getChannelName());
        else if (!o1.getFingerprint().equals(o2.getFingerprint()))
            return o1.getFingerprint().compareTo(o2.getFingerprint());
        else if (o2.getDateCreated().equals(o1.getDateCreated()))
            return o2.getDateCreated().compareTo(o1.getDateCreated());
        else return 0;
    }
}
