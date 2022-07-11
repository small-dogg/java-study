package designpattern.command.remotecontroller.command;

import designpattern.command.remotecontroller.CeilingFan;
import designpattern.command.remotecontroller.Command;

public class CeilingFanOffCommand implements Command {
    CeilingFan ceilingFan;

    public CeilingFanOffCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }


    @Override
    public void execute() {
        ceilingFan.off();
    }

    @Override
    public void undo() {
        ceilingFan.high();
    }
}
