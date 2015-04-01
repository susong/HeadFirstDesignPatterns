package com.dream.adapter.iterenum;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Vector;

/**
 * HeadFirstDesignPatterns
 * Created by Su on 2015-4-1 11:11
 */
public class EnumerationIteratorTestDrive {
    public static void main(String[] args) {
        Vector v = new Vector(Arrays.asList("a", "b"));
        Iterator iterator = new EnumerationIterator(v.elements());
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
