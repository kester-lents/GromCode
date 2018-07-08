package lesson28.Homework;

import java.util.Comparator;

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

      if (o1.getChannelName() == null || o2.getChannelName() == null)
            return -1;
        if (o1.getChannelName() != null && o2.getChannelName() != null && !o1.getChannelName().equals(o2.getChannelName()))
            return o1.getChannelName().compareTo(o2.getChannelName());

        if (o1.getFingerprint() == null || o2.getFingerprint() == null)
            return -1;
        if (o1.getFingerprint() != null && o2.getFingerprint() != null && !o1.getFingerprint().equals(o2.getFingerprint()))
            return o1.getFingerprint().compareTo(o2.getFingerprint());

        if (o2.getDateCreated() == null || o1.getDateCreated() == null)
            return -1;
        if (o2.getDateCreated() != null && o1.getDateCreated() != null && !o2.getDateCreated().equals(o1.getDateCreated()))
            return o2.getDateCreated().compareTo(o1.getDateCreated());

        if (compare(o1.getChannelName(), o2.getChannelName()) == 0) {
            if (compare(o1.getFingerprint(), o2.getFingerprint()) == 0) {
                return compare(o2.getDateCreated(), o1.getDateCreated());
            }
        }
        return 0;

    }

    private <T extends Comparable<T>> int compare(T fieldCap1, T fieldCap2) {
        if (fieldCap1 == null)
            return (fieldCap2 == null) ? 0 : 1;
        if (fieldCap2 == null)
            return -1;
        if (!fieldCap1.equals(fieldCap2))
            return fieldCap1.compareTo(fieldCap2);

        return 0;
    }


}








