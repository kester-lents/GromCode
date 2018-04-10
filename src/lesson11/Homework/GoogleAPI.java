package lesson11.Homework;

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

    @Override
    public Room[] findRooms(int price, int persons, String city, String hotel) {
        int index = 0;
        Room[] result = new Room[rooms.length];
        for (Room room : rooms) {
            if (room.getPrice() == price && room.getPersons() == persons && room.getCityName().equals(city)
                    && room.getHotelName().equals(hotel) && room != null) {
                result[index] = room;
                index++;
            }
        }

        return result;
    }

    @Override
    public Room[] getAll() {

        return rooms;
    }
}
