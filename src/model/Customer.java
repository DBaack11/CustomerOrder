/***************************************************************
 * Name : Customer.java
 * Author: Devin Baack 
 * Created : 02/04/2021 
 * Course: CIS 175 - Java II
 * Version: 10.15.7 
 * OS: macOS Catalina 
 * IDE: Eclipse 2020-06
 * Copyright : This is my own original work based on specifications 
 * issued by our instructor 
 * Description : This program represents a Customer object.
 * Academic Honesty: I attest that this is my original work. I have
 * not used unauthorized source code, either modified or unmodified. 
 * I have not given other fellow student(s) access to my program.
 ***************************************************************
 */
package model;

/**
 * @author Devin Baack - dfbaack
 * CIS175 - Spring 2021
 * Feb 4, 2021
 */
public class Customer {
	private String customerName;
	private double walletBalance;
	private int age;
	
	public Customer() {
		super();
	}
	
	public Customer(String customerName, double walletBalance, int age) {
		super();
		this.setCustomerName(customerName);
		this.setWalletBalance(walletBalance);
		this.setAge(age);
	}

	public String getCustomerName() {
		return customerName;
	}
	
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	
	public double getWalletBalance() {
		return walletBalance;
	}
	
	public void setWalletBalance(double walletBalance) {
		this.walletBalance = walletBalance;
	}
	
	public void adjustWalletBalance(double amount) {
		this.setWalletBalance(this.getWalletBalance() + amount);
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Customer [customerName=" + this.getCustomerName() + ", walletBalance=" + this.getWalletBalance() + ", age=" + this.getAge() + "]";
	}

	
	
	
	
	
	
}
