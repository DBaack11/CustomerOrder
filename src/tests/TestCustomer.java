/***************************************************************
 * Name : TestCustomer.java
 * Author: Devin Baack 
 * Created : 02/04/2021 
 * Course: CIS 175 - Java II
 * Version: 10.15.7 
 * OS: macOS Catalina 
 * IDE: Eclipse 2020-06
 * Copyright : This is my own original work based on specifications 
 * issued by our instructor 
 * Description : This program tests the Customer class utilizing JUnit.
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

/**
 * @author Devin Baack - dfbaack
 * CIS175 - Spring 2021
 * Feb 4, 2021
 */
public class TestCustomer {

	Customer fred = new Customer("Fred", 20.00, 20);
	
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testAdjustWalletBalance() {
		fred.adjustWalletBalance(20);
		assertEquals(40.00, fred.getWalletBalance(), 0.0);
		
		fred.adjustWalletBalance(-16.40);
		assertEquals(23.60, fred.getWalletBalance(), 0.0);
		assertFalse(fred.getWalletBalance() < 0);
	}
	

}
