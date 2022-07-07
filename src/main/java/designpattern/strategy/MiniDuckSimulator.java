package designpattern.strategy;

import designpattern.strategy.duck.Duck;
import designpattern.strategy.duck.FlyRocketPowered;
import designpattern.strategy.duck.MallardDuck;
import designpattern.strategy.duck.ModelDuck;

public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck mallardDuck = new MallardDuck();
        mallardDuck.display();
        mallardDuck.performQuack();
        mallardDuck.performFly();

        Duck modelDuck = new ModelDuck();
        modelDuck.performFly();
        modelDuck.setFlyBehavior(new FlyRocketPowered());
        modelDuck.performFly();
    }
}
