package lesson19.HomeWork;

import java.util.Arrays;
import java.util.NoSuchElementException;

/**
 * Created by Ruslan on 22.05.2018.
 */
public class Controller extends Validation {
/*
1. Проверка файла на налл.
2. Проверка, не одинаковый ли файл из одним с стореджа или даже если просто по айдишникам одинаковы.
3. Расчет текущего размера стореджа.
4. Проверка валидности формата добавляемого файла.
5. Проверка файла по условиям: длина имена не больше 10 символов, не превышается ли размер стореджа.
6. Проверка, есть ли пустое место в массиве, и запись файла туда.
*/

    void put(Storage storage, File file) throws Exception {
        validationFile(storage, file);
    }

    void delete(Storage storage, File file) throws Exception {
        if (file == null)
            throw new NullPointerException("nothing to delete");

        int i = 0;
        for (File strgFile : storage.getFiles()) { //is storage consists of such file to add?
            if (strgFile != null) {
                if (strgFile.getId() == file.getId() && strgFile.getName().equals(file.getName())) {
                    storage.getFiles()[i] = null;
                    System.out.println("done");
                    return;
                } else i++;
            } else i++;
        }
        throw new Exception("file " + file.getId() + " isn't contained in " + storage.getId());
    }

    void transferAll(Storage storageFrom, Storage storageTo) throws Exception {
        //check is in 2-nd storage enough space for transferring
        int i = 0;
        for (File file2 : storageTo.getFiles()) {
            if (file2 == null)
                i++;
        }
        if (i < storageFrom.getFiles().length)
            throw new Exception("in storage " + storageFrom + "there aren't empty space for storage " + storageTo);


        for (File file1 : storageFrom.getFiles()) {
            if (file1 == null)
                continue;
            else
                put(storageTo, file1);
        }

    }

    void transferFile(Storage storageFrom, Storage storageTo, long id) throws Exception {

        if (id == 0)
            throw new NullPointerException("nothing to add");

        int i = 0;
        for (File file : storageFrom.getFiles()) {
            if (file == null) {
                i++;
                continue;
            }
            if (file.getId() == id) {
                put(storageTo, storageFrom.getFiles()[i]);
                return;
            } else i++;
        }
        throw new Exception("file with id " + id + " can't add in " + storageTo.getId());
    }


}
