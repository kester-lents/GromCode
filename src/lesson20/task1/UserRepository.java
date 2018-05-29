package lesson20.task1;

import lesson20.task1.exception.BadRequestException;
import lesson20.task1.exception.InternalServelException;
import lesson20.task1.exception.UserNotFoundException;

/**
 * Created by Ruslan on 14.03.2018.
 */
public class UserRepository {
    private User[] users /*= new User[10]*/;

    public UserRepository(User[] users) {
        this.users = users;
    }


    public User save(User user) throws Exception {

        if (user == null)
            throw new BadRequestException("can't save null user");
        try {
            findById(user.getId());
            throw new BadRequestException("User with id " + user.getId() + " already exist");
        } catch (UserNotFoundException e) {
            System.out.println("User with id " + user.getId() + " not found. Will be saved");
        }

        int index = 0;
        for (User user2 : users) {
            if (user2 == null) {
                users[index] = user;
                return users[index];
            }
            index++;
        }
        throw new InternalServelException("Not enough space to save user with id: " + user.getId());
    }

    public User update(User user) throws Exception {
        if (user == null)
            throw new BadRequestException("can't update null user");

        findById(user.getId());

        int index = 0;
        for (User user1 : users) {
            if (user1 != null && user.getId() == user1.getId()) {
                users[index] = user;
                return users[index];
            }
            index++;
        }
        throw new InternalServelException("Unexpected error");
    }

    public void delete(long id) throws Exception {
        findById(id);

        int i = 0;
        for (User user : users) {
            if (id == user.getId()) {
                users[i] = null;
                break;
            }
            i++;
        }
    }

    public User findById(long id) throws Exception {
        if (id == 0)
            throw new BadRequestException("id == 0");
        for (User user : users) {
            if (user == null || user.getId() == 0) {
                continue;
            }
            if (id == user.getId())
                return user;
        }
        throw new UserNotFoundException("User with id: " + id + " not found");
    }


    public User[] getUsers() {
        return users;
    }

}