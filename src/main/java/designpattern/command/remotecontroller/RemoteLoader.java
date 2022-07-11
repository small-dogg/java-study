package designpattern.command.remotecontroller;

import designpattern.command.remotecontroller.command.*;

public class RemoteLoader {
    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();

        Light livingRoomLight = new Light("Living Room");
        Light kitchen = new Light("Kitchen");
        CeilingFan livingRoomFan = new CeilingFan("Living Room");
        GarageDoor garage = new GarageDoor("Garage");
        Stereo livingRoomStereo = new Stereo("Living Room");

        LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
        LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);
        LightOnCommand kitchenLightOn = new LightOnCommand(kitchen);
        LightOffCommand kitchenLightOff = new LightOffCommand(kitchen);

        CeilingFanOnCommand ceilingFanOnCommand = new CeilingFanOnCommand(livingRoomFan);
        CeilingFanOffCommand ceilingFanOffCommand = new CeilingFanOffCommand(livingRoomFan);

        GarageDoorOpenCommand garageDoorOpenCommand = new GarageDoorOpenCommand(garage);
        GarageDoorCloseCommand garageDoorCloseCommand = new GarageDoorCloseCommand(garage);

        StereoOnWithCDCommand stereoOnWithCDCommand = new StereoOnWithCDCommand(livingRoomStereo);
        StereoOffCommand stereoOffCommand = new StereoOffCommand(livingRoomStereo);

        remoteControl.setCommand(0, livingRoomLightOn, livingRoomLightOff);
        remoteControl.setCommand(1, kitchenLightOn, kitchenLightOff);
        remoteControl.setCommand(2, ceilingFanOnCommand, ceilingFanOffCommand);
        remoteControl.setCommand(3, stereoOnWithCDCommand, stereoOffCommand);

        //람다표현식으로도 대체가능
//        remoteControl.setCommand(0, ()->new LightOnCommand(livingRoomLight), ()->new LightOffCommand(livingRoomLight));

        System.out.println(remoteControl);

        remoteControl.onButtonWasPushed(0);
        remoteControl.offButtonWasPushed(0);

        remoteControl.onButtonWasPushed(1);
        remoteControl.offButtonWasPushed(1);

        remoteControl.onButtonWasPushed(2);
        remoteControl.offButtonWasPushed(2);

        remoteControl.onButtonWasPushed(3);
        remoteControl.undoButtonWasPushed();

        System.out.println(remoteControl);
    }
}
