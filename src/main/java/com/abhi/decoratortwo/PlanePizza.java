package com.abhi.decoratortwo;

public class PlanePizza implements  Pizza{
    @Override
    public void bake() {
        System.out.println("Making plane pizza...");
    }
}
