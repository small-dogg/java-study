package generic;

public class Util {
    public static <K, V> boolean compare(Pair<K,V> p1, Pair<K,V> p2){
        boolean keyCompare = p1.getK().equals(p2.getK());
        boolean valueCompare = p1.getV().equals(p2.getV());

        return keyCompare && valueCompare;
    }

    public static <T extends Number> int compare(T t1, T t2){
        return Double.compare(t1.doubleValue(), t2.doubleValue());
    }
}
