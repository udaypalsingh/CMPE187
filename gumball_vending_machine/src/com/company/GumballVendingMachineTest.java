package com.company;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class GumballVendingMachineTest {
	
	String red = "Red Gumball has been dispensed";
	String yellow = "Yellow Gumball has been dispensed";
	
	@Test
	/**
	 * Tests returning change and dispensing 2 red gumballs, getting change back and checks that a gumball isn't returned with no money. 
	 */
	void redTest() {
		GumballVendingMachine gumballVendingMachine= new GumballVendingMachine();
		gumballVendingMachine.insertCoin("QUARTER");
		assertEquals(gumballVendingMachine.dispenseRedGumballLever(),red);
		assertEquals(gumballVendingMachine.dispenseRedGumballLever(),red);
		assertEquals(gumballVendingMachine.returnMyChange(),String.format("%.2f", .15));
		assertEquals(gumballVendingMachine.dispenseRedGumballLever(),"Insert $" + String.format("%.2f", .05) + " in the vending machine to dispense Red Gumball");
		System.out.println("redTest has been completed; 2 red gumballs dispensed and 15 cents returned");
	}
	
	@Test
	/**
	 * Tests using all types of valid currency and dispensing 3 gumballs. Then returns change and inserts one dime to get another yellow gumball
	 */
	void yellowTest() {
		GumballVendingMachine gumballVendingMachine= new GumballVendingMachine();
		gumballVendingMachine.insertCoin("QUARTER");
		gumballVendingMachine.insertCoin("DIME");
		gumballVendingMachine.insertCoin("NICKLE");
		assertEquals(gumballVendingMachine.dispenseYellowGumballLever(),yellow);
		assertEquals(gumballVendingMachine.dispenseYellowGumballLever(),yellow);
		assertEquals(gumballVendingMachine.dispenseYellowGumballLever(),yellow);
		assertEquals(gumballVendingMachine.returnMyChange(),String.format("%.2f", 0.1));
		gumballVendingMachine.insertCoin("DIME");
		assertEquals(gumballVendingMachine.dispenseYellowGumballLever(),yellow);
	}
	
	@Test
	/**
	 * Tests dispensing two red gumballs and two yellow gumballs
	 */
	void multiTest() {
		GumballVendingMachine gumballVendingMachine= new GumballVendingMachine();
		gumballVendingMachine.insertCoin("QUARTER");
		gumballVendingMachine.insertCoin("DIME");
		gumballVendingMachine.insertCoin("NICKLE");
		assertEquals(gumballVendingMachine.dispenseYellowGumballLever(),yellow);
		assertEquals(gumballVendingMachine.dispenseRedGumballLever(),red);
		assertEquals(gumballVendingMachine.dispenseRedGumballLever(),red);
		assertEquals(gumballVendingMachine.dispenseYellowGumballLever(),yellow);
	}
	
	@Test
	/**
	 * Tests using one valid currency and one invalid currency. Then attempts to dispense two yellow gumballs.
	 */
	void fakeCurrency() {
		GumballVendingMachine gumballVendingMachine= new GumballVendingMachine();
		gumballVendingMachine.insertCoin("TOKEN");
		gumballVendingMachine.insertCoin("DIME");
		assertEquals(gumballVendingMachine.dispenseYellowGumballLever(),"Invalid Currency: TOKEN");
		assertEquals(gumballVendingMachine.dispenseYellowGumballLever(),yellow);
	}

}
