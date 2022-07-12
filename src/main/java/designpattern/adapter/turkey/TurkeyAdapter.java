package designpattern.adapter.turkey;

import designpattern.strategy.duck.Duck;

public class TurkeyAdapter extends Duck {

    private Turkey turkey;

    public TurkeyAdapter(Turkey turkey) {
        this.turkey = turkey;
    }

    @Override
    public void performFly() {
        turkey.fly();
    }

    @Override
    public void performQuack() {
        turkey.gobble();
    }

    @Override
    public void swim() {
        throw new UnsupportedOperationException();
    }

    @Override
    public void display() {
        throw new UnsupportedOperationException();
    }
}
