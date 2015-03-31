package com.dream.command.simpleremote;

/**
 * HeadFirstDesignPatterns
 * Created by Su on 2015-3-31 11:09
 */
public class GarageDoorOpenCommand implements Command {

    GarageDoor garageDoor;

    public GarageDoorOpenCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    @Override
    public void execute() {
        garageDoor.up();
    }
}
