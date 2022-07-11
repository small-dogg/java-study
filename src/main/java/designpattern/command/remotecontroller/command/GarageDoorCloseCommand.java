package designpattern.command.remotecontroller.command;

import designpattern.command.remotecontroller.Command;
import designpattern.command.remotecontroller.GarageDoor;

public class GarageDoorCloseCommand implements Command {
    GarageDoor garageDoor;

    public GarageDoorCloseCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }


    @Override
    public void execute() {
        garageDoor.down();
    }

    @Override
    public void undo() {
        garageDoor.up();
    }
}
