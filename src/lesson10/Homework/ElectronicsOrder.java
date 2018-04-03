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

        String[] cities = new String[]{"Киев", "Одесса", "Днепр", "Харьков"};
        for (String city : cities) {
            if (city.equals(getShipFromCity())) {
                if (city.equals(getShipToCity())) {
                    if (getBasePrice() >= 100) {
                        if (getCustomerOwned().getGender().equals("Женский"))
                            setDateConfirmed(new Date());
                    }

                }
            }
        }
    }

    @Override
    void calculatePrice() {
        double deliveryPrice;
        if (!(getShipToCity().equals("Киев")) && (getShipToCity().equals("Одесса"))) {
            deliveryPrice = 0.15 * getBasePrice();
        }
        else {
            deliveryPrice = 0.1 * getBasePrice();
        }

        if (getTotalPrice() > 1000) {
            setTotalPrice(getBasePrice() * 0.05 + deliveryPrice);
        }
        setTotalPrice(getBasePrice() + deliveryPrice);

    }
}
