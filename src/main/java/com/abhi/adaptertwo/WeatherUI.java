package com.abhi.adaptertwo;

public class WeatherUI {
    public void showTemperature(int zipcode) {
        WeatherAdapter weatherAdapter = new WeatherAdapter();
        System.out.println(weatherAdapter.findTemperature(zipcode));
    }
}
