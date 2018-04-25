package lesson15.HomeWork;

import java.util.Arrays;

/**
 * Created by Ruslan on 25.04.2018.
 */
public class UserRepository {
    private User[] users = new User[10];

    public UserRepository(User[] users) {
        this.users = users;
    }
//User save
    //если входящий юзер налл - тогда налл
    //объекты(юзеры) равны, если работает equals
    //если индекс

    public User save(User user) {
        if (user == null) {
            return null;
        }
        int index = 0;
        for (User user1 : users) {
            if (user.equals(user1))
                return null;
            else index++;
            if (index == 9)
                return null;
            for (User user2: users) {
                if (user2 == null)
                    user2 = user;
            }

        }


        return null;
    }

    //User update - обновляет и перезаписывает

    public User update(User user) {
        if (user == null)
            return null;
        for (User user1 : users) {
           if (user1.equals(user));
            user1 = user;
            return user1;
        }

        return null;
    }

    //delete - ничего не возращает, а только удаляет юзера, найденного по айди
    //если айди не равно нулю
    //юзера ищем по айди с помощью пред.метода
    //если юзер в массиве равен налл


    public void delete(long id) {
        if (id == 0)
            return;
        for (User user : users) {
            if (user == null || UserfindById(id) == null)

                if (user == UserfindById(id)) {
                    user = null;
                    break;
                }
        }


    }
//User UserFindById
    //Если айди 0
    //Ищем по массиву, есть ли такой юзер с таким айди
    //Если айди юзера = 0

    public User UserfindById(long id) {
        if (id == 0)
            return null;
        for (User user : users) {
            if (user.getId() == id && user.getId() != 0)
                return user;
        }
        return null;
    }

}







