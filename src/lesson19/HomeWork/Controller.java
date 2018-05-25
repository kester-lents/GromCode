package lesson19.HomeWork;

/**
 * Created by Ruslan on 22.05.2018.
 */
public class Controller {
/*
1. Проверка файла на налл.
2. Проверка, не одинаковый ли файл из одним с стореджа или даже если просто по айдишникам одинаковы.
3. Расчет текущего размера стореджа.
4. Проверка валидности формата добавляемого файла.
5. Проверка файла по условиям: длина имена не больше 10 символов, не превышается ли размер стореджа.
6. Проверка, есть ли пустое место в массиве, и запись файла туда.
*/

    void put(Storage storage, File file) throws Exception {
        if (file == null)
            return;
        for (File strgFile : storage.getFiles()) { //is storage consists of such file to add?
            if (strgFile == null)
                continue;
            if ((strgFile.getId() == file.getId() && strgFile.getName().equals(file.getName())) ||
                    strgFile.getId() == file.getId())
                return;
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
