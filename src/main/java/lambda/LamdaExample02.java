package lambda;

@FunctionalInterface
interface MyFunction2{
    void run();
}

public class LamdaExample02 {
    static void execute(MyFunction2 f){
        f.run();
    }

    static MyFunction2 getMyFunction(){
        return () -> System.out.println("f3.run()");
    }

    public static void main(String[] args) {
        MyFunction2 f = () -> System.out.println("f1.run()");

        MyFunction2 f2 = new MyFunction2() {
            @Override
            public void run() {
                System.out.println("f2.run()");
            }
        };

        MyFunction2 f3 = getMyFunction();

        f.run();
        f2.run();
        f3.run();

        execute(f);
        execute(()-> System.out.println("run()"));
    }
}
