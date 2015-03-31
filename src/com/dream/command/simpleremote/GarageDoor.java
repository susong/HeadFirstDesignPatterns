package com.dream.command.simpleremote;

/**
 * HeadFirstDesignPatterns
 * Created by Su on 2015-3-31 10:43
 */
public class GarageDoor {

    public GarageDoor() {
    }

    public void up() {
        System.out.println("Garage Door is Open");
    }

    public void down() {
        System.out.println("Garage Door is Closed");
    }

    public void stop() {
        System.out.println("Garage Door is Stopped");
    }

    public void lightOn() {
        System.out.println("Garage light is on");
    }

    public void lightOff() {
        System.out.println("Garage light is off");
    }
}
