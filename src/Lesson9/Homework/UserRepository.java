package Lesson9.Homework;

import java.lang.reflect.Array;

/**
 * Created by Ruslan on 14.03.2018.
 */
public class UserRepository {
    private User[] users;

    public UserRepository(User[] users) {
        this.users = users;
    }

    public User[] getUsers() {
        return users;
    }

    public String[] getUserNames() {
        int i = 0;
        int size = Array.getLength(users);
        String[] array = new String[size];
        for (User user : users) {
            if (user != null)
                array[i] = user.getName();
            i++;
        }
        return array;
    }

    public long[] getUserIds() {
        int i = 0;
        int index = 0;
        for (User user : users) {
            if (user != null)
                i++;
        }
        long[] array = new long[i];
        for (User user2 : users) {
            if (index < i)
                array[index++] = user2.getId();
        }
        return array;
    }

    public String getUserNameById(long id) {
        String a = null;
        String[] names = getUserNames().clone();
        long[] ids = getUserIds().clone();

        for (int i = 0; i < ids.length; i++)
            if (id == ids[i])
                a = names[i];
        return a;
    }


    public User getUserByName(String name) {

        int count = 0;
        for (User user : users) {
            if (name == user.getName() /*user != null*/) {
                return users[count];
            } else return null;
        }

        return users[count];
    }

    public User findById(long id) {
        int i;
        for (i = 0; i < users.length; i++) {
            if (users[i] != null) {
                if (id == users[i].getId()) {
                    return users[i];
                }
            }
        }
        return null;
    }

    public User getUserBySessionId(String sessionId) {
        int count = 0;

        for (User user : users) {
            if (sessionId == user.getSessionId() /*&& user != null*/) {
                return users[count];
            } else return null;
        }

        return users[count];

    }

    public User save(User user) {
        for (int j = 0; j < users.length; j++) {
            if (findById(user.getId()) != null && findById(users[j].getId()) != null)
                if (user.getId() == users[j].getId())
                    return null;
        }
        for (int i = 0; i < users.length; i++) {
            if (users[i] == null) {
                users[i] = user;
                return user;
            }
        }
        return null;
    }

    public void delete(long id) {
        int i;
        for (i = 0; i < users.length; i++) {
            if (users[i] != null) {
                if (id == users[i].getId()) {
                    users[i] = null;
                }
            }
        }
    }

    public User update(User user) {
        for (int j = 0; j < users.length; j++) {
            if (findById(user.getId()) != null && findById(users[j].getId()) != null) {
                if (user.getId() == users[j].getId()) {
                    users[j] = user;
                    return users[j];
                }
            }
        }
        return null;
    }
}