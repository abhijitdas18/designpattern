package com.abhi.adapter;
// Convert an interface of a class into another interface the client expects.
// Favour composition over inheritance
// It enable classes working together
public class TestAdapter {

    public static void main(String [] ar){

        Vehicle bus = new Bus();
        Vehicle car = new Car();
        Vehicle bicycle = new BicycleAdapter(new Bicycle());

        bus.accelerate();
        car.accelerate();
        bicycle.accelerate();

    }
}
