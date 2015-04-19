package com.dream.combining;

/**
 * HeadFirstDesignPatterns
 * Created by SuSong on 2015-04-19 上午2:27.
 */
public class Quackologist implements Observer {
    @Override
    public void update(QuackObservable duck) {
        System.out.println("Quackologist: "+duck+" just quacked.");
    }
}
