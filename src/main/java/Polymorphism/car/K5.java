package Polymorphism.car;

public class K5 extends Car{
    public K5() {
        name = "k5";
    }

    @Override
    public void speedUp() {
        if(speed>180){
            System.out.println("K5의 최대 속력에 도달하였습니다.");
        }else{
            speed+=30;
        }
        super.drive();
    }
}
