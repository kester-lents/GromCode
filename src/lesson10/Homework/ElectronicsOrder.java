package lesson10.Homework;

import java.util.Date;

/**
 * Created by Ruslan on 02.04.2018.
 */
public class ElectronicsOrder extends Order {
    private int guaranteeMonths;

    public ElectronicsOrder(String itemName, Date dateCreated, String shipFromCity,
                            String shipToCity, int basePrice, Customer customerOwned, int guaranteeMonths) {
        super(itemName, dateCreated, shipFromCity, shipToCity, basePrice, customerOwned);
        this.guaranteeMonths = guaranteeMonths;
    }

    @Override
    void validateOrder() {
        boolean b = false;
        String[] cities = new String[]{"Kiev", "Odessa", "Dnieper", "Kharkiv"};
        for (String city : cities) {
            if (city.equals(getShipFromCity())) {
                if (city.equals(getShipToCity())) {
                    if (getBasePrice() >= 100) {
                        if (getCustomerOwned().getGender().equals("Woman"))
                            b = true;
                    }

                }
            }
        }
    }

    @Override
    void calculatePrice() {

    }
}
