package thread;

public class DaemonThread implements Runnable{

    private boolean autoSave;

    public void setAutoSave(boolean autoSave) {
        this.autoSave = autoSave;
    }

    @Override
    public void run() {
        while(true){
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {}

            if (autoSave) {
                autoSave();
            }
        }
    }

    private void autoSave() {
        System.out.println("자동저장");
    }

}
