package lesson19.HomeWork;

/**
 * Created by Ruslan on 22.05.2018.
 */
public class Controller {

    void put(Storage storage, File file)throws Exception{
        if (file == null)
            throw new RuntimeException("file " + file.getId() + " can't add in " + storage.getId());
        for (File strgFile : storage.getFiles()) { //is storage consists of such file to add?
            if (strgFile == null)
                continue;
            if ((strgFile.getId() == file.getId() && strgFile.getName().equals(file.getName())) ||
                    strgFile.getId() == file.getId())
                throw new RuntimeException("file " + file.getId() + " is containing in storage " + storage.getId());
        }
        if (validateFile(storage, file)) {
            for (File strgFile : storage.getFiles()) {
                if (strgFile == null) {
                    strgFile = file;
                    System.out.println("done");
                    return;
                }
            }
        } else throw new RuntimeException("file " + file.getId() + " can't add in " + storage.getId());
        System.out.println("something wrong");
    }

    boolean validateFile(Storage storage, File file) {
        long curStorSize = 0;
        for (File file1 : storage.getFiles()) { //calculating current size of storage
            if (file1 != null)
                curStorSize += file1.getSize();
        }
        int i = 0;
        //is format of file suitable for adding in storage?
        for (String format : storage.getFormatsSupported()) {
            if (file.getFormat().equals(format))
                break;
            else i++;
        }
        if (i == storage.getFormatsSupported().length)
            return false;

        for (File strgFile : storage.getFiles()) { //validating file according conditions
            if (strgFile != null)
                continue;
            if (file.getName().length() < 11 && curStorSize + file.getSize() < storage.getStorageSize())
                return true;
        }
        return false;
    }

    void delete(Storage storage, File file) {

    }

    void transferAll(Storage storageFrom, Storage storageTo) {

    }

    void transferFile(Storage storageFrom, Storage storageTo, long id) {

    }


}
