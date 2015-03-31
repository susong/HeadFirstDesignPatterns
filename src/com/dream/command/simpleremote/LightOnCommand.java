package com.dream.command.simpleremote;

/**
 * HeadFirstDesignPatterns
 * Created by Su on 2015-3-31 10:34
 */
public class LightOnCommand implements Command {

    Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }
}
