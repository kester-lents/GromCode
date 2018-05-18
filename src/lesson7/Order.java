package lesson7;


import java.util.Date;

/**
 * Created by Ruslan on 15.06.2017.
 */
public class Order {

    long id;
    int price;
    Date dateCreated;
    boolean isConfirmed;
    Date dateConfirmed;
    String city;
    String country;
    String type;

    public Order(int price, Date dateCreated, boolean isConfirmed, Date dateConfirmed, String city, String country, String type) {
        this.price = price;
        this.dateCreated = dateCreated;
        this.isConfirmed = isConfirmed;
        this.dateConfirmed = dateConfirmed;
        this.city = city;
        this.country = country;
        this.type = type;
    }

    public Order() {
    }

    void confirmOrder() {
        if (!isConfirmed) {
            dateConfirmed = new Date();
            isConfirmed = true;
        }
    }

    boolean checkPrice() {
        return price > 1000 ? true : false;
    }

    boolean isValidType() {
        if (type == "Buy" | type == "Sale")
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        DemoHomeWork demo1 = new DemoHomeWork();
        demo1.createOrder();
        demo1.createOrderAndCallMethods();
    }

}


/*
* Date dateCreated;
* Order.java:11: error: cannot find symbol Date dateCreated; ^ symbol: class Date location: class Order
* Date dateConfirmed;
* Compilation error: /Order.java:13: error: cannot find symbol Date dateConfirmed; ^ symbol: class Date location: class Order
* public Order(int price, Date dateCreated, boolean isConfirmed, Date dateConfirmed, String city, String country, String type) {
* Compilation error: /Order.java:18: error: cannot find symbol public Order(int price, Date dateCreated, boolean isConfirmed, Date dateConfirmed, String city, String country, String type) { ^ symbol: class Date location: class Order
*this.dateCreated = new Date();
* Compilation error: /Order.java:20: error: cannot find symbol this.dateCreated = new Date(); ^ symbol: class Date location: class Order
*  dateConfirmed = new Date();
*  Compilation error: /Order.java:34: error: cannot find symbol dateConfirmed = new Date(); ^ symbol: class Date location: class Order
*  * */


















