package lesson19.HomeWork;

import java.util.Arrays;
import java.util.NoSuchElementException;

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
            throw new NullPointerException("nothing to add");

        findDuplicates(storage, file);
        validateFile(storage, file);

        int i = 0;
        for (File strgFile : storage.getFiles()) {
            if (strgFile == null) {
                storage.getFiles()[i] = file;
                System.out.println("done");
                return;
            } else i++;
        }
        if (i == storage.getFiles().length)
            throw new Exception("file " + file.getId() + " can't add in " + storage.getId());
    }

    void validateFile(Storage storage, File file) throws Exception {

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
            throw new Exception("file " + file.getId() + " can't add in " + storage.getId());

        for (File strgFile : storage.getFiles()) { //validating file according conditions
            if (strgFile != null)
                continue;
            if (file.getName().length() > 10 || curStorSize + file.getSize() > storage.getStorageSize())
                throw new Exception("file " + file.getId() + " can't add in " + storage.getId());
        }
    }

    void findDuplicates(Storage storage, File file) throws Exception {
        for (File strgFile : storage.getFiles()) { //is storage consists of such file to add?
            if (strgFile == null)
                continue;
            if (strgFile.getId() == file.getId())
                throw new Exception("file " + file.getId() + " is containing in storage " + storage.getId());
        }
    }

    void delete(Storage storage, File file) throws Exception {
        System.out.println(Arrays.toString(storage.getFiles()));
        if (file == null)
            throw new NullPointerException("nothing to delete");

        int i = 0;
        for (File strgFile : storage.getFiles()) { //is storage consists of such file to add?
            if (strgFile != null) {
                if (strgFile.getId() == file.getId() && strgFile.getName().equals(file.getName())) {
                    storage.getFiles()[i] = null;
                    System.out.println("done");
                    System.out.println(Arrays.toString(storage.getFiles()));
                    return;
                } else i++;
            } else i++;
        }
        throw new Exception("file " + file.getId() + " isn't contained in " + storage.getId());
    }

    void transferAll(Storage storageFrom, Storage storageTo) {

    }

    void transferFile(Storage storageFrom, Storage storageTo, long id) {

    }


}
