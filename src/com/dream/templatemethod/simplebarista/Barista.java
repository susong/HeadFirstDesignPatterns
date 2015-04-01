package com.dream.templatemethod.simplebarista;

/**
 * HeadFirstDesignPatterns
 * Created by Su on 2015/4/1 0001 20:29.
 */
public class Barista {
    public static void main(String[] args) {
        Tea tea = new Tea();
        Coffee coffee = new Coffee();
        System.out.println("Making tea...");
        tea.prepareRecipe();
        System.out.println("Making coffee...");
        coffee.prepareRecipe();
    }
}
