package lesson22.repository;

import java.util.ArrayList;

/**
 * Created by Ruslan on 25.04.2018.
 */
public class UserRepository {
    public static ArrayList<User> list = new ArrayList<>();

    public static User save(User user) {
        if (user == null)
            return null;
        for (User user2 : list) {
            if (user2 != null && user2.equals(user)) //проверка на дубли
                return null;
        }
        int index = 0;
        for (User user1 : list) {
            if (user1 == null) {
                list.set(index, user); // по синтаксису правильно. индекс элемента также нужен.
                return user;
            }
            index++;
        }
        list.add(user); //на случай, если изначальный лист пустой
        return user;
    }

    public static User update(User user) {
        if (user == null || userFindById(user.getId()) == null)
            return null;

        int index = 0;
        for (User user1 : list) {
            if (user1 != null && user.getId() == user1.getId()) {
                list.set(index, user);
                return list.get(index);
            }
            index++;
        }
        return null;
    }

    public static void delete(long id) {
        if (id == 0 || userFindById(id) == null)
            return;
        int index = 0;
        for (User user : list) {
            if (user != null) {
                if (user.getId() == id) {
                    list.remove(index);
                    return;
                }
                index++;
            }
        }
    }


    public static User userFindById(long id) {
        if (id == 0)
            return null;
        for (User user : list) {
            if (user != null && id == user.getId()) {
                return user;
            }
        }
        return null;
    }

    public static ArrayList<User> getUsers() {
        return list;
    }
}
