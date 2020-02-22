package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        GumballVendingMachine gumballVendingMachine= new GumballVendingMachine();
        gumballVendingMachine.addUserMoneyInput(GumballVendingMachine.validCurrency.DIME);

        System.out.println(gumballVendingMachine.dispenseRedGumballLever());
        System.out.println(gumballVendingMachine.returnMyChange());
        System.out.println(gumballVendingMachine.dispenseYellowGumballLever());
        System.out.println(gumballVendingMachine.returnMyChange());
        System.out.println(gumballVendingMachine.dispenseYellowGumballLever());
        System.out.println(gumballVendingMachine.returnMyChange());
        System.out.println(gumballVendingMachine.dispenseRedGumballLever());
        System.out.println(gumballVendingMachine.returnMyChange());
        System.out.println(gumballVendingMachine.dispenseRedGumballLever());
        System.out.println(gumballVendingMachine.returnMyChange());
        System.out.println(gumballVendingMachine.dispenseYellowGumballLever());
        System.out.println(gumballVendingMachine.returnMyChange());
    }
}
