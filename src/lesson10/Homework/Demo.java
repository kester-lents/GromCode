package lesson10.Homework;

import java.util.Date;

/**
 * Created by Ruslan on 03.04.2018.
 */
public class Demo {
    public static void main(String[] args) {

        System.out.println();
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
            eo.validateOrder();

        /*eo.validateOrder();
        eo.calculatePrice();
        eo.confirmShipping();

        eo2.validateOrder();
        eo2.calculatePrice();
        eo2.confirmShipping();

        fo.validateOrder();
        fo.calculatePrice();
        fo.confirmShipping();

        fo2.validateOrder();
        fo2.calculatePrice();
        fo2.confirmShipping();*/

    }
}
