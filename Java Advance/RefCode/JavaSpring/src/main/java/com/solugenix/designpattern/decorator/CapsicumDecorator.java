package com.solugenix.designpattern.decorator;

class CapsicumDecorator extends ToppingDecorator{
    BasePizza pizza;

    public CapsicumDecorator(BasePizza pizza) {
        this.pizza = pizza;
    }

    @Override
    String createPizza() {
        return pizza.createPizza() + " plus capsicum topping";
    }
}
