package com.dream.combining;

/**
 * HeadFirstDesignPatterns
 * Created by SuSong on 2015-04-19 上午1:18.
 */
public abstract class AbstractDuckFactory {
    public abstract Quackable createMallardDuck();
    public abstract Quackable createRedheadDuck();
    public abstract Quackable createDuckCall();
    public abstract Quackable createRubberDuck();
}
