package designpattern.observer.sender;

public class StatusEmailSender implements StatusObserver{
    @Override
    public void onAbnormalStatus(Status status) {
        sendEmail(status);
    }

    private void sendEmail(Status status) {
        System.out.println("이메일 전송 완료");
    }
}
