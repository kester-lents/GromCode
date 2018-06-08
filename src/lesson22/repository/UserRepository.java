package lesson22.repository;

/**
 * Created by Ruslan on 25.04.2018.
 */
public class UserRepository {
   /* User user = new User(1234, "Qwerty", "324");
    User user2 = new User(1231, "Qwerty", "324");
    User user3 = new User(100, "Ruslan", "123");
    User user4 = new User(1235434, "Qwerty", "324");
    User user5 = new User(1232, "Qwerty546", "324");
    User user6 = null;
    User user7 = null;
    User user8 = new User(1001, "Ruslan", "123");
    User user9 = null;
    User user10 = null;*/
    private static User[] users = new User[10]/*{user, user2, user3, user4, user5, user6, user7, user8, user9, user10}*/;

    //User save
    //если входящий юзер налл - тогда налл
    //объекты(юзеры) равны, если работает equals
    //если индекс


    public static User save(User user) {
        if (user == null)
            return null;

        int sells = 0;
        for (User user123 : users) {
            if (user123 != null) {
                if (user.equals(user123)) {
                    return null;
                }
                sells++;

            }
        }
        if (sells > users.length - 1)
            return null;

        int index = 0;
        for (User user2 : users) {
            if (user2 == null) {
                users[index] = user;
                break;
            }
            index++;
        }
        return user;
    }

    //User update - обновляет и перезаписывает

    public static User update(User user) {
        if (user == null)
            return null;
        if (userFindById(user.getId()) == null)
            return null;
        if (user.equals(userFindById(user.getId())))
            return null;
        int index = 0;
        for (User user1 : users) {
            if (user1 != null) {
                if (user.getId() == user1.getId()) {
                    users[index] = user;
                    return users[index];
                }
            }
            index++;
        }

        return null;
    }

    //delete - ничего не возращает, а только удаляет юзера, найденного по айди
    //если айди не равно нулю
    //юзера ищем по айди с помощью пред.метода
    //если юзер в массиве равен налл


    public static void delete(long id) {
        if (id == 0)
            return;
        for (User user : users) {
            if (user == null || userFindById(id) == null || user.getId() == 0)
                return;
            if (user.getId() == id) {
                user = null;
                return;
            }
        }
    }
    //User UserFindById
    //Если айди 0
    //Ищем по массиву, есть ли такой юзер с таким айди
    //Если айди юзера = 0

    public static User userFindById(long id) {
        if (id == 0)
            return null;
        for (User user : users) {
            if (user != null && user.getId() != 0) {
                if (id == user.getId())
                    return user;
            }
        }
        return null;
    }

    public static User[] getUsers() {
        return users;
    }
}







