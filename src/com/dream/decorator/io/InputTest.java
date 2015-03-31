package com.dream.decorator.io;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * HeadFirstDesignPatterns
 * Created by Su on 2015/3/28 0028 20:58.
 */
public class InputTest {
    public static void main(String[] args) {
        int c;
        InputStream inputStream = InputTest.class.getClassLoader().getResourceAsStream("com/dream/decorator/io/test.txt");
        LowerCaseInputStream in = new LowerCaseInputStream(new BufferedInputStream(inputStream));
        try {
            while ((c = in.read()) >= 0) {
                System.out.print((char)c);
            }
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
