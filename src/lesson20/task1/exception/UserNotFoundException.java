package lesson20.task1.exception;

/**
 * Created by Ruslan on 29.05.2018.
 */
public class UserNotFoundException extends Exception {
    public UserNotFoundException(String message) {
        super(message);
    }
}
