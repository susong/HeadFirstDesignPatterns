package com.dream.command.remote;

/**
 * HeadFirstDesignPatterns
 * Created by Su on 2015-3-31 17:32
 */
public class LightOffCommand implements Command {

    Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.off();
    }
}
