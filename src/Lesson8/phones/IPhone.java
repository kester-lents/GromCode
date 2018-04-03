package Lesson8.phones;

/**
 * Created by Ruslan on 06.09.2017.
 */
public class IPhone extends Phone {

    boolean fingerPrint;

    public IPhone(int price, double weight, String countryProduced, boolean fingerPrint) {
        /*this.price = price;
        this.weight = weight;
        this.countryProduced = countryProduced;*/
        super(price, weight, countryProduced);
        System.out.println("IPhone constructor was invoked...");
        this.fingerPrint = fingerPrint;
    }

    void deleteIphoneFromDb() {
        System.out.println("deleteIphoneFromDb invoked...");
    }
}
