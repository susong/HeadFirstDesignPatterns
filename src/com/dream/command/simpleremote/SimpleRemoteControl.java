package com.dream.command.simpleremote;

/**
 * HeadFirstDesignPatterns
 * Created by Su on 2015-3-31 10:39
 */
public class SimpleRemoteControl {
    Command slot;

    public SimpleRemoteControl() {
    }

    public void setCommand(Command command) {
        slot = command;
    }

    public void buttonWasPressed() {
        slot.execute();
    }
}
