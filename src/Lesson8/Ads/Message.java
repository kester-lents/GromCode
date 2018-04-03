package Lesson8.Ads;

import java.util.Date;

/**
 * Created by Ruslan on 13.09.2017.
 */
public class Message extends BaseEntity {
    User userfrom;
    User userTo;
    Date dateSent;
    Date dateRead;
    String message;

    public Message(long id, User userfrom, User userTo, String message) {
        super (id);
        this.userfrom = userfrom;
        this.userTo = userTo;
        this.dateSent = new Date();
        this.message = message;
    }
    void setDateRead () {
        dateRead = new Date();
    }
    boolean isRead () {
        /*if (dateRead == null)
            return false;
        return true;*/
        return dateRead == null;

    }
}




