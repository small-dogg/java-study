package designpattern.decorator.caffe;

public class Americano extends Beverage{

    public Americano() {
        description = "아메리카노";
    }

    @Override
    long cost() {
        return 2000;
    }
}
