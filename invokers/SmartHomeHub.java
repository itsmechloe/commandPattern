package invokers;

import commands.Command;

public class SmartHomeHub {
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void pressButton() {
        if (command == null) {
            System.out.println("No command is assigned.");
            return;
        }

        command.execute();
    }
}