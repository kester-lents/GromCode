package lesson8.phones;

/**
 * Created by Ruslan on 06.09.2017.
 */
public class Demo {
    public static void main(String[] args) {
    IPhone iPhone = new IPhone(110,10.0,"China", true);
    iPhone.deleteIphoneFromDb();
    iPhone.orderPhone();
    }

}
