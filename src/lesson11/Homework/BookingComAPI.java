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
        int index = 0;
        int i = 0;
        int a = 0;
        int e = 0;

        for (Room room : rooms) {
            if (rooms[i] != null) {
                if (((price >= room.getPrice() - 100) || price <= room.getPrice() + 100) &&
                room.getPersons() == persons && room.getCityName().equals(city)
                        && room.getHotelName().equals(hotel)){
                    index++;
                }
            }
            i++;
        }
        Room[] result = new Room[index];
        for (Room room2 : rooms) {
            if (rooms[e] != null) {
                if (((price >= room2.getPrice() - 100) || price <= room2.getPrice() + 100) &&
                        room2.getPersons() == persons && room2.getCityName().equals(city)
                        && room2.getHotelName().equals(hotel)){
                    result[a] = rooms[e];
                    a++;
                }
            }
            e++;
        }

        return result;

    }

    @Override
    public Room[] getAll() {
        return rooms;
    }
}
