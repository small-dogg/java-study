package designpattern.decorator.caffe;

public class Smoothie extends Beverage{

    public Smoothie() {
        description = "스무디";
    }

    @Override
    long cost() {
        return 0;
    }
}
