package designpattern.singleton;

public class BillPughSingleton {
    private BillPughSingleton() {

    }
    //정적 클래스(inner class)
    //final 키워드를 통해 처음 호출될때 한번만 초기화 되도록 선언
    private static class SingletonHelper{
        private static final BillPughSingleton INSTANCE = new BillPughSingleton();
    }

    public static BillPughSingleton getInstance() {
        return SingletonHelper.INSTANCE;
    }

    /**
     * Double Checked에 비해 구현이 간단
     * Lazy Loading이 가능
     * Thread safe함
     */
}
