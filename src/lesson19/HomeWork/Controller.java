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
        putProcessing(storage, file);
    }

    void delete(Storage storage, File file) throws Exception {
        if (file == null)
            throw new NullPointerException("file is null");

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
/*
Найти количество места для переноса.
Найти количество файлов, которые будут переносится.
Количество места не должно быть меньше количества переносимых файлов.
Пробегаемся по всем переносимым файлам, и проверяем, подойдут ли они все для переноса.
Переносим.
*/

    void transferAll(Storage storageFrom, Storage storageTo) throws Exception {
        int zero = 0;
        int notZero = 0;
        for (File file : storageTo.getFiles()) {
            if (file == null)
                zero++;
        }
        for (File file : storageFrom.getFiles()) {
            if (file != null)
                notZero++;
        }
        if (zero < notZero)
            throw new Exception("can't add all files from storage " + storageFrom.getId() + " to storage " + storageTo.getId());

        for (File file : storageFrom.getFiles()) {
            try {
                if (file != null) {
                    findDuplicates(storageTo, file);
                    checkSizeStorage(storageFrom, storageTo);
                    checkFormatFile(storageTo, file);
                }
            } catch (Exception e) {
                e.printStackTrace();
                return;
            }
        }
        for (File file : storageFrom.getFiles()) {
            if (file != null)
                putProcessing(storageTo, file);
        }
    }

    void transferFile(Storage storageFrom, Storage storageTo, long id) throws Exception {

        int i = 0;
        for (File file : storageFrom.getFiles()) {
            if (file != null && file.getId() == id) {
                put(storageTo, storageFrom.getFiles()[i]);
                return;
            } else i++;
        }
        throw new Exception("file with id " + id + " can't add in " + storageTo.getId());
    }

    void putProcessing(Storage storage, File file) throws Exception {
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
}
