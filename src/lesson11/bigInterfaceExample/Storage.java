package lesson11.bigInterfaceExample;

/**
 * Created by Ruslan on 04.04.2018.
 */
public class Storage {
    private File [] files = new File[5];

    public Storage(File[] files) {
        this.files = files;
    }

    public File[] getFiles() {
        return files;
    }
}
