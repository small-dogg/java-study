package designpattern.command.remotecontroller.command;

import designpattern.command.remotecontroller.Command;
import designpattern.command.remotecontroller.Light;

public class LightOffCommand implements Command {
    Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.off();
    }

    @Override
    public void undo() {
        light.on();
    }
}
