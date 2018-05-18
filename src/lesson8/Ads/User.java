package lesson8.Ads;

/**
 * Created by Ruslan on 13.09.2017.
 */
public class User extends  BaseEntity {
    String userName;
    String location;

    public User(long id, String userName, String location) {
        super (id);
        this.userName = userName;
        this.location = location;
    }
}
