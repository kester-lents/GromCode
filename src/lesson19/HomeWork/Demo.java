package lesson19.HomeWork;

/**
 * Created by Ruslan on 22.05.2018.
 */
public class Demo {
    public static void main(String[] args) {
        File file1 = new File(12345, "Ruslan", "exe", 123);
        File file2 = new File(123456, "Ruslan1", "jpg", 1234);
        File file3 = new File(123457, "Ruslan2", "jar", 1235);
        File fileForChecking = new File(123457808, "Ruslan23", "jarh", 235);
        File file4 = new File(123453254, "Ruslan", "exe", 123);
        File file5 = new File(12345634, "Ruslan1", "jpg", 1234);
        File file6 = new File(123452347, "Ruslan2", "jar", 1235);
        Storage storage1 = new Storage(12345, new File[]{null, file6, file4, file5}, new String[]{"jpg", "exe", "jar"},
                "Ukraine", 2353245);
        Storage storage2 = new Storage(12345, new File[]{file1, file2, file3, null, null, null}, new String[]{"jpg", "exe", "jar"},
                "Ukraine", 2353245);
        Storage storage3 = new Storage(12345, new File[]{file1, file2, file3}, new String[]{"jpg", "exe", "jar"},
                "Ukraine", 2353245);
        Controller controller = new Controller();
        try {
            controller.put(storage2, fileForChecking);
        } catch (Exception e) {
            System.out.println("trouble");
        }
        return;


        //if file containing in storage?
        //if format of file is unacceptable?


    }

}
