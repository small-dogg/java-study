package designpattern.command.remotecontroller;

public class Stereo {

    private final String type;
    private int volume = 0;

    public Stereo(String type) {
        this.type = type;
    }

    public void on() {
        System.out.println(this.type + " 스테레오 온");
    }
    public void off() {
        System.out.println(this.type + " 스테레오 오프");
    }
    public void setCd() {
        System.out.println(this.type + " CD 모드");
    }
    public void setDvd() {
        System.out.println(this.type + " DVD 모드");
    }
    public void setRadio() {
        System.out.println(this.type + " 라디오 모드");
    }
    public void setVolume(int volume) {
        this.volume = volume;
        System.out.println(this.type + " 볼륨 설정 : "+volume);
    }
}
