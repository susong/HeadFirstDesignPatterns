package com.dream.adapter.iterenum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;

/**
 * HeadFirstDesignPatterns
 * Created by Su on 2015-4-1 11:16
 */
public class IteratorEnumerationTestDrive {
    public static void main(String[] args) {
        ArrayList l = new ArrayList(Arrays.asList("a","b"));
        Enumeration enumeration = new IteratorEnumeration(l.iterator());
        while (enumeration.hasMoreElements()){
            System.out.println(enumeration.nextElement());
        }
    }
}
