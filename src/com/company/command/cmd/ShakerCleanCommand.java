package com.company.command.cmd;

import com.company.command.Shaker;

public class ShakerCleanCommand implements Command {

    Shaker shaker;

    public ShakerCleanCommand(Shaker shaker) {
        this.shaker = shaker;
    }

    @Override
    public void execute() {
        shaker.clean();
    }
}
