package lesson22.repository;

import java.util.ArrayList;

/**
 * Created by Ruslan on 25.04.2018.
 */
public class UserRepository {
    public static ArrayList<User> list = new ArrayList<>();

    public static User save(User user) {
        if (list.isEmpty()) {
            list.add(user);
            return user;
        }
        if (user == null)
            return null;

        int index = 0;
        for (User user2 : list) {
            if (user2 == null) {
                list.set(index, user);
                return user;
            }
            index++;
        }
        list.add(user);
        return user;
    }

    public static User update(User user) {
        if (user == null || userFindById(user.getId()) == null || user.equals(userFindById(user.getId())))
            return null;

        int index = 0;
        for (User user1 : list) {
            if (user1 != null) {
                if (user.getId() == user1.getId()) {
                    list.set(index, user);
                    return list.get(index);
                }
            }
            index++;
        }
        return null;
    }

    public static void delete(long id) {
        if (id == 0)
            return;
        int index = 0;
        for (User user : list) {
            if (user != null && userFindById(id) != null) {
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
            if (user != null && user.getId() != 0) {
                if (id == user.getId())
                    return user;
            }
        }
        return null;
    }

    public static ArrayList<User> getUsers() {
        return list;
    }
}
