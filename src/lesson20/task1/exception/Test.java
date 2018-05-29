package lesson20.task1.exception;

/**
 * Created by Ruslan on 29.05.2018.
 */
public class Test {
    public static void main(String[] args) throws Exception{

        int a = 10;
        if (a > 5)
            throw new BadRequestException("error");
    }
}
