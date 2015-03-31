package com.dream.adapter;

/**
 * HeadFirstDesignPatterns
 * Created by Su on 2015/4/1 0001 0:29.
 */
public class DuckTestDrive {
    public static void main(String[] args) {
        MallardDuck duck = new MallardDuck();
        WildTurkey turkey = new WildTurkey();
        Duck turkeyAdapter = new TurkeyAdapter(turkey);
        Turkey duckAdatper = new DuckAdapter(duck);

        System.out.println("The Turkey says...");
        testTurkey(turkey);

        System.out.println("\nThe Duck says...");
        testDuck(duck);

        System.out.println("\nThe TurkeyAdapter says...");
        testDuck(turkeyAdapter);

        System.out.println("\nThe DuckAdapter says...");
        testTurkey(duckAdatper);
    }

    static void testDuck(Duck duck){
        duck.quack();
        duck.fly();
    }

    static void testTurkey(Turkey turkey){
        turkey.gobble();
        turkey.fly();
    }
}
