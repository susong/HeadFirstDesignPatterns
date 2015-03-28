package com.dream.observer.weatherobservable;

import com.dream.observer.weather.WeatherData;

import java.util.Observable;
import java.util.Observer;

/**
 * HeadFirstDesignPatterns
 * Created by Su on 2015-3-28 14:20
 */
public class ForecastDisplay implements Observer, DisplayElement {
    private Observable observable;
    private float currentPressure = 29.92f;
    private float lastPressure;


    public ForecastDisplay(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Forecast: ");
        if (currentPressure > lastPressure) {
            System.out.println("Improving weather on the way!");
        } else if (currentPressure == lastPressure) {
            System.out.println("More of the same");
        } else if (currentPressure < lastPressure) {
            System.out.println("Watch out for cooler, rainy weather");
        }
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) o;
            lastPressure = currentPressure;
            currentPressure = weatherData.getPressure();
            display();
        }
    }
}
