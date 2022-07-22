package designpattern.proxy.gumballmachine;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class GumballMachine extends UnicastRemoteObject implements GumballMachineRemote {

    private static final long serialVersionUID = 2L;

    private State soldOutState;
    private State noQuarterState;
    private State hasQuarterState;
    private State soldState;
    private String location;

    State state = soldOutState;
    int count = 0;

    public GumballMachine(String location, int numberGumballs) throws RemoteException {
        this.soldOutState = new SoldOutState(this);
        this.noQuarterState = new NoQuarterState(this);
        this.hasQuarterState = new HasQuarterState(this);
        this.soldState = new SoldState(this);

        this.count = numberGumballs;
        if (numberGumballs > 0) {
            state = noQuarterState;
        } else {
            state = soldOutState;
        }
    }

    public State getSoldOutState() {
        return soldOutState;
    }

    public State getNoQuarterState() {
        return noQuarterState;
    }

    public State getHasQuarterState() {
        return hasQuarterState;
    }

    public State getSoldState() {
        return soldState;
    }

    @Override
    public int getCount() {
        return count;
    }

    @Override
    public String getLocation() {
        return location;
    }

    @Override
    public State getState() {
        return state;
    }

    public void insertQuarter() {
        state.insertQuarter();
    }
    public void ejectQuarter() {
        state.ejectQuarter();
    }
    public void turnCrank() {
        state.turnCrank();
    }
    void setState(State state) {
        this.state = state;
    }

    void releaseBall(){
        System.out.println("알맹이를 내보내고 있습니다.");
        if (count > 0) {
            count = count - 1;
        }
    }
}
