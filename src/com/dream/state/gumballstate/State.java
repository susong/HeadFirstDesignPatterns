package com.dream.state.gumballstate;

/**
 * HeadFirstDesignPatterns
 * Created by SuSong on 2015-04-17 下午10:05.
 */
public interface State {
    void insertQuarter();

    void ejectQuarter();

    void turnCrank();

    void dispense();
}
