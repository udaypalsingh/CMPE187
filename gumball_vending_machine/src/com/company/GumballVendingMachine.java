package com.company;

import java.util.ArrayList;

public class GumballVendingMachine {
    public ArrayList<Gumball> gumballs;
    public double userMoneyInput;


    public enum color{
        RED("Red"), YELLOW("Yellow");

        private String enumColor;

        color(String color) {
            enumColor = color;
        }

        public String getEnumColor() {
            return enumColor;
        }
    }

    public enum validCurrency {
        NONE(0),NICKLE(0.05), DIME(0.10), QUARTER(0.25);

        validCurrency(double v) {
            value = v;
        }

        private double value;

        public double getValue() {
            return value;
        }
    }

    public GumballVendingMachine(){
        Gumball red = new Gumball(Gumball.color.RED, Gumball.currency.NICKLE);
        Gumball yellow = new Gumball(Gumball.color.YELLOW, Gumball.currency.DIME);
        gumballs = new ArrayList<>();
        gumballs.add(red);
        gumballs.add(yellow);
        userMoneyInput = 0;
    }

    public void addUserMoneyInput(validCurrency money){
        userMoneyInput += money.getValue();
    }

    public double returnMyChange(){
        return userMoneyInput;
    }

    public Gumball dispense(color c)
    {
        if(c.getEnumColor().equals(gumballs.get(0).getGumballColor())){
            if(userMoneyInput >= gumballs.get(0).getPrice()) {
                userMoneyInput -= gumballs.get(0).getPrice();
                return gumballs.get(0);
            }
        }
        else{
            if(userMoneyInput >= gumballs.get(1).getPrice()) {
                userMoneyInput -= gumballs.get(1).getPrice();
                return gumballs.get(1);
            }
        }
        return null;
    }


}
