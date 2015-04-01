package com.dream.adapter.iterenum;

import java.util.Enumeration;
import java.util.Iterator;

/**
 * HeadFirstDesignPatterns
 * Created by Su on 2015-4-1 11:06
 */
public class EnumerationIterator implements Iterator {

    Enumeration enumeration;

    public EnumerationIterator(Enumeration enumeration){
        this.enumeration = enumeration;
    }

    @Override
    public boolean hasNext() {
        return enumeration.hasMoreElements();
    }

    @Override
    public Object next() {
        return enumeration.nextElement();
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }
}
