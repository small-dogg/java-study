package designpattern.state;

import designpattern.state.computer.Computer;

public class Client {
    public static void main(String[] args) {
        Computer computer = new Computer();

        computer.powerPush();
        computer.powerPush();
        computer.powerPush();
        computer.powerPush();
        computer.powerPush();
        computer.powerPush();
        computer.powerPush();
        computer.powerPush();
        computer.powerPush();
        computer.powerPush();

    }
}
