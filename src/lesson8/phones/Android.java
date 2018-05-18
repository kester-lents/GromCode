package lesson8.phones;

/**
 * Created by Ruslan on 06.09.2017.
 */
public class Android extends Phone {

    String androidVersion;
    int screenSize;

    String secretDeviceCode;

    public Android(int price, double weight, String countryProduced, String androidVersion, int screenSize, String secretDeviceCode) {
       /* this.price = price;
        this.weight = weight;
        this.countryProduced = countryProduced;*/
        // this - ссылка на объект текущего класса
        // super - ссылка на объект родительского класса

        super(price, weight, countryProduced);
        this.androidVersion = androidVersion;
        this.screenSize = screenSize;
        this.secretDeviceCode = secretDeviceCode;
    }

    void installNewAnroidVersion() {
        System.out.println("installNewAnroidVersion invoked...");
    }
}
