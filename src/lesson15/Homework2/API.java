package lesson15.Homework2;

/**
 * Created by Ruslan on 05.04.2018.
 */
public interface API {

    Room[] findRooms(int price, int persons, String city, String hotel);
    Room[] getAll();

}
