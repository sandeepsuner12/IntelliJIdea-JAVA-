package com.solugenix.solid.interfacesegregation;

public class Waiter1 implements RestaurantEmployee{
    @Override
    public void washDishes() {
        System.out.println("i dont wash dishes");
    }

    @Override
    public void serveCustomers() {
        System.out.println(" Serve Customers");
    }

    @Override
    public void cookFood() {
        System.out.println("I dont cook food");
    }
}
