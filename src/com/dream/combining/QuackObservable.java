package com.dream.combining;


/**
 * HeadFirstDesignPatterns
 * Created by SuSong on 2015-04-19 上午1:53.
 */
public interface QuackObservable {
    public void registerObserver(Observer observer);
    public void notifyObservers();
}
