package thread;

public class Account {
    int balance = 10000;

    public synchronized void withdraw(int money){
        while (balance < money) {
            try {
                wait(); // 대기 - 락을 풀고 기다린다. 통지를 받으면 락을 재획득(ReEntrance)
            } catch (InterruptedException e) {}
        }
    }

    public synchronized void deposit(int money) {
        balance += money;
        notify(); // 통지 - 대기중인 스레드 중 하나에게 알림
    }
}
