package lesson19.HomeWork;

/**
 * Created by Ruslan on 22.05.2018.
 */
public class Storage {
    private long id;
    private File [] files;
    private String [] formatsSupported;
    private String storageCountry;
    private long storageSize;

    public Storage(long id, File[] files, String[] formatsSupported, String storageCountry, long storageSize) {
        this.id = id;
        this.files = files;
        this.formatsSupported = formatsSupported;
        this.storageCountry = storageCountry;
        this.storageSize = storageSize;
    }

    public long getId() {
        return id;
    }

    public File[] getFiles() {
        return files;
    }

    public String[] getFormatsSupported() {
        return formatsSupported;
    }

    public String getStorageCountry() {
        return storageCountry;
    }

    public long getStorageSize() {
        return storageSize;
    }

    public void setFiles(File[] files) {
        this.files = files;
    }

    public void setStorageSize(long storageSize) {
        this.storageSize = storageSize;
    }
}
