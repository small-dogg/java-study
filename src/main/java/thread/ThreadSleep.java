package thread;

public class ThreadSleep {
    public static void main(String[] args) {
        ThreadEx t1 = new ThreadEx();
        t1.start();
        try {

            Thread.sleep(1000);
            ThreadEx.sleep(1000);
        } catch (InterruptedException e) {}
    }
}
