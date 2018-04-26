package lesson15.Homework2_modifiedLesson11;

/**
 * Created by Ruslan on 05.04.2018.
 */
public class TripAdvisorAPI implements API {
    Room[] rooms;

    public TripAdvisorAPI(Room[] rooms) {

        this.rooms = rooms;
    }

    @Override
    public Room[] findRooms(int price, int persons, String city, String hotel) {
        int index = 0;
        int i = 0;

        for (Room room : rooms) {
            if (persons <= 0)
                return null;
            if (room == null || room.getPersons() <= 0) {
                continue;
            }
            int max = persons + 1;
            int min = persons - 1;
            if (room.getPrice() == price && room.getCityName().equals(city)
                    && room.getHotelName().equals(hotel)) {
                if (room.getPersons() >= min && room.getPersons() >= 1 && room.getPersons() <= max)
                    index++;
            }
        }
        Room[] result = new Room[index];
        for (Room room : rooms) {
            if (persons <= 0)
                return null;
            if (room == null || room.getPersons() <= 0) {
                continue;
            }
            int max = persons + 1;
            int min = persons - 1;
            if (room.getPrice() == price && room.getCityName().equals(city)
                    && room.getHotelName().equals(hotel)) {
                if (room.getPersons() >= min && room.getPersons() >= 1 && room.getPersons() <= max)
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
