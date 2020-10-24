package com.abhi.adaptertwo;

public class WeatherAdapter {
    public int findTemperature(int zipCode) {
        String city = null;
        if(zipCode == 781018){
            city = "Guwahati";
        }
        WeatherFinder weatherFinder = new WeatherFinderImpl();
        int temperature = weatherFinder.find(city);
        return temperature;
    }
}
