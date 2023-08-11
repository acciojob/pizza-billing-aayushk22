package com.driver;

public class DeluxePizza extends Pizza {

    public DeluxePizza(Boolean isVeg) {
        super(isVeg);
        // your code goes here
        super.addExtraCheese(); //has extra cheese by default
        super.addExtraToppings(); //has extra topping by default
    }
}
