package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        GumballVendingMachine gumballVendingMachine= new GumballVendingMachine();
        gumballVendingMachine.addUserMoneyInput(GumballVendingMachine.validCurrency.QUARTER);


        System.out.println(gumballVendingMachine.dispense(GumballVendingMachine.color.RED).getGumballColor());
        System.out.println(gumballVendingMachine.returnMyChange());
        System.out.println(gumballVendingMachine.dispense(GumballVendingMachine.color.RED).getGumballColor());
        System.out.println(gumballVendingMachine.returnMyChange());
        System.out.println(gumballVendingMachine.dispense(GumballVendingMachine.color.RED).getGumballColor());
        System.out.println(gumballVendingMachine.returnMyChange());
    }
}
