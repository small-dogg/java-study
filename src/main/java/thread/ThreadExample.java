package thread;

public class ThreadExample {
    public static void main(String[] args) {
        Thread t1 = new ThreadEx();
        Thread t2 = new Thread(new RunnableEx());

        t1.start();
        t2.start();
    }
}