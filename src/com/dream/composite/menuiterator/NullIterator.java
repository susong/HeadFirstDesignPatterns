package com.dream.composite.menuiterator;

import java.util.Iterator;

/**
 * HeadFirstDesignPatterns
 * Created by SuSong on 2015-04-14 下午8:55.
 */
public class NullIterator implements Iterator {
    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public Object next() {
        return null;
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }
}
