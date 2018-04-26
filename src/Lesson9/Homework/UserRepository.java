package Lesson9.Homework;

import java.util.Arrays;

/**
 * Created by Ruslan on 14.03.2018.
 */
public class UserRepository {
    private User[] users = new User[10];

   /* public UserRepository(User[] users) {
        this.users = users;
    }*/

    public String[] getUserNames() {
        int index = 0;
        int i = 0;
        for (User user : users) {
            if (user == null || user.getName() == null)
                continue;
            else index++;
        }
        String[] result = new String[index];
        for (User user : users) {
            if (user == null || user.getName() == null)
                continue;
            else result[i++] = user.getName();
        }

        return result;
    }

    public long[] getUserIds() {
        int index = 0;
        int i = 0;
        for (User user : users) {
            if (user == null || user.getId() == 0)
                continue;
            else index++;
        }
        long[] result = new long[index];
        for (User user : users) {
            if (user == null || user.getId() == 0)
                continue;
            else result[i++] = user.getId();
        }

        return result;
    }

    public String getUserNameById(long id) {

        String a;
        for (User user : users) {
            if (user != null && user.getId() != 0 && id == user.getId())
                return a = user.getName();
            else continue;
        }

        return null;
    }

        /*String[] names = getUserNames().clone();
        long[] ids = getUserIds().clone();

        for (int j = 0; j < names.length; j++) {
            for (int i = 0; i < ids.length; i++) {
                if (id == ids[i])
                    a = names[j];
            }
        }*/


    public User getUserByName(String name) {
        if (name == null)
            return null;
        for (User user : users) {

            if (user == null || user.getName() == null) {
                continue;
            }
            if (name == user.getName())
                return user;
        }
        return null;
    }

    public User findById(long id) {
        if (id == 0)
            return null;
        for (User user : users) {
            if (user == null || user.getId() == 0) {
                continue;
            }
            if (id == user.getId())
                return user;
        }
        return null;
    }

    public User getUserBySessionId(String sessionId) {
        if (sessionId == null)
            return null;
        for (User user : users) {

            if (user == null || user.getSessionId() == null) {
                continue;
            }
            if (sessionId == user.getName())
                return user;
        }
        return null;
    }

    public User save(User user) {

        if (user == null)
            return null;

        if (findById(user.getId()) != null || user.getId() == 0)
            return null;

        int sells = 0;
        for (User user123 : users) {
            if (user123 != null)
                sells++;
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


        /*for (int j = 0; j < users.length; j++) {

            if (findById(user.getId()) != null && findById(users[j].getId()) != null)
                if (user.getId() == users[j].getId())
                    return null;
        }
        for (int i = 0; i < users.length; i++) {
            if (users[i] == null) {
                users[i] = user;
                return user;
            }
        }*/


    public void delete(long id) {
        for (int i = 0; i < users.length; i++) {
            if (users[i] != null && id != 0) {
                if (id == users[i].getId()) {
                    users[i] = null;
                }
            }
        }
    }

    public User update(User user) {

        for (int j = 0; j < users.length; j++) {
            if (findById(user.getId()) != null) {
                if (user.getId() == users[j].getId()) {
                    users[j] = user;
                    return users[j];
                }
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return "UserRepository{" +
                "users=" + Arrays.toString(users) +
                '}';
    }

    public User[] getUsers() {
        return users;
    }

}