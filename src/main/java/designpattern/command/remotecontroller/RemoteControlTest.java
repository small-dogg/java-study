package designpattern.command.remotecontroller;

import designpattern.command.remotecontroller.command.GarageDoorOpenCommand;
import designpattern.command.remotecontroller.command.LightOnCommand;

public class RemoteControlTest {
    public static void main(String[] args) {
        SimpleRemoteControl simpleRemoteControl = new SimpleRemoteControl();
        Light light = new Light("none");
        LightOnCommand lightOnCommand = new LightOnCommand(light);

        GarageDoor garageDoor = new GarageDoor("none");
        GarageDoorOpenCommand garageDoorOpenCommand = new GarageDoorOpenCommand(garageDoor);

        simpleRemoteControl.setSlot(lightOnCommand);
        simpleRemoteControl.buttonWasPressed();
        simpleRemoteControl.setSlot(garageDoorOpenCommand);
        simpleRemoteControl.buttonWasPressed();
    }
}
