package com.company;

/**
 * Gumball Vending Machine Class
 */
public class GumballVendingMachine {

    public Gumball red;
    public Gumball yellow;
    public double userMoneyInput;

    /**
     * Ensures the the user only insert acceptable currency
     */
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

    /**
     * Ctor for Gumball Vencding Machine
     */
    public GumballVendingMachine(){
        //initialize the variables
        this.red = new Gumball(Gumball.color.RED, Gumball.currency.NICKLE);
        this.yellow = new Gumball(Gumball.color.YELLOW, Gumball.currency.DIME);
        userMoneyInput = 0;
    }

    /**
     * Adds money to the vending machine
     * @param money is amount of money to add to vending machine
     */
    public void addUserMoneyInput(validCurrency money){
        userMoneyInput += money.getValue();
    }

    /**
     * Returns the money in the vending machine back to the user
     * @return the amount returned back to the user
     */
    public String returnMyChange(){
        String userMoney = String.format("%.2f", userMoneyInput);
        userMoneyInput = 0;
        return userMoney;
    }

    /**
     * Dispenses a RED Gumball
     * @return a String "Red Gumball has been dispensed" if the user has enough money or
     *         a String prompting a user to add more money to dispense RED Gumball
     */
    public String dispenseRedGumballLever() {
        if (userMoneyInput >= this.red.getPrice()) {
            userMoneyInput -=this.red.getPrice();
            return "Red Gumball has been dispensed";
        }
        double neededMoney = this.red.getPrice() - userMoneyInput;
        return "Insert $" + String.format("%.2f", neededMoney) + " in the vending machine to dispense Red Gumball";
    }

    /**
     * Dispenses a YELLOW Gumball
     * @return a String "Yellow Gumball has been dispensed" if the user has enough money or
     *         a String prompting a user to add more money to dispense YELLOW Gumball
     */
    public String dispenseYellowGumballLever(){
        if (userMoneyInput >= this.yellow.getPrice()) {
            userMoneyInput -=this.yellow.getPrice();
            return "Yellow Gumball has been dispensed";
        }
        double neededMoney = this.yellow.getPrice() - userMoneyInput;
        return "Insert $" +String.format("%.2f", neededMoney) + " in the vending machine to dispense Yellow Gumball";
    }
}