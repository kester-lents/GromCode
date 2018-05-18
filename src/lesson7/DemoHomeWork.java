package lesson7;

import java.util.Date;

/**
 * Created by Ruslan on 22.08.2017.
 */

public class DemoHomeWork {


    public static Order createOrder() {
        Order ob1 = new Order(100, new Date(), false, null, "Dnepr", "Ukraine", "Buy");
        return ob1;
    }

    public static Order createOrderAndCallMethods() {
        Order ob2 = new Order(100, new Date(), true, new Date(), "Kiev", "Ukraine", "SomeValue");
        ob2.confirmOrder();
        ob2.checkPrice();
        ob2.isValidType();
        return ob2;
    }
}

/*Order ob1 = new Order (100, new Date(), false, null, "Dnepr", "Ukraine","Buy" );
Compilation error: /DemoHomeWork.java:5: error: cannot find symbol Order ob1 = new Order (100, new Date(), false, null, "Dnepr", "Ukraine","Buy" ); ^ symbol: class Date location: class DemoHomeWork
Order ob2 = new Order(100, new Date(),  true, new Date(), "Kiev",  "Ukraine",  "SomeValue");
Compilation error: /DemoHomeWork.java:10: error: cannot find symbol Order ob2 = new Order(100, new Date(), true, new Date(), "Kiev", "Ukraine", "SomeValue"); ^ symbol: class Date location: class DemoHomeWork
** */