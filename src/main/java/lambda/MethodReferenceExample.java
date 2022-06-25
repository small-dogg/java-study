package lambda;

import java.util.function.Function;
import java.util.function.Supplier;

public class MethodReferenceExample {
    public static void main(String[] args) {
        Function<String, Integer> f1 = (String s) -> Integer.parseInt(s);
        System.out.println("f1.apply() = " + f1.apply("100"));
        Function<String, Integer> f2 = Integer::parseInt;
        System.out.println("f2.apply() = " + f2.apply("100"));


        //Supplier : 입력은 없고 출력만 있는
        Supplier<MyClass> s1 = () -> new MyClass();
        System.out.println(s1.get());

        Supplier<MyClass> s2 = MyClass::new;
        System.out.println(s2.get());

        Function<Integer, MyClass> f3 = (i) -> new MyClass(i);
        Function<Integer, MyClass> f4 = MyClass::new;
        System.out.println(f3.apply(3).getIv());
        System.out.println(f4.apply(3).getIv());

        Function<Integer, int[]> f5 = (i) -> new int[i];
        Function<Integer, int[]> f6 = int[]::new;
    }
}

class MyClass{
    private int iv;

    public MyClass() {
    }

    public MyClass(int iv) {
        this.iv = iv;
    }

    public int getIv() {
        return iv;
    }
}
