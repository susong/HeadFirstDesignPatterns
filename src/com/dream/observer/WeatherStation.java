package com.dream.observer;

import com.dream.observer.weather.WeatherData;
import com.dream.observer.weatherobservable.CurrentConditionsDisplay;
import com.dream.observer.weatherobservable.ForecastDisplay;

/**
 * HeadFirstDesignPatterns
 * Created by Su on 2015-3-28 10:21.
 */
public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentConditionsDisplay= new CurrentConditionsDisplay(weatherData);
        new ForecastDisplay(weatherData);
        weatherData.setMeasurements(80,65,30.4f);
    }
}
