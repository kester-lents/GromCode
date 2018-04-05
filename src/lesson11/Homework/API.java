package lesson11.Homework;

/**
 * Created by Ruslan on 05.04.2018.
 */
public interface API {

    Room [] findRooms(int price, int persons, String city, String hotel);
    Room [] getAll();

}
