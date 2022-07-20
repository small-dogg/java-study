package designpattern.state.gumballmachine;

public class SoldOutState implements State{
    private final GumballMachine gumballMachine;

    public SoldOutState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("더이상 알맹이가 남아있지 않습니다.");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("동전을 반환할 수 없습니다. 넣은 동전이 없어요.");
    }

    @Override
    public void turnCrank() {
        System.out.println("더이상 알맹이가 남아있지 않습니다.");
    }

    @Override
    public void dispense() {
        System.out.println("더이상 알맹이가 남아있지 않습니다.");
    }
}
