package lesson15.Homework2_modifiedLesson11;

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

        for (Room room : rooms) {

            if (room == null) {
                continue;
            }

            if (room.getPersons() == persons && room.getCityName().equals(city)
                    && room.getHotelName().equals(hotel) && room.getPrice() == price) {
                index++;
            }
        }
        Room[] result = new Room[index];
        for (Room room : rooms) {
            if (room == null) {
                continue;
            }
            if (room.getPersons() == persons && room.getCityName().equals(city)
                    && room.getHotelName().equals(hotel) && room.getPrice() == price) {
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
