package com.solugenix.designpattern.decorator;

public class DecoratorDemo {
    public static void main(String[] args) {
        BasePizza pizza = new CapsicumDecorator(new CheeseBurstDecorator(new TandooriPizza()));
        System.out.println(pizza.createPizza());


        BasePizza pizza2 =     new CheeseBurstDecorator(new CapsicumDecorator(new VegieDelightPizza()));
        System.out.println(pizza2.createPizza());

      //  pizza = new CheeseBurstDecorator(new CapsicumDecorator(new VegieDelightPizza()));
       // System.out.println(pizza.createPizza());

    }
}
