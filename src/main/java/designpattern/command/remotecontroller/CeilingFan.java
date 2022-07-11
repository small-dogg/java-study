package designpattern.command.remotecontroller;

public class CeilingFan {
    private String type;
    private int speed;

    public CeilingFan(String type) {
        this.type = type;
    }

    public void high() {
        this.speed = 10;
    }

    public void mid() {
        this.speed = 5;
    }

    public void low() {
        this.speed = 1;
    }

    public void off() {
        this.speed = 0;
        System.out.println(this.type + " 실링 팬 작동 중지");
    }

    public int getSpeed() {
        System.out.println(this.type + " 현재 속도 : " + speed);
        return this.speed;
    }


}
