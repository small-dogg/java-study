package designpattern.state.computer;

public class Computer {
    protected State state;

    public Computer() {
        this.state = new OffState();
    }

    public void powerPush(){
        state.pushButton(this);
    }

    protected void changeState(State state){
        this.state = state;
    }
}
