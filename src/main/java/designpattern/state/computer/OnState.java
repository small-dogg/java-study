package designpattern.state.computer;

public class OnState implements State{

    @Override
    public void pushButton(Computer computer) {
        System.out.println("전원 꺼짐");
        computer.changeState(new OffState());
    }
}
