package Lesson18.exercise1;

/**
 * Created by Ruslan on 11.05.2018.
 */
public class Task {
    public static void main(String[] args) {
        FileStorage fileStorage = new FileStorage();
        String[] fileNames = {"test1", "test2"/*, "test3", "test4", "test5"*/};
        fileStorage.setFiles(fileNames);
        System.out.println("Start printing name...");
        printer(fileStorage);
        System.out.println("Done");

    }

    public static void printer(Storage storage) {
        String[] names = storage.getFiles();
        try {
            System.out.println("5th name is " + names[4]);
        }
        catch (Exception e){
            System.out.println("5h name cdn not be found...");
            //System.err.println(e.getMessage());
        }
        //solution 2
        //HW

    }
}
