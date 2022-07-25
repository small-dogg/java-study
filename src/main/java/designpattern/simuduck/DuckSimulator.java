package designpattern.simuduck;

/**
 * Adapter 패턴과 Decorator 패턴, 추상 팩토리 패턴을 조합한 복합 패턴
 */
public class DuckSimulator {
    public static void main(String[] args) {
        DuckSimulator simulator = new DuckSimulator();
        AbstractDuckFactory duckFactory = new CountingDuckFactory();
        simulator.simulate(duckFactory);
    }

    private void simulate(AbstractDuckFactory duckFactory) {
        Quackable mallardDuck = duckFactory.createMallardDuck();
        Quackable redheadDuck = duckFactory.createRedDuck();
        Quackable duckCall = duckFactory.createDuckCall();
        Quackable rubberDuck = duckFactory.createRubberDuck();
        Quackable gooseAdapter = new GooseAdapter(new Goose());//어댑터 패턴을 사용하여 거위를 오리처럼 사용

        System.out.println("\n오리 시뮬레이션 게임(+거위 어댑터)");

        simulate(mallardDuck);
        simulate(redheadDuck);
        simulate(duckCall);
        simulate(rubberDuck);
        simulate(gooseAdapter);

        System.out.println("오리가 소리 낸 횟수: " +
                QuackCounter.getQuacks() + " 번");

        System.out.println("---------------------------------------------------------------------");

        Flock flockOfDucks = new Flock();

        flockOfDucks.add(redheadDuck);
        flockOfDucks.add(duckCall);
        flockOfDucks.add(rubberDuck);
        flockOfDucks.add(gooseAdapter);

        Flock flockOfMallards = new Flock();
        Quackable mallardDuck1 = duckFactory.createMallardDuck();
        Quackable mallardDuck2 = duckFactory.createMallardDuck();
        Quackable mallardDuck3 = duckFactory.createMallardDuck();
        Quackable mallardDuck4 = duckFactory.createMallardDuck();
        flockOfMallards.add(mallardDuck1);
        flockOfMallards.add(mallardDuck2);
        flockOfMallards.add(mallardDuck3);
        flockOfMallards.add(mallardDuck4);

        flockOfDucks.add(flockOfMallards);

        System.out.println("\n오리 시뮬레이션 게임: 전체 무리");
        simulate(flockOfDucks);

        System.out.println("\n오리 시뮬레이션 게임: 물오리");
        simulate(flockOfMallards);

        System.out.println("오리가 소리 낸 횟수: " + QuackCounter.getQuacks() + " 번");

        System.out.println("---------------------------------------------------------------------");

        Quackologist quackologist = new Quackologist();
        Flock flockOfDucks2 = new Flock();
        flockOfDucks2.registerObserver(quackologist);

        simulate(flockOfDucks2);

        System.out.println("오리가 소리 낸 횟수: " + QuackCounter.getQuacks() + " 번");

    }

    private void simulate(Quackable duck) {
        duck.quack();
    }
}
