package Lesson8.Ads;

import java.util.Date;

/**
 * Created by Ruslan on 13.09.2017.
 */
public class Ad extends BaseEntity {
    Date dateCreated;
    int price;

    public Ad(long id, int price) {
        super (id);
        this.price = price;
        this.dateCreated = new Date();
    }
    void publishAd () {
        //some logic
    }


}
