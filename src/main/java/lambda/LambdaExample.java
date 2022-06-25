package lambda;

public class LambdaExample {
    public static void main(String[] args) {
        MyFunction f1 = new MyFunction() {
            @Override
            public int max(int a, int b) {
                return a > b ? a : b;
            }
        };

        MyFunction f2 = (a, b) -> a > b ? a : b;
        int max = f2.max(3, 5);

        System.out.println("f1.max(3,5) = " + f1.max(3, 5));
        System.out.println("max = " + max);
    }
}
