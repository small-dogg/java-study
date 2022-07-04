package Polymorphism.plane;

public class TurboPlane extends Plane implements Turbo{
    @Override
    public void fly() {
        System.out.println("고속 비행");
    }

    @Override
    public void turbo() {
        System.out.println("터보 엔진 가동");
    }
}
