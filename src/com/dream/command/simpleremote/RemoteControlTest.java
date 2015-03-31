package com.dream.command.simpleremote;

/**
 * HeadFirstDesignPatterns
 * Created by Su on 2015-3-31 10:41
 */
public class RemoteControlTest {
    public static void main(String[] args) {
        SimpleRemoteControl remote = new SimpleRemoteControl();
        Light light = new Light();
        LightOnCommand lightOn = new LightOnCommand(light);
        remote.setCommand(lightOn);
        remote.buttonWasPressed();

        GarageDoor garageDoor = new GarageDoor();
        GarageDoorOpenCommand doorOpen = new GarageDoorOpenCommand(garageDoor);
        remote.setCommand(doorOpen);
        remote.buttonWasPressed();
    }
}
