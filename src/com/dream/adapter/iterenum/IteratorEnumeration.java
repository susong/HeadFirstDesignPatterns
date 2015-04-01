package com.dream.adapter.iterenum;

import java.util.Enumeration;
import java.util.Iterator;

/**
 * HeadFirstDesignPatterns
 * Created by Su on 2015-4-1 11:09
 */
public class IteratorEnumeration implements Enumeration {

    Iterator iterator;

    public IteratorEnumeration(Iterator iterator) {
        this.iterator = iterator;
    }

    @Override
    public boolean hasMoreElements() {
        return iterator.hasNext();
    }

    @Override
    public Object nextElement() {
        return iterator.next();
    }
}
