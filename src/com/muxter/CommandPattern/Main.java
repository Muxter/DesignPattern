package com.muxter.CommandPattern;

/**
 * Created by matao on 08/02/2017.
 */
public class Main {
    public static void main(String[] args) {
        RemoteControl control = new RemoteControl();
        CeilingFan fan = new CeilingFan();
        CeilingFanHighCommand highCommand = new CeilingFanHighCommand(fan);
        CeilingFanMediumCommand mediumCommand = new CeilingFanMediumCommand(fan);
        CeilingFanLowCommand lowCommand = new CeilingFanLowCommand(fan);
        CeilingFanOffCommand offCommand = new CeilingFanOffCommand(fan);

        control.setCommand(highCommand);
        control.pressExecuteButton();

        control.setCommand(lowCommand);
        control.pressExecuteButton();
        control.pressUndoButton();
    }
}
