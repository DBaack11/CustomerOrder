/***************************************************************
 * Name : Order.java
 * Author: Devin Baack 
 * Created : 02/04/2021 
 * Course: CIS 175 - Java II
 * Version: 10.15.7 
 * OS: macOS Catalina 
 * IDE: Eclipse 2020-06
 * Copyright : This is my own original work based on specifications 
 * issued by our instructor 
 * Description : This program represents an Order object.
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
public class Order {

	private Customer customer;
	private String orderItems;
	private double orderPrice;
	private final static double SENIOR_DISCOUNT = 0.8;
	
	public Order() {
		super();
	}
	
	public Order(Customer customer, String orderItems, double orderPrice) {
		super();
		this.setCustomer(customer);
		this.setOrderItems(orderItems);
		this.setOrderPrice(orderPrice);
	}

	public Customer getCustomer() {
		return customer;
	}
	
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	
	public String getOrderItems() {
		return orderItems;
	}
	
	public void setOrderItems(String orderItems) {
		this.orderItems = orderItems;
	}
	
	public double getOrderPrice() {
		return orderPrice;
	}
	
	public void setOrderPrice(double orderPrice) {
		this.orderPrice = orderPrice;
	}

	public void applySeniorDiscount() {
		if(this.customer.getAge() >= 65) {
			this.setOrderPrice(this.getOrderPrice() * SENIOR_DISCOUNT);
		}
	}
	
	public String checkout() {
		String result = "";
		
		if(this.getCustomer().getWalletBalance() < this.getOrderPrice()) {
			result = "Sorry! You do not have enough money for the order!";
		} else {
			this.getCustomer().adjustWalletBalance(-(this.getOrderPrice()));
			result = "Checkout Completed!\nRemaining Balance: $" + this.getCustomer().getWalletBalance();
		}
		
		return result;
	}
	
	@Override
	public String toString() {
		return "Order [customer=" + this.getCustomer() + ", orderItems=" + this.getOrderItems() + ", orderPrice=" + this.getOrderPrice() + "]";
	}
	
	
	
}
