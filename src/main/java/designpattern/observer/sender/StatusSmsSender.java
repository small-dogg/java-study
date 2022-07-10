package designpattern.observer.sender;

public class StatusSmsSender implements StatusObserver{
    @Override
    public void onAbnormalStatus(Status status) {
        sendSms(status);
    }

    private void sendSms(Status status) {
        System.out.println("SMS 전송 완료");
    }
}
