package lesson11.Homework;

/**
 * Created by Ruslan on 05.04.2018.
 */
public class TripAdvisorAPI implements API {
    Room [] rooms;

    public TripAdvisorAPI(Room[] rooms) {

        this.rooms = rooms;
    }

    @Override
    public Room[] findRooms(int price, int persons, String city, String hotel) {
        return new Room[0];
    }

    @Override
    public Room[] getAll() {
        BookingComAPI bookingComAPI = new BookingComAPI(rooms);
        return bookingComAPI.getAll();
    }
}
