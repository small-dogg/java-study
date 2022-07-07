package jvm;

public class Application {
    public static void main(String[] args) {
        AMethod aMethod = new AMethod();
        int result = aMethod.run("시작");
        System.out.println(result);
    }
}
