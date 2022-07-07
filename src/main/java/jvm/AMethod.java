package jvm;

public class AMethod {
    public int run(String data){
        String parameter = data;
        System.out.println(parameter);
        parameter = "hello";
        System.out.println("parameter = " + parameter);
        int num1 = 10;
        System.out.println(num1);
        num1 = 11;
        int num2 = 12;
        num1+=num2;

        return num1;
    }
}
