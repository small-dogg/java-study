package generic;

public class GenericSampleTest {


    public static void main(String[] args) {
        GenericType<String> genericType1 = new GenericType<>("스트링");
        System.out.println("genericType1.getName() = " + genericType1.getName());
        GenericType<Integer> genericType2 = new GenericType<>(2);
        System.out.println("genericType2.getName() = " + genericType2.getName());

        System.out.println("-----------------------------------");

        MultiGenericType<String, Integer> multiGenericType = new MultiGenericType<>("aaa", 123);
        System.out.println("multiGenericType.getKey() = " + multiGenericType.getKey());
        System.out.println("multiGenericType.getValue() = " + multiGenericType.getValue());

        System.out.println("-----------------------------------");

        GenericType<Integer> box = GenericMethod.boxing(100);
        System.out.println("box.getName() = " + box.getName());
        GenericType<Integer> box2 = GenericMethod.<Integer>boxing(100);
        System.out.println("box2.getName() = " + box2.getName());

        System.out.println("-----------------------------------");

        Pair<String, String> pair1 = new Pair<>("a", "b");
        Pair<String, String> pair2 = new Pair<>("a", "b");
        boolean compare1 = Util.<String, String>compare(pair1, pair2);
        System.out.println("compare1 = " + compare1);

        Pair<String, String> pair3 = new Pair<>("a", "b");
        Pair<String, String> pair4 = new Pair<>("a", "b");
        boolean compare2 = Util.compare(pair3, pair4);
        System.out.println("compare2 = " + compare2);

        System.out.println("-----------------------------------");

        int compareNumber1 = Util.compare(3, 5);
        int compareNumber2 = Util.compare(3.5, 5);

        System.out.println("compareNumber1 = " + compareNumber1);
        System.out.println("compareNumber2 = " + compareNumber2);

        System.out.println("-----------------------------------");


    }

}
