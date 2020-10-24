package com.abhi.decoratortwo;

public class TestDecorator {

    public static void main(String [] ar) {
        Pizza pizza = new PlanePizza();
        pizza.bake();

        pizza = new VeggiePizzaDecorator(new PlanePizza());
        pizza.bake();

        pizza = new ChessePizzaDecorator(new VeggiePizzaDecorator(new PlanePizza()) );
        pizza.bake();
    }
}
