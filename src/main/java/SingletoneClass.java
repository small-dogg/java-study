public class SingletoneClass {
    //Instance
    private static SingletoneClass instance = new SingletoneClass();
    private int a = 3;
    private static ThreadLocal<Integer> b = ThreadLocal.withInitial(() -> 3);

    //private construct
    private void ExampleClass() {}

    public static SingletoneClass getInstance() {
        return instance;
    }

    public int add() {
        b.set(b.get()+1);
        return b.get();
    }
}
