package lesson24.exercise;

/**
 * Created by Ruslan on 12.06.2018.
 */
public class GeneralDAO<T> {
    @SuppressWarnings("unchecked")
    private T[] array = (T[]) new Object[5];

    public T save(T t) {
        int index = 0;
        for (T el : array) {
            if (el == null) {
                array[index] = t;
                return array[index];
            }
            index++;
        }
        return null;
    }

    public T[] getAll() {
        return array;
    }
}