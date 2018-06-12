package lesson25.HomeWork;

/**
 * Created by Ruslan on 12.06.2018.
 */
public class GeneralDAO<T> {
    /*
    Сохранение в базу данных (массив) с проверкой всех случаев.
    1. Проверка на налл.
    2. Проверка на дубли.
    3. Если длина массива позволяет.
    4. Запись
    */
    @SuppressWarnings("unchecked")
    private T[] array = (T[]) new Object[10];

    T save(T t) throws Exception {

        validate(t);

        int index = 0;
        for (T el : array) {
            if (el == null) {
                array[index] = t;
                return array[index];
            } else index++;
        }
        return null;
    }

    private void validate(T t) throws Exception {
        if (t == null || t.equals(0)) {
            throw new NullPointerException();
        }
        checkDuplicates(t);
        checkEmptySpace(t);
    }

    private void checkDuplicates(T t) throws Exception {
        for (T el : array) {
            if (el != null && el.equals(t)) {
                throw new Exception("element " + t + " is existed in array");
            }
        }
    }

    public void checkEmptySpace(T t) throws Exception {
        int index = 0;
        for (T el : array) {
            if (el != null)
                index++;
        }
        if (index == array.length)
            throw new Exception("There is no empty cells for saving");
    }

    public T[] getAll() {
        int index = 0;
        int i = 0;
        for (T el : array) {
            if (el != null)
                index++;
        }
        @SuppressWarnings("unchecked")
        T[] result = (T[]) new Object[index];
        for (T el : array) {
            if (el != null)
                result[i++] = el;
        }
        return result;
    }
}
