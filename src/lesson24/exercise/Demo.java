package lesson24.exercise;

import java.util.Arrays;

/**
 * Created by Ruslan on 12.06.2018.
 */
public class Demo {
    public static void main(String[] args) {
        GeneralDAO<Sys> systemDAO = new GeneralDAO<>();
        Sys system1 = new Sys(11, "...");
        systemDAO.save(system1);

        System.out.println(Arrays.toString(systemDAO.getAll()));

        systemDAO.save(system1);
        System.out.println(Arrays.toString(systemDAO.getAll()));

        GeneralDAO<Tool> toolDAO = new GeneralDAO<>();
        Tool tool1 = new Tool("rrr", "ppp");
        toolDAO.save(tool1);
        System.out.println(Arrays.toString(toolDAO.getAll()));

        GeneralDAO<Order> orderDAO = new GeneralDAO<>();

    }
}
