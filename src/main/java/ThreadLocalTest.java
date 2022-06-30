public class ThreadLocalTest {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new AThread());
        Thread thread2 = new Thread(new BThread());
        thread1.run();
        thread2.run();
    }

     static class AThread implements Runnable{
         @Override
         public void run() {
             SingletoneClass sc = SingletoneClass.getInstance();
             System.out.println(sc.add());
         }
     }

     static class BThread implements Runnable{
         @Override
         public void run() {
             SingletoneClass sc = SingletoneClass.getInstance();
             System.out.println(sc.add());
         }
     }
}
