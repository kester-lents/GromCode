package lesson11.Homework;

/**
 * Created by Ruslan on 05.04.2018.
 */
public class Controller {
    API[] apis;

    public Controller(API[] apis) {
        this.apis = apis;
    }

    public Room[] requestRooms(int price, String city, String hotel) {
        int index = 0;
        int i = 0;
        int a = 0;
        int e = 0;
        for (API api : apis) {
            for (Room room : api.getAll()) {
                if ((apis[i] != null) && (room != null)) {
                    if (room.getPrice() == price && room.getCityName().equals(city)
                            && room.getHotelName().equals(hotel)) {
                        index++;
                    }
                }
                i++;
            }
        }
        Room[] result = new Room[index];
        for (API api : apis) {
            for (Room room2 : api.getAll()) {
                if ((apis[i] != null) && (room2 != null)) {
                    if (room2.getPrice() == price && room2.getCityName().equals(city)
                            && room2.getHotelName().equals(hotel)) {
                        result[a] = api.getAll()[e];
                        a++;
                    }
                }
                e++;
            }
        }
        return result;
    }

    public Room[] check(API api1, API api2) {
        return new Room[0];
    }


}