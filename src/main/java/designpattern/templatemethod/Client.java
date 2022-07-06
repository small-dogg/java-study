package designpattern.templatemethod;

public class Client {
    public static void main(String[] args) {
        CommandBuilder cb1 = new V1Builder();
        CommandBuilder cb2 = new V2Builder();

        System.out.println(cb1.build());
        System.out.println(cb2.build());
    }
}
