package com.company;

public class Gumball {

    private currency money;
    private color c;
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

    public enum currency{
        NICKLE(0.05), DIME(0.10), QUARTER(0.25);

        currency(double v) {
            value = v;
        }
        private double value;
        public double getValue(){
            return value;
        }
    }
   
    

    public Gumball(color gumballColor, currency money)
    {
        this.c = gumballColor;
        this.money = money;
    }

    public String getGumballColor(){
        return c.getEnumColor();
    }

    public double getPrice(){
        return money.getValue();
    }



}
