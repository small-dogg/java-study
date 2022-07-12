package designpattern.adapter.turkey;

import designpattern.strategy.duck.Duck;

public class TurkeyTest {
    public static void main(String[] args) {
        Turkey turkey = new Turkey() {
            @Override
            public void gobble() {
                System.out.println("골골골");
            }

            @Override
            public void fly() {
                System.out.println("날고있어요");
            }
        };

        TurkeyAdapter turkeyAdapter = new TurkeyAdapter(turkey);
        testDuck(turkeyAdapter);

    }

    static void testDuck(Duck duck) {
        duck.performQuack();
        duck.performFly();
    }
}
