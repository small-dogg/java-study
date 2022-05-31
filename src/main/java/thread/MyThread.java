package thread;

public class MyThread implements Runnable{

    private Thread th;
    volatile private boolean suspended = false; // volatile 쉽게 바뀌는 변수 ( cpu에 있는 코어들이 메모리에있는 값을 복사해서 사용하지 않고 메모리 원본을 그대로 사용)
    volatile private boolean stopped = false;

    public MyThread(String name) {
        th = new Thread(this, name);
    }

    void start(){
        th.start();
    }

    void stop(){
        stopped=true;
        th.interrupt();
    }

    void suspend() {
        suspended = true;
        th.interrupt();
    }

    void resume() {
        suspended = false;
    }

    @Override
    public void run() {
        while(!stopped){
            if(!suspended){
                //do something
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {}
            }else{
                Thread.yield();
            }
        }
    }
}
