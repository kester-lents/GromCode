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
        Room [] result = new Room[length];
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
        return new Room[0];
    }


}