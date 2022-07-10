package designpattern.state.computer;

public class SleepState implements State{
    @Override
    public void pushButton(Computer computer) {
        System.out.println("전원 켜짐");
        computer.changeState(new OnState());
    }
}
