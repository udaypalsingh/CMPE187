package com.company;

/**
 * Class for Gumball
 */
public class Gumball {

    /**
     * Enum color ensures that the color of the gumball would be either RED or YELLOW
     */
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

    /**
     * Enum currency ensures that the money acceptable of the gumball would be either NICKLE, DIME, or QUARTER
     */
    public enum currency{
        NONE(0),NICKLE(0.05), DIME(0.10), QUARTER(0.25);

        currency(double v) {
            value = v;
        }
        private double value;
        public double getValue(){
            return value;
        }
    }


    private currency price;
    private color c;

    /**
     * Ctor of Gumball
     * @param gumballColor is color of a Gumball
     * @param price is price of gumball
     */
    public Gumball(color gumballColor, currency price)
    {
        this.c = gumballColor;
        this.price = price;
    }

    /**
     * Gets the color of a Gumball
     * @return the color of a Gumball
     */
    public String getGumballColor(){
        return c.getEnumColor();
    }

    /**
     * Gets the price of a Gumball
     * @return the price of a Gumball
     */
    public double getPrice(){
        return price.getValue();
    }
}
