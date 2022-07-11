package designpattern.command.remotecontroller;

public class Light {

    private String type;
    public Light(String type) {
        this.type = type;
    }

    public void on(){
        System.out.println(type+" 불이 켜졌습니다.");
    }

    public void off() {
        System.out.println(type+ "불이 꺼졌습니다.");
    }
}
