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

    /*
    Цена состоит из цены товара + цена за доставку. Есть скидки. Если доставка в любой город кроме, Киева и Одессы, то
    цена за доставку равна 15 % от суммы заказа. В других случаях равна 10 %. Так же, если цена заказа больше 1000,
    то скидка на заказ равна 5 % после оплаты комиссии за доставку.
1. Есть переменная на доставку.
2. Если городом доставки Киев или Одесса, то цена за доставку равно 10 %. В других случаях равно 15 %.
3.



    */
    @Override
    void calculatePrice() {
        double deliveryPrice;
        if ((getShipToCity().equals("Киев")) || (getShipToCity().equals("Одесса"))) {
            deliveryPrice = 0.1 * getBasePrice();
        }
        else {
            deliveryPrice = 0.15 * getBasePrice();
        }

        if (getBasePrice() > 1000) {
            setTotalPrice(getBasePrice()*0.95 + deliveryPrice);
        }
        else setTotalPrice(getBasePrice() + deliveryPrice);

    }
}
