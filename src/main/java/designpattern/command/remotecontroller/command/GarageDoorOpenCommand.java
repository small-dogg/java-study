package designpattern.command.remotecontroller.command;

import designpattern.command.remotecontroller.Command;
import designpattern.command.remotecontroller.GarageDoor;

public class GarageDoorOpenCommand implements Command {
    GarageDoor garageDoor;

    public GarageDoorOpenCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }


    @Override
    public void execute() {
        garageDoor.up();
    }

    @Override
    public void undo() {
        garageDoor.down();
    }
}
