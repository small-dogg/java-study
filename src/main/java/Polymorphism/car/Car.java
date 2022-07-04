package Polymorphism.car;

public class Car {
    public String name;
    public int speed = 0;

    public void speedUp(){
        this.speed+=30;
    }

    public void drive() {
        System.out.println(name + "의 현재 주행 속도는 " + speed + "입니다.");
    }
}
