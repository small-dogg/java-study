package designpattern.command.output;

public class MainEntry {
    public static void main(String[] args) {
        CommandGroup commandGroup = new CommandGroup();

        commandGroup.add(new ClearCommand());
        commandGroup.add(new ColorCommand(ColorCommand.Color.YELLOW));
        commandGroup.add(new MoveCommand(10, 1));
        PrintCommand printCommand = new PrintCommand("안녕하세요! 디자인패턴!");
        commandGroup.add(printCommand);
        commandGroup.add(new ColorCommand(ColorCommand.Color.BLUE));
        commandGroup.add(printCommand);

        commandGroup.run();
    }
}
