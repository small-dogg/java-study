package thread;

class ThreadEx extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 300; i++) {
            System.out.println("getName() = " + getName());
        }
    }
}

