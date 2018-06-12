package lesson25;

/**
 * Created by Ruslan on 12.06.2018.
 */
public class Order extends IdEntity{
    private long id;

    public Order(long id) {
        this.id = id;
    }

    @Override
    public long getId() {
        return id;
    }
}
