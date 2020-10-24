package com.abhi.strategy;

public class Divide implements Strategy{

    @Override
    public void operation(int num1, int num2) {
        System.out.println("Divide :" + (num1 / num2));
    }
}
