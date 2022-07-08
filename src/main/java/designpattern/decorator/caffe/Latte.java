package designpattern.decorator.caffe;

public class Latte extends Beverage{

    public Latte() {
        description = "라떼";
    }

    @Override
    long cost() {
        return 2500;
    }
}
