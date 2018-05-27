package lesson19.HomeWork;

/**
 * Created by Ruslan on 22.05.2018.
 */
public class Demo {
    public static void main(String[] args) {
        File file1 = new File(12345, "Ruslan", "exe", 123);
        File file2 = new File(123456, "Ruslan1", "jpg", 1234);
        File file3 = new File(123457, "Ruslan2", "jar", 1235);
        File fileForChecking = new File(12345, "Ruslan24", "jar", 235);
        Storage storage1 = new Storage(12345, new File[]{file1, file2, file3, null}, new String[]{"jpg", "exe", "jar"},
                "Ukraine", 2353245);
        Storage storage2 = new Storage(12345, new File[]{file1, file2, file3}, new String[]{"jpg", "exe", "jar"},
                "Ukraine", 2353245);
        Storage storage3 = new Storage(12345, new File[]{file1, file2, file3}, new String[]{"jpg", "exe", "jar"},
                "Ukraine", 2353245);
        Controller controller = new Controller();
        try {
            controller.put(storage1, fileForChecking);
        }
        catch (Exception e){
            System.out.println("operation is failed");
        }


        //if file containing in storage?
        //if format of file is unacceptable?


    }

}
