package lambda;

public class LambdaAtomicTest {
    public static void main(String[] args) {
        boolean isReal = true;

        Runnable a = new Runnable() {
            @Override
            public void run() {
                if(isReal){
                    //do something
                }
            }
        };
        a.run();
//        isReal = false;
    }

}
