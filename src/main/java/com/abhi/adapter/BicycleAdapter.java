package com.abhi.adapter;

public class BicycleAdapter  implements Vehicle{

    private Bicycle bicycle;

    BicycleAdapter (Bicycle bicycle){
        this.bicycle = bicycle;
    }

    @Override
    public void accelerate() {
        this.bicycle.go();
    }
}
