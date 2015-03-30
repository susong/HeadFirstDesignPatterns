package com.dream.singleton;

/**
 * HeadFirstDesignPatterns
 * Created by Su on 2015-3-30 16:45
 */
public class Singleton {
    private volatile static Singleton mInstance;

    public static Singleton getInstance() {
        if (mInstance == null) {
            synchronized (Singleton.class) {
                if (mInstance == null) {
                    mInstance = new Singleton();
                }
            }
        }
        return mInstance;
    }

    private Singleton() {
    }
}
