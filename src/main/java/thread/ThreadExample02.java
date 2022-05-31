package thread;

public class ThreadExample02 {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();

        Thread t1 = new ThreadEx();
        Thread t2 = new Thread(new RunnableEx());

        t1.start();
        t2.start();

        try {
            //Thread의 join메서드는 main 스레드가 join메서드를 호출한 스레드가 종료될 때 까지 기다린다.
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        long end = System.currentTimeMillis();

        System.out.println("소요 시간 : " + (end-start));

        System.out.println("t2 = " + t2);
        
        
    }
}