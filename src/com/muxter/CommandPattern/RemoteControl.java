package com.muxter.CommandPattern;

/**
 * Created by matao on 08/02/2017.
 */
public class RemoteControl {
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void pressExecuteButton() {
        command.execute();
    }

    public void pressUndoButton() {
        command.undo();
    }
}