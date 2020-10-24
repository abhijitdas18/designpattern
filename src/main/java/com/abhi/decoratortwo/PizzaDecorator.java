package com.abhi.decoratortwo;

public class PizzaDecorator  implements Pizza{

    private Pizza pizza;

    PizzaDecorator (Pizza pizza) {
        this.pizza = pizza;
    }
    @Override
    public void bake() {
        pizza.bake();
    }
}
