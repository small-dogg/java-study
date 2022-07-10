package designpattern.state.computer;

public class OffState implements State{
    @Override
    public void pushButton(Computer computer) {
        System.out.println("절전 모드");
        computer.changeState(new SleepState());
    }
}
