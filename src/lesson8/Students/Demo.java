package lesson8.Students;

/**
 * Created by Ruslan on 14.09.2017.
 */
public class Demo {
    /*public static void main(String[] args) {
        EmployeeController demo = new EmployeeController();
        demo.createHighestParent();
        demo.createLowestChild();
    }*/

    Student createHighestParent() {
        Student student = new Student("Vitalyi", "Petro", 5, new Course[]{});
        return student;
    }

    SpecialStudent createLowestChild() {
        SpecialStudent specialStudent = new SpecialStudent("Andrey", "Ruslan", 8, new Course[]{}, 1236, "blabla");
        return specialStudent;
    }

}


