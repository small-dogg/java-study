package designpattern.decorator.caffe;

public class Mocha extends CondimentDecorator{

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    long cost() {
        return beverage.cost()+200;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription()+", 모카";
    }
}
