package designpattern.singleton;

public class StaticBlockSingleton {
    private static StaticBlockSingleton instance;

    private StaticBlockSingleton() {
    }

    //static 블록을 통해, 초기화하는 과정에서의 예외를 처리할 수 있음
    static{
        try {
            instance = new StaticBlockSingleton();
        } catch (Exception e) {
            throw new RuntimeException("싱글톤 객체 생성 과정에 문제가 있습니다.");
        }
    }

    public static StaticBlockSingleton getInstance() {
        return instance;
    }

    /**
     * 하지만, 사용하지 않더라도 무조건 인스턴스를 만드는 단점은 아직도 가지고 있음
     */
}
