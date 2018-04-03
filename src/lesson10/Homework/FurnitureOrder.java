package lesson10.Homework;

import java.util.Date;

/**
 * Created by Ruslan on 02.04.2018.
 */
public class FurnitureOrder extends Order {
    private String furnitureCode;

    public FurnitureOrder(String itemName, Date dateCreated, String shipFromCity,
                          String shipToCity, int basePrice, Customer customerOwned, String furnitureCode) {
        super(itemName, dateCreated, shipFromCity, shipToCity, basePrice, customerOwned);
        this.furnitureCode = furnitureCode;
    }

    @Override
    void validateOrder() {
        String[] cities = new String[]{"Киев", "Львов"};
        for (String city : cities) {
            if (city.equals(getShipFromCity())) {
                if (getBasePrice() >= 500) {
                    if (!(getCustomerOwned().getName().equals("Тест"))) {
                        setDateConfirmed(new Date());
                    }
                }
            }
        }
    }


    @Override
    void calculatePrice() {
        double deliveryPrice;
        if (getBasePrice() < 5000)
            deliveryPrice = getBasePrice() * 0.95;
        else deliveryPrice = getBasePrice() * 0.98;

        setTotalPrice(getBasePrice() + deliveryPrice);

    }

    public String getFurnitureCode() {
        return furnitureCode;
    }
}
