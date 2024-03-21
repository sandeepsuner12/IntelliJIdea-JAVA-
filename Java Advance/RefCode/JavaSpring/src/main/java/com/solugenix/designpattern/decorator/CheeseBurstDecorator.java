package com.solugenix.designpattern.decorator;

class CheeseBurstDecorator extends ToppingDecorator{
    BasePizza pizza;

    public CheeseBurstDecorator(BasePizza pizza) {
        this.pizza = pizza;
    }

    @Override
    String createPizza() {
        return pizza.createPizza() + " plus cheese burst topping";
    }
}
