package com.company.command;

import com.company.command.cmd.Command;

import java.util.ArrayList;
import java.util.List;

public class ShakerApp {

    List<Command> shakerCommands = new  ArrayList<Command>();

    void addCommand(Command command){
        shakerCommands.add(command);
    }

    void run(){

        if (shakerCommands.isEmpty()){
            System.out.println("no commands");
            return;
        }

        for (Command command: shakerCommands){
            command.execute();
        }

        shakerCommands.clear();
    }
}
