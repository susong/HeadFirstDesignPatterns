package com.dream.composite.menu;

/**
 * HeadFirstDesignPatterns
 * Created by SuSong on 2015-04-14 下午8:26.
 */
public class Waitress {
    private MenuComponent menuComponent;

    public Waitress(MenuComponent menuComponent){
        this.menuComponent = menuComponent;
    }

    public void printMenu(){
        menuComponent.print();
    }
}
