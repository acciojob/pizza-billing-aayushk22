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
            this.price += 80;
        }

    }

    public void addExtraToppings(){
        // your code goes here
        if(!isExtraToppings) {
            isExtraToppings = true;
            if (isVeg) {
                this.price += 70;
            }
            else this.price += 120;
        }
    }

    public void addTakeaway(){
        // your code goes here
        if(!isTakeAway) {
            isTakeAway = true;
            this.price += 20;
        }
    }

    public String getBill(){
        // your code goes here
        if (isVeg) {
            this.bill += "Base Price Of The Pizza: 300 \n";
        }
        else this.bill += "Base Price Of The Pizza: 400 \n";

        if (isExtraCheese) {
            this.bill += "Extra Cheese Added: 80 \n";

        }

        if (isExtraToppings) {
            if (isVeg) {
                this.bill += "Extra Toppings Added: 70 \n";

            }

            else {
                this.bill += "Extra Toppings Added: 120 \n";

            }
        }

        if (isTakeAway) {
            this.bill += "Paperbag Added: 20 \n";

        }

        this.bill += "Total Price: " + this.getPrice() + " \n";
        return this.bill;
    }
}
