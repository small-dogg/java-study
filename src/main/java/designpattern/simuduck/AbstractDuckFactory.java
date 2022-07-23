package designpattern.simuduck;

public abstract class AbstractDuckFactory {
    public abstract Quackable createMallardDuck();
    public abstract Quackable createRedDuck();
    public abstract Quackable createDuckCall();
    public abstract Quackable createRubberDuck();
}
