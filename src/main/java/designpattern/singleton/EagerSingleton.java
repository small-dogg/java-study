package designpattern.singleton;

public class EagerSingleton  {
    private static EagerSingleton instance = new EagerSingleton();

    //인스턴스를 생성하지 못하도록 생성자 접근 제어
    private EagerSingleton() {
    }

    //getInstance 메서드를 통해, 싱글톤으로 생성된 객체만을 반환
    public static EagerSingleton getInstance() {
        return instance;
    }

    /**
     * 문제점) 클라이언트에서 사용하지 않더라도 위의 EagerSingletone은 인스턴스가 항상 생성됨(메모리 낭비)
     * 예외 처리가 불가
     */
}
