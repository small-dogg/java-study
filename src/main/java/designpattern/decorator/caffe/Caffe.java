package designpattern.decorator.caffe;

public class Caffe {
    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        System.out.println("beverage.getDescription() = " + beverage.getDescription() +" "+ beverage.cost()+"원");

        Beverage beverage2 = new Americano();
        beverage2 = new Mocha(beverage2);
        System.out.println("beverage.getDescription() = " + beverage2.getDescription() +" "+ beverage2.cost()+"원");

        Beverage beverage3 = new Latte();
        beverage3 = new Mocha(new Mocha(beverage3));
        System.out.println("beverage.getDescription() = " + beverage3.getDescription() +" "+ beverage3.cost()+"원");
    }
}
