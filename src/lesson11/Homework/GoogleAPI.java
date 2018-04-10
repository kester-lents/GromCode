package lesson11.Homework;

import java.util.Arrays;

/**
 * Created by Ruslan on 05.04.2018.
 */
public class GoogleAPI implements API {
    Room[] rooms;

    public GoogleAPI(Room[] rooms) {
        this.rooms = rooms;
    }

    /*
    Ищет строго по параметрам.

    */

    public String toString() {
        return Arrays.toString(rooms);
    }

    @Override
    public Room[] findRooms(int price, int persons, String city, String hotel) {
        int index = 0;
        int i = 0;
        Room[] result = new Room[getAll().length];
        for (Room room : rooms) {
            if (rooms[i] != null) {
                if (room.getPrice() == price && room.getPersons() == persons && room.getCityName().equals(city)
                        && room.getHotelName().equals(hotel)) {
                    result[index] = rooms[i];
                    index++;
                }
                i++;
            }
        }

        return result;
    }

    @Override
    public Room[] getAll() {

        return rooms;
    }
}
