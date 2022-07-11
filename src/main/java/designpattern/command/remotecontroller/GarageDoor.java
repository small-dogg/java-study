package designpattern.command.remotecontroller;

public class GarageDoor {
    private String type;
    public GarageDoor(String type) {
        this.type = type;
    }

    public void up(){
        System.out.println(this.type + "차고 문이 올라갑니다.");
    }

    public void down(){
        System.out.println(this.type + "차고 문이 내려갑니다.");
    }
    public void stop(){
        System.out.println(this.type + "차고 문이 멈춥니다.");
    }

    public void lightOn() {
        System.out.println(this.type + "차고 문의 라이트가 켜집니다.");
    }

    public void lightOff() {
        System.out.println(this.type + "차고 문의 라이트가 꺼집니다.");
    }
}
