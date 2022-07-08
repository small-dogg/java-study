package designpattern.decorator.caffe;

public class Espresso extends Beverage{

    public Espresso() {
        description = "에스프레소";
    }

    @Override
    long cost() {
        return 1500;
    }
}
