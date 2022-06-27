import java.util.concurrent.atomic.AtomicInteger;

public class Atomic {
    private static int num = 0;
    static volatile int num2 = 0;
    public static void main(String[] args) throws InterruptedException {
        AtomicInteger atomicInteger = new AtomicInteger(0);
        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 100000; i++) {
                num++;
                num2++;
                atomicInteger.incrementAndGet();
            }
        });

        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 100000; i++) {
                num++;
                num2++;
                atomicInteger.incrementAndGet();
            }
        });

        thread1.start();
        thread2.start();

        Thread.sleep(5000);

        System.out.println("atomicInteger = " + atomicInteger.get());
        System.out.println("num = " + num);
        System.out.println("num2 = " + num2);
    }
}
