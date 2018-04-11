package lesson11.Homework;

/**
 * Created by Ruslan on 05.04.2018.
 */
public class Controller {
    API[] apis;

    public Controller(API[] apis) {
        this.apis = apis;
    }


    public Room[] requestRooms(int price, int persons, String city, String hotel) {
        int index = 0;
        int i = 0;
        int length = -1;
        for (API api : apis) {
            for (Room room : api.getAll()) {
                if (apis[index] != null && api.getAll()[i] != null)
                    if (api.findRooms(price, persons, city, hotel)[index] == api.getAll()[i]) {
                        length++;
                    }
                i++;
            }
            index++;
        }
        Room[] result = new Room[length];
        int a = 0;
        int b = 0;
        int z = 0;
        for (API api : apis) {
            for (Room room : api.getAll()) {
                if (apis[a] != null && api.getAll()[b] != null)
                    if (api.findRooms(price, persons, city, hotel)[a] == api.getAll()[b]) {
                        result[z] = api.getAll()[b];
                        z++;
                    }
                b++;
            }
            a++;
        }

        return result;
    }

    public Room[] check(API api1, API api2) {
        int i = 0;
        int a = 0;
        int length = 0;
        for (API api : apis) {
            for (Room room : api.getAll()) {
                if (apis[i] != null && api.getAll()[a] != null) {
                    if (api1.getAll()[i].getPersons() == api2.getAll()[a].getPersons() &&
                            api1.getAll()[i].getPrice() == api2.getAll()[a].getPrice() &&
                            api1.getAll()[i].getHotelName().equals(api2.getAll()[a].getHotelName()) &&
                            api1.getAll()[i].getCityName().equals(api2.getAll()[a].getCityName()) &&
                            api1.getAll()[i].getId() != api2.getAll()[a].getId() /*&&
                            api1.getAll()[i].getDateAvailableFrom() != api2.getAll()[a].getDateAvailableFrom()*/) {
                        length++;
                    }
                }
                a++;
            }
            i++;
        }
        Room[] result = new Room[length];
        int q = 0;
        int w = 0;
        int r = 0;
        for (API api11 : apis) {
            for (Room room : api11.getAll()) {
                if (apis[q] != null && api11.getAll()[w] != null) {
                    if (api1.getAll()[q].getPersons() == api2.getAll()[w].getPersons() &&
                            api1.getAll()[q].getPrice() == api2.getAll()[w].getPrice() &&
                            api1.getAll()[q].getHotelName().equals(api2.getAll()[w].getHotelName()) &&
                            api1.getAll()[q].getCityName().equals(api2.getAll()[w].getCityName()) &&
                            api1.getAll()[q].getId() != api2.getAll()[w].getId() /*&&
                            api1.getAll()[q].getDateAvailableFrom() != api2.getAll()[w].getDateAvailableFrom()*/) {
                        result[r] = api1.getAll()[q];
                    }
                }
                w++;
            }
            q++;
        }
        return result;

    }

}