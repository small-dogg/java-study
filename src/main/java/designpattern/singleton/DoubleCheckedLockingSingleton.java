package designpattern.singleton;

import java.util.Objects;

public class DoubleCheckedLockingSingleton {
    private static DoubleCheckedLockingSingleton instance = null;

    private DoubleCheckedLockingSingleton() {
    }

    public static DoubleCheckedLockingSingleton getInstance() {
        //인스턴스가 null이 아니면 바로 인스턴스를 제공
        if (Objects.isNull(instance)) {
            //인스턴스가 null이면 처음 들어온 스레드가 인스턴스를 만듬
            synchronized (DoubleCheckedLockingSingleton.class) {
                if (Objects.isNull(instance)) {
                    instance = new DoubleCheckedLockingSingleton();
                }
            }
        }
        return instance;
    }

    /**
     * Null 체크를 2번하는 더블 체크 방식으로 바깥 null체크에서는 인스턴스가 있으면 바로 리턴해주고
     * 그렇지 않은 경우 처음 접근한 스레드가 인스턴스를 만듬
     */
}
