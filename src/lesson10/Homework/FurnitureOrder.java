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
    public void validateOrder() {
       /* String[] cities = new String[]{"Киев", "Львов"};
        for (String city : cities) {
            if (city.equals(getShipFromCity())) {
                if (getBasePrice() >= 500) {
                    if (!(getCustomerOwned().getName().equals("Тест"))) {
                        setDateConfirmed(new Date());
                    }
                }
            }
        }
    }*/
        if (getCustomerOwned() == null || getCustomerOwned().getName() == null ||
                getCustomerOwned().getName() == "Тест" ||
                        getCustomerOwned().getGender() == null)
            return;

        String[] citiesFromCity = new String[]{"Киев", "Львов"};
        int i = 0;
        for (String city : citiesFromCity) {
            if (city == getShipFromCity()) {
                break;
            } else if (i != 1) {
                i++;
                continue;
            } else return;
        }
        if (getShipToCity() == null)
            return;
        if (getBasePrice() >= 500) {
            setDateConfirmed(new Date());
        }
    }

    @Override
    public void calculatePrice() {
        if (getBasePrice() < 5000 && getBasePrice() > 0) {
            setTotalPrice(getBasePrice() * 1.05);
        } else {
            setTotalPrice(getBasePrice() * 1.02);
        }
    }

    public String getFurnitureCode() {
        return furnitureCode;
    }
}
