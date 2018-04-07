package lesson11.Homework;

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
        Room[] results = new Room[rooms.length];
        int index = 0;

        for (Room each : rooms) {
            if (each.getPrice() == price && each.getPersons() == persons &&
                    each.getCityName().equals(city) && each.getHotelName().equals(city) && rooms[index] != null) {
                results[index] = each;
                index++;
                if (each.getPrice() - 100 < 0)
                    if (each.getPrice() >= each.getPrice() - 100 && each.getPrice() <= each.getPrice() + 100)
                        results[index] = each;
                index++;
            }
        }


        return results;
    }

    @Override
    public Room[] getAll() {
        BookingComAPI bookingComAPI = new BookingComAPI(rooms);
        return bookingComAPI.getAll();
    }
}
