package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    private Boolean isExtraCheese;
    private Boolean isExtraToppings;
    private Boolean isTakeAway;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        this.bill = "";
        if(isVeg) {
            this.price = 300;
        }
        else this.price = 400;
        isExtraCheese=false;
        isExtraToppings = false;
        isTakeAway = false;
    }

    public int getPrice(){

        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(!isExtraCheese) {
            isExtraCheese = true;
        }

    }

    public void addExtraToppings(){
        // your code goes here
        if(!isExtraToppings) {
            isExtraToppings = true;
        }
    }

    public void addTakeaway(){
        // your code goes here
        if(!isTakeAway) {
            isTakeAway = true;
        }
    }

    public String getBill(){
        // your code goes here
        if (isVeg) {
            this.bill += "Base Price of the Pizza: 300 \n";
        }
        else this.bill += "Base Price of the Pizza: 400 \n";

        if (isExtraCheese) {
            this.bill += "Extra Cheese Added: 80 \n";
            this.price += 80;
        }

        if (isExtraToppings) {
            if (isVeg) {
                this.bill += "Extra Toppings Added: 70 \n";
                this.price += 70;
            }

            else {
                this.bill += "Extra Toppings Added: 120 \n";
                this.price += 120;
            }
        }

        if (isTakeAway) {
            this.bill += "Paperbag Added: 20 \n";
            this.price += 20;
        }

        this.bill += "Total Price: " + this.getPrice() + " \n";
        return this.bill;
    }
}
