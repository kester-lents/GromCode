package lesson25.HomeWork;

import java.util.Arrays;

/**
 * Created by Ruslan on 12.06.2018.
 */
public class Demo {
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        GeneralDAO generalDAO = new GeneralDAO();
        try {
            generalDAO.save("cool");
            generalDAO.save(87687687998797L);
            generalDAO.save(87687687.0);
            System.out.println(Arrays.toString(generalDAO.getAll()));
        } catch (Exception e) {
            System.out.println("Something wrong");
        }

    }
}
