package lesson10.Homework;

import java.util.Date;

/**
 * Created by Ruslan on 03.04.2018.
 */
public class Demo {
    public static void main(String[] args) {

        ElectronicsOrder eo = new ElectronicsOrder("smartphone", new Date(), "Киев",
                "Киев", 10001, new Customer("Руслан", "Lviv", "Женский"), 12);
        FurnitureOrder fo = new FurnitureOrder("stuff", new Date(), "Киев",
                "ddfgd", 10000, new Customer("dfgdf", "London",
                "Woman"), "some code");
        ElectronicsOrder eo2 = new ElectronicsOrder("smartphone", new Date(), "Киев",
                "Киев", 10001, new Customer("Руслан", "Lviv", "Женский"), 12);
        FurnitureOrder fo2 = new FurnitureOrder("stuff", new Date(), "Киев",
                "ddfgd", 10000, new Customer("dfgdf", "London",
                "Woman"), "some code");
        eo.validateOrder();
        eo.calculatePrice();
        eo2.validateOrder();
        eo2.calculatePrice();
        fo.validateOrder();
        fo.calculatePrice();
        fo2.validateOrder();
        fo2.calculatePrice();


        //FurnitureOrder calculatePrice
        //верно ли считает по условиям +
        //сумма заказа не может быть <=0
        //    fo.calculatePrice();

        //ElectronicsOrder calculatePrice
        //город доставки не может быть налл +
        //верно ли считает по условиям -
        //цена за заказ не может быть <=0
        //eo.calculatePrice();

        //ElectronicsOrder validateOrder
        //соблюдаются ли условия, ставитися ли датаКонфирмед в конце ?+
        //если customer налл или имя кастомера налл +
        //Если города доставки и отправки разные+
        //eo.validateOrder();

        //FurnitureOrder validateOrder
        //соблюдаются ли условия, ставитися ли датаКонфирмед в конце +
        //если customer налл или (имя кастомера налл или Тест) +
        //Если не подходит город отправки или город получения налл +
        //Проверка пола на налл +
        //fo.validateOrder();
    }
}
