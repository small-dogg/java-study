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
        Quackable gooseAdapter = new GooseAdapter(new Goose());

        System.out.println("\n오리 시뮬레이션 게임(+거위 어댑터)");

        simulate(mallardDuck);
        simulate(redheadDuck);
        simulate(duckCall);
        simulate(rubberDuck);
        simulate(gooseAdapter);

        System.out.println("오리가 소리 낸 횟수: " +
                QuackCounter.getQuacks() + " 번");
    }

    private void simulate(Quackable duck) {
        duck.quack();
    }
}
