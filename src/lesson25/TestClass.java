package lesson25;

/**
 * Created by Ruslan on 12.06.2018.
 */
public class TestClass<T, K, V> {

    T doSomething(T t) {
        System.out.println("1");
        return t;
    }

    K doSomething2(K k) {
        System.out.println("2");
        return k;
    }

    V doSomething3(V v) {
        System.out.println("3");
        return v;
    }
}
