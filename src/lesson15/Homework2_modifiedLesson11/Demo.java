package lesson15.Homework2_modifiedLesson11;

import java.util.Date;

/**
 * Created by Ruslan on 05.04.2018.
 */
public class Demo {
    public static void main(String[] args) {


        Room[] rooms = new Room[5];
        rooms[0] = new Room(12, 4, 5, new Date(), "L", "SA");
        rooms[1] = new Room(121, 4, 4, null, "L", "SA");
        rooms[2] = new Room(121, 3, 3, null, "L", "SA");
        rooms[3] = null;
        rooms[4] = new Room(222, 4, 5, new Date(), "L", "SA");
        Room[] rooms2 = new Room[5];
        rooms2[0] = new Room(121, 4, 5, new Date(), "L", "SA");
        rooms2[1] = new Room(121, 4, 4, null, "L", "SA");
        rooms2[2] = new Room(121, 3, 3, null, "L", "SA");
        rooms2[3] = null;
        rooms2[4] = new Room(333, 45, 5, null, "L", "SA");
        Room[] rooms3 = new Room[5];
        rooms3[0] = new Room(121, 4, 5, null, "L", "SA");
        rooms3[1] = new Room(121, 4, 4, null, "L", "SA");
        rooms3[2] = new Room(121, 3, 3, null, "L", "SA");
        rooms3[3] = null;
        rooms3[4] = new Room(444, 45, 5, null, "L", "SA");
        GoogleAPI googleAPI = new GoogleAPI(rooms);
        TripAdvisorAPI tripAdvisorAPI = new TripAdvisorAPI(rooms2);
        BookingComAPI bookingComAPI = new BookingComAPI(rooms3);
        Controller controller = new Controller(new API[]{googleAPI, tripAdvisorAPI, null});

        //test Controller check
        // System.out.println(Arrays.toString(controller.check(googleAPI,tripAdvisorAPI)));
        //выводится ли результат +
        //если одна из АПИ налл +
        //если одна из комнат налл+

        //Test Controller requestRooms
        //выводятся ли резалт по всем имплементациям +
        //если имплементация налл +
        //выполняются ли проверки+
        //System.out.println(Arrays.toString(controller.requestRooms(45, 5, "SA","L")));

        //TripAdvisorAPI findRooms
        //выводит ли комнаты +
        //проверка на налл комнаты +
        //соблюдаются ли условия, и ищутся ли персонс в диапазоне +
        //TripAdvisorAPI tripApi = new TripAdvisorAPI(rooms);
        //System.out.println(Arrays.deepToString(tripApi.findRooms(0,4,"SA","L")));

        //GoogleAPI findRooms
        //выводит ли комнаты +
        //если одна из комнат в массиве налл +
        //соблюдает ли условия +
        //GoogleAPI gooApi = new GoogleAPI(rooms);
        //System.out.println(Arrays.deepToString(gooApi.findRooms(151,5,"SA","L")));

        //BookingComAPI findRoom
        //выводит ли комнаты +
        //если одна из комнат в массиве налл +
        //находит ли все комнаты, отличающиеся по цене (цена не может быть <0)  +
        // BookingComAPI bookAPI = new BookingComAPI(rooms);
        //System.out.println(Arrays.deepToString(bookAPI.findRooms(50,5,"SA","L")));
        //1. Сначала условия все, кроме цены.
        //2. Цена в диапазоне.

        //bookAPI.getAll() во всех иимплементациях не нуждается в тестах
    }


}
