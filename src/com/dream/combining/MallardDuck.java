package com.dream.combining;

/**
 * HeadFirstDesignPatterns
 * Created by SuSong on 2015-04-19 上午12:21.
 */
public class MallardDuck implements Quackable {

    Observable observable;

    public MallardDuck(){
        observable = new Observable(this);
    }

    @Override
    public void quack() {
        System.out.println("Quack");
        notifyObservers();
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
