package lesson23;

/**
 * Created by Ruslan on 12.06.2018.
 */
public class Validator {
    private String name;
    private final static int checkCount = 7;

    public Validator(String name) {
        this.name = name;
    }
    public boolean validate() {
        //


        return false;
    }

    public String getName() {
        return name;
    }

    public int getCheckCount() {
        return checkCount;
    }
}
