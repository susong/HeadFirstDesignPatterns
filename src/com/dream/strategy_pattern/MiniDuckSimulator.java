package com.dream.strategy_pattern;

import com.dream.strategy_pattern.duck.Duck;
import com.dream.strategy_pattern.duck.MallardDuck;
import com.dream.strategy_pattern.duck.ModelDuck;
import com.dream.strategy_pattern.fly.impl.FlyRocketPowered;

/**
 * HeadFirstDesignPatterns
 * Created by Mr Su on 2015-3-26 11:31.
 */
public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();

        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }

}
