package designpattern.observer.sender;

public class Client {
    public static void main(String[] args) {
        StatusChecker statusChecker = new StatusChecker();

        statusChecker.add(new StatusEmailSender());
        StatusSmsSender statusSmsSender = new StatusSmsSender();
        statusChecker.add(statusSmsSender);
        statusChecker.check();

        statusChecker.remove(statusSmsSender);
        statusChecker.check();
    }
}
