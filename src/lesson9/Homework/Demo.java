package lesson9.Homework;

import java.util.Arrays;

/**
 * Created by Ruslan on 19.03.2018.
 */
public class Demo {
    public static void main(String[] args) {
        User user = new User(123142, "Dood", "234325c");
        User user2 = new User(0, "Dood", "234325c");
        User user3 = null;
        User user4 = new User(123, "Dood", "234325c");
        UserRepository ur = new UserRepository(new User[]{user, user2, user3, user4});

        User test = new User(1234, "Dood", "234325c");

        System.out.println(ur.save(test));
        System.out.println(Arrays.deepToString(ur.getUsers()));


        //User save(User user)
        //если на вход налл +
        //на выходе Юзер?   +
        //если юзер есть в массиве +
        //если все ячейки заняты +
        //Sys.out.println(ur.save(test));
        /*1. Если на вход налл - ретурн налл.
        2. Если один из юзеров - налл, континью.
        3. Если есть також же юзер, найденный по айди, ретурн налл.

        1. Если один из юзеров массива - налл - сохранить юзера.
        */


       /* //test update
        //обновление юзера
        //когда нет юзера на обновление (ничего не должно происходить, но и не падать)
        //когда обновляем налл
        user = new User(199, "Ruslan", "sdfs");
        Sys.out.println(ur.update(user));
        Sys.out.println(Arrays.deepToString(ur.getUsers()));

        //delete
        //если id - 0
        //удаляется ли с массива
        //если нет совпадений по айди -
        ur.delete(0);
        Sys.out.println(Arrays.deepToString(ur.getUsers()));




        //test getUserBySessionId
        //идет ли на выход юзер +
        //если подается на вход налл +
        //если SessionId налл +
        //если юзер налл +
        Sys.out.println((ur.getUserBySessionId("234325c")));

        //test findById(long id)
        //то же самое, что и в предыдущем
        //идет ли на выход юзер +
        //если подается на вход налл +
        //если айди 0 или гетайди +
        //если юзер налл +
        //Sys.out.println(ur.findById(0));

        //test getUserByName(String name)
        //идет ли на выход юзер +
        //если подается на вход налл +
        //если имя юзера налл +
        //если юзер налл +
        Sys.out.println((ur.getUserByName(null)));

        //test getUserNameById(long id) - для получения имени пользователя по его id
        //в изначальной версии метода, которая, кстати, прошла на громкод, было много не учтено, и по сути,
        //она только частино правильная, ибо не было учтено неравенстве длинны масивов имен и айдишок

        //выводит ли имя пользователя +
        //если нет совпадений по id +
        //если айди пользователя и соответственно getId тоже - 0 (ибо может быть много совпадений)+
        Sys.out.println(Arrays.toString(ur.getUserNames()));
        Sys.out.println(Arrays.toString(ur.getUserIds()));
        Sys.out.println(ur.getUserNameById(1231421));

        //test getUserIds - метод для получения массива айдишок
        //выводит ли массив +
        //если айди - 0 +
        //если объект - налл +
        Sys.out.println(Arrays.toString(ur.getUserIds()));

        //test userRepository methods
        // getUserNames - для получения массива имен пользователей
        //выводит ли массив +
        //если имя юзера - налл +
        //если объект - налл +
        Sys.out.println(Arrays.toString(ur.getUserNames()));
*/

    }
}


