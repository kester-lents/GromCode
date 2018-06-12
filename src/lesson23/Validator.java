package lesson23;

/**
 * Created by Ruslan on 12.06.2018.
 */
public final class Validator {
    private String name;
    private final static int checkCount = 7;

    public Validator(String name) {
        this.name = name;
    }
    public static boolean validate() {
        //logic 1
        return false;
    }

    public String getName() {
        return name;
    }

    public int getCheckCount() {
        return checkCount;
    }
}
