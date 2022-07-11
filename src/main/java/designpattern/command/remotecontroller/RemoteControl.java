package designpattern.command.remotecontroller;

import designpattern.command.remotecontroller.command.NoCommand;

public class RemoteControl {
    Command[] onCommands;
    Command[] offCommands;
    Command undoCommand;

    public RemoteControl() {
        //커맨드가 주입되지 않은 상태로 초기화
        onCommands = new Command[7];
        offCommands = new Command[7];

        Command noCommand = new NoCommand();
        for (int i = 0; i < 7; i++) {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
        undoCommand = noCommand;
    }

    public void setCommand(int slot, Command onCommand, Command offCommand) {
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    public void onButtonWasPushed(int slot) {
        onCommands[slot].execute();
        undoCommand = onCommands[slot];
    }

    public void offButtonWasPushed(int slot) {
        offCommands[slot].execute();
        undoCommand = onCommands[slot];
    }

    public void undoButtonWasPushed(){
        undoCommand.undo();
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("\n-------리모컨---------\n");
        for (int i = 0; i < onCommands.length; i++) {
            stringBuffer.append("[slot " + i + "] " + onCommands[i].getClass().getSimpleName()
                    + "   " + offCommands[i].getClass().getSimpleName() + "\n");
        }
        stringBuffer.append("[undo] " + undoCommand.getClass().getSimpleName()+"\n");
        return stringBuffer.toString();
    }


}
