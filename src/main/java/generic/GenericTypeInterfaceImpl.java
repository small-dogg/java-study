package generic;

public class GenericTypeInterfaceImpl<T> implements GenericTypeInterface<T>{
    @Override
    public void call(T t) {
        System.out.println("t = " + t);
    }
}
