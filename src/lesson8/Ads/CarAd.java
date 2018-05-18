package lesson8.Ads;

/**
 * Created by Ruslan on 13.09.2017.
 */
public class CarAd extends Ad {

    int yearOfManufacturing;
    String color;
    String ownerName;
    double weight;
    int horsePower;

    public CarAd(long id, int price) {
        super(id, price);
    }
    void confirmAd () {
        //some logic
    }
}
