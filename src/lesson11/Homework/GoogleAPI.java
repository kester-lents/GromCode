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

    @Override
    public Room[] findRooms(int price, int persons, String city, String hotel) {
        int index = 0;
        int i = 0;
        int a = 0;
        int e = 0;
        for (Room room2 : rooms) {
            if (rooms[e] != null) {
                a++;
            }
            e++;
        }
        Room[] result = new Room[a];


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
