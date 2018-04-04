package lesson11.bigInterfaceExample;


/**
 * Created by Ruslan on 04.04.2018.
 */
public class SimpleReader implements Readable {

    @Override
    public void readFilesFromStorage(Storage storage) {
        for (File file: storage.getFiles())
            if (file != null)
            System.out.println(file.getName());
        else System.out.println(file);
    }
}
