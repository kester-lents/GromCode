package lesson15.Homework2;


import java.util.Arrays;

public class Controller {

    private API[] apis;

    public Controller(API[] apis) {
        this.apis = apis;
    }


    public Room[] requestRooms(int price, int persons, String city, String hotel) {

        int index = 0;
        int index2 = 0;

        for (API api : apis) {
            if (api == null)
                continue;
            for (Room room : api.findRooms(price, persons, city, hotel)) {
                index++;
            }
        }

        Room[] result = new Room[index];
        for (API api : apis) {
            if (api == null)
                continue;
            for (Room room : api.findRooms(price, persons, city, hotel)) {
                result[index2++] = room;
                System.out.println(Arrays.toString(result));
            }
        }

        return result;
    }


    public Room[] check(API api1, API api2) {
        int length = 0;
        if (api1 == null || api2 == null)
            return null;
        for (Room room2 : api2.getAll()) {
            for (Room room : api1.getAll()) {
                if (room2 != null && room != null) {
                    if (room.equals(room2) && room.hashCode() == room2.hashCode() &&
                            room.getId() != room2.getId() &&
                            room.getDateAvailableFrom() != room2.getDateAvailableFrom()) {
                        length++;
                    }
                }
            }
        }

        Room[] result = new Room[length];
        int r = 0;
        for (Room room2 : api2.getAll()) {
            for (Room room : api1.getAll()) {
                if (room2 != null && room != null) {
                    if (room.equals(room2) && room.hashCode() == room2.hashCode() &&
                            room.getId() != room2.getId() &&
                            room.getDateAvailableFrom() != room2.getDateAvailableFrom()) {
                        result[r++] = room;
                    }
                }
            }
        }
        return result;
    }

}
  /*if (api1.getAll()[i].getPersons() == api2.getAll()[a].getPersons() &&
                            api1.getAll()[i].getPrice() == api2.getAll()[a].getPrice() &&
                            api1.getAll()[i].getHotelName().equals(api2.getAll()[a].getHotelName()) &&
                            api1.getAll()[i].getCityName().equals(api2.getAll()[a].getCityName()) &&
                            api1.getAll()[i].getId() != api2.getAll()[a].getId() &&
                            api1.getAll()[i].getDateAvailableFrom() != api2.getAll()[a].getDateAvailableFrom()) {
                        length++;
                    }
                }
                i++;
            }
            a++;
        }*/
   /*Room [] rooms = api.findRooms(price, persons, city, hotel);
            for (Room room : rooms) {
                if (apis[index] != null && room != null)
                    if (rooms[index] == api.getAll()[i]) {
                        length++;
                    }
                i++;
            }
            index++;
        }*/
        /*
        int a = 0;
        int b = 0;
        int z = 0;
        for (API api : apis) {
            Room [] rooms = api.findRooms(price, persons, city, hotel);
            for (Room room : rooms) {
                if (apis[a] != null && room != null)
                    if (rooms[a] == api.getAll()[b]) {
                        result[z] = api.getAll()[b];
                        z++;
                    }
                b++;
            }
            a++;
        }
*/