package com.company.command.cmd;

import com.company.command.Shaker;

public class ShakerTurnOffCommand implements Command {

    Shaker shaker;

    public ShakerTurnOffCommand(Shaker shaker) {
        this.shaker = shaker;
    }

    @Override
    public void execute() {
        shaker.turnOff();
    }
}
