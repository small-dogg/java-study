package Polymorphism.plane;

public class Application {

    public static void main(String[] args) {

        System.out.println("-----TurboPlane1-----");
        TurboPlane turboPlane1 = new TurboPlane();
        turboPlane1.turbo();
        turboPlane1.fly();

        System.out.println("-----TurboPlane2-----");
        Plane turboPlane2 = new TurboPlane();
        turboPlane2.fly();
//        turboPlane2.turbo();

        System.out.println("-----Plane-----");
        Plane plane = new Plane();
        plane.fly();
    }
}
