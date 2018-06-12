package lesson25;

/**
 * Created by Ruslan on 12.06.2018.
 */
public class Demo {
    public static void main(String[] args) throws Exception {
        GeneralDAO generalDAO = new GeneralDAO();

        Order order = new Order(1);
        generalDAO.validate(order);

        TestClass<String, String, Long> testClass = new TestClass<>();
        System.out.println(testClass.doSomething("rrr"));

        //long - Long
        //int - Integer
        //short - Short
        int test = 100;
        long variable = 123L;
        Long variable2 = 123L;
        Long variable3 = variable;

        generalDAO.validate(variable2.longValue());
        generalDAO.validate(variable);



    }
}
