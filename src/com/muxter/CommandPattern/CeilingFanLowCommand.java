package com.muxter.CommandPattern;

/**
 * Created by matao on 08/02/2017.
 */
public class CeilingFanLowCommand implements Command {

    private CeilingFan fan;
    private CeilingFan.SpeedLevel preSpeed;

    public CeilingFanLowCommand(CeilingFan fan) {
        this.fan = fan;
    }

    @Override
    public void execute() {
        preSpeed = fan.getSpeed();
        fan.low();
    }

    @Override
    public void undo() {
        switch (preSpeed) {
            case HIGH:
                fan.high();
                break;
            case MEDIUM:
                fan.medium();
                break;
            case LOW:
                fan.low();
                break;
            case OFF:
                fan.off();
                break;
            default:
                break;
        }
    }
}
