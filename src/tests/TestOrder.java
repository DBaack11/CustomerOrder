/***************************************************************
 * Name : TestOrder.java
 * Author: Devin Baack 
 * Created : 02/04/2021 
 * Course: CIS 175 - Java II
 * Version: 10.15.7 
 * OS: macOS Catalina 
 * IDE: Eclipse 2020-06
 * Copyright : This is my own original work based on specifications 
 * issued by our instructor 
 * Description : This program tests the Order class utilizing JUnit.
 * Academic Honesty: I attest that this is my original work. I have
 * not used unauthorized source code, either modified or unmodified. 
 * I have not given other fellow student(s) access to my program.
 ***************************************************************
 */
package tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import model.Customer;
import model.Order;

/**
 * @author Devin Baack - dfbaack
 * CIS175 - Spring 2021
 * Feb 4, 2021
 */
public class TestOrder {

	Customer leo = new Customer("Leo", 50.00, 66);
	Order applebees = new Order(leo, "burger, fries, lemonade", 26.60);
	
	@Before
	public void setUp() throws Exception {
		applebees.applySeniorDiscount();
	}

	@Test
	public void testApplySeniorDiscount() {
		assertTrue(leo.getAge() > 65);
		assertEquals(21.28, applebees.getOrderPrice(), 0.01);
	}
	
	@Test
	public void testCheckout() {
		assertEquals("Checkout Completed!\nRemaining Balance: $28.72", applebees.checkout());
		applebees.setOrderPrice(100.0);
		assertEquals("Sorry! You do not have enough money for the order!", applebees.checkout());
	}

}
