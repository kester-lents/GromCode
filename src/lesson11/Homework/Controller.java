package lesson11.Homework;


public class Controller {
    private API[] apis;

    public Controller(API[] apis) {
        this.apis = apis;
    }


    public Room[] requestRooms(int price, int persons, String city, String hotel) {
        int index = 0;
        int index2 = 0;

        for (API api : apis) {
            index += api.findRooms(price, persons, city, hotel).length;
        }

        Room[] result = new Room[index];
        for (API api : apis) {
            for (Room room : api.findRooms(price, persons, city, hotel)) {
                if (api != null) {
                    result[index2++] = room;
                }
            }
        }
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
        return result;
    }

    public Room[] check(API api1, API api2) {
        int i = 0;
        int a = 0;
        int length = 0;
        Room[] rooms1 = api1.findRooms(api1.getAll()[i].getPrice(), api1.getAll()[i].getPersons(),
                api1.getAll()[i].getCityName(), api1.getAll()[i].getHotelName());
        Room[] rooms2 = api2.findRooms(api2.getAll()[a].getPrice(), api2.getAll()[a].getPersons(),
                api2.getAll()[a].getCityName(), api2.getAll()[a].getHotelName());
        for (Room room2 : rooms2) {
            for (Room room : rooms1) {
                if (room2 != null & room != null) {
                    if (room == room2) {
                        length++;
                    }
                }
                i++;
            }
            a++;
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

        Room[] result = new Room[length];

        int r = 0;
        for (Room room2 : rooms2) {
            for (Room room : rooms1) {
                if (room2 != null & room != null) {
                    if (room == room2) {
                        result[r++] = api1.getAll()[i];
                    }
                }
                i++;
            }
            a++;
        }
        return result;

    }

}