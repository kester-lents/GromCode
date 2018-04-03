package lesson10.Homework;

import java.util.Arrays;
import java.util.Date;

/**
 * Created by Ruslan on 03.04.2018.
 */
public class Demo {
    public static void main(String[] args) {

        ElectronicsOrder eo = new ElectronicsOrder("smartphone", new Date(), "London",
                "Kiev", 123, new Customer("Ruslan", "Lviv", "Man"),
                12);
        ElectronicsOrder eo2 = new ElectronicsOrder("smartphone", new Date(), "London",
                "Kiev", 123, new Customer("Ruslan", "Lviv", "Man"),
                12);
        FurnitureOrder fo = new FurnitureOrder("stuff", new Date(), "Bristol",
                "Paris", 343, new Customer("Andrey", "London",
                "Woman"), "some code");
        FurnitureOrder fo2 = new FurnitureOrder("stuff", new Date(), "Bristol",
                "Paris", 343, new Customer("Andrey", "London",
                "Woman"), "some code");
        eo.confirmShipping();
        eo.validateOrder();
        eo.calculatePrice();

        eo2.confirmShipping();
        eo2.validateOrder();
        eo2.calculatePrice();

        fo.confirmShipping();
        fo.validateOrder();
        fo.calculatePrice();

        fo2.confirmShipping();
        fo2.validateOrder();
        fo2.calculatePrice();

    }
}
