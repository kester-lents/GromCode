package lesson20.task1.exception;

/**
 * Created by Ruslan on 29.05.2018.
 */
public class BadRequestException extends Exception {
    public BadRequestException(String message) {
        super(message);
    }
}
