package lesson20.task2.Exception;

/**
 * Created by Ruslan on 29.05.2018.
 */
public class BadRequestException extends Exception {
    public BadRequestException(String message) {
        super(message);
    }
}
