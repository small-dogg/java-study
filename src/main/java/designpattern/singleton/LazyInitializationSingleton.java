package designpattern.singleton;

import java.util.Objects;

public class LazyInitializationSingleton {
    private static LazyInitializationSingleton instance;

    private LazyInitializationSingleton() {
    }

    //getInstance 메서드가 호출되지않으면 인스턴스를 만들지 않도록 함.
    public static LazyInitializationSingleton getInstance() {
        if (Objects.isNull(instance)) {
            instance = new LazyInitializationSingleton();
        }
        return instance;
    }

    /**
     * Eager Initialization 의 경우에는 무조건적으로 인스턴스를 생성하지만,
     * Lazy Initialization은 getInstance가 최초 호출되었을 때 비로소 인스턴스를 만들기 때문에,
     * 실제로 사용하는 곳이 있어야 인스턴스를 만들어 메모리의 효율성을 갖을 수 있음.
     *
     * 단, Thread-Safe 하지 않는 문제가 발생함함     */
}
