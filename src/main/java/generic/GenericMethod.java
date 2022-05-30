package generic;


public class GenericMethod {

    public static <T> GenericType<T> boxing(T t) {
        GenericType<T> box = new GenericType<>();
        box.setName(t);
        return box;
    }
}
