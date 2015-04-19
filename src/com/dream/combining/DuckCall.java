package com.dream.combining;

/**
 * HeadFirstDesignPatterns
 * Created by SuSong on 2015-04-19 上午12:22.
 */
public class DuckCall implements Quackable {

    Observable observable;

    public DuckCall(){
        observable = new Observable(this);
    }

    @Override
    public void quack() {
        System.out.println("Kwak");
    }

    @Override
    public void registerObserver(Observer observer) {
        observable.registerObserver(observer);
    }

    @Override
    public void notifyObservers() {
        observable.notifyObservers();
    }
}
