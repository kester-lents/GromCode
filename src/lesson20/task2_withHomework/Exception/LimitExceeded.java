package lesson20.task2_withHomework.Exception;

/**
 * Created by Ruslan on 29.05.2018.
 */
public class LimitExceeded extends BadRequestException {
    public LimitExceeded(String message) {
        super(message);
    }
}
