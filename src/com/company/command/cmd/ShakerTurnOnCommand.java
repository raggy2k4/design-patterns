package com.company.command.cmd;

import com.company.command.Shaker;

public class ShakerTurnOnCommand implements Command {

    Shaker shaker;

    public ShakerTurnOnCommand(Shaker shaker) {
        this.shaker = shaker;
    }

    @Override
    public void execute() {
        shaker.turnOn();
    }
}
