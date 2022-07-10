package designpattern.singleton;

public class ThreadSafeSingleton {
    private static ThreadSafeSingleton instance;

    private ThreadSafeSingleton() {
    }

    //synchronized 키워드를 통해, 스레드 락을 사용하여 Thread-safe하게 처리
    public static synchronized ThreadSafeSingleton getInstance() {
        if (instance == null) {
            instance = new ThreadSafeSingleton();
        }
        return instance;
    }

    /**
     * 스레드가 하나씩만 접근하다보니 성능이 저하되는 문제가 있음
     */
}
