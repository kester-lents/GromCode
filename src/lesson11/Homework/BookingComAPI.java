package lesson11.Homework;

import java.util.Arrays;

/**
 * Created by Ruslan on 05.04.2018.
 */
public class BookingComAPI implements API {
    Room[] rooms;

    public BookingComAPI(Room[] rooms) {
        this.rooms = rooms;
    }


    @Override
    public Room[] findRooms(int price, int persons, String city, String hotel) {
        int index = 0;
        int i = 0;

        for (Room room : rooms) {
            if (price < 0)
                return null;
            if (room == null || room.getPrice() < 0) {
                continue;
            }
            int max = price + 100;
            int min = price - 100;
            if (room.getPersons() == persons && room.getCityName().equals(city)
                    && room.getHotelName().equals(hotel)) {
                if (room.getPrice() >= min && room.getPrice() >= 0 && room.getPrice() <= max)
                    index++;
            }
        }
        Room[] result = new Room[index];
        for (Room room : rooms) {
            if (price < 0)
                return null;
            if (room == null || room.getPrice() < 0) {
                continue;
            }
            int max = price + 100;
            int min = price - 100;
            if (room.getPersons() == persons && room.getCityName().equals(city)
                    && room.getHotelName().equals(hotel)) {
                if (room.getPrice() >= min && room.getPrice() >= 0 && room.getPrice() <= max)
                    result[i++] = room;
            }
        }
        return result;
    }

    @Override
    public Room[] getAll() {
        return rooms;
    }
}
