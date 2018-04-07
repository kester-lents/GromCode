package lesson11.Homework;

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
        int i = 0;
        getAll();

        for (Room room : rooms) {
            if (price == room.getPrice() && persons == room.getPersons() && room.getCityName().equals(city)
                    && room.getHotelName().equals(city) && rooms[i] != null) {
                getAll()[i] = room;
            }
            i++;
        }

        return getAll();
    }

    @Override
    public Room[] getAll() {
        int i = 0;
        int index = -1;
        for (Room room : rooms) {
            if (room != null)
                index++;
        }
        Room[] result = new Room[index];

        for (Room room : rooms) {
            if (rooms[i] != null) {
                result[i] = room;
            }
            i++;
        }
        return result;
    }
}
