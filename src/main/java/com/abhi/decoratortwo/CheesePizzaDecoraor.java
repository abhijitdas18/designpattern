package com.abhi.decoratortwo;

class ChessePizzaDecorator extends  PizzaDecorator{
    ChessePizzaDecorator(Pizza pizza) {
        super(pizza);
    }

    public void bake() {
        super.bake();;
        System.out.println("Adding cheese topping used...");
    }
}
