/***************************************************************
 * Name : AllTests.java
 * Author: Devin Baack 
 * Created : 02/04/2021 
 * Course: CIS 175 - Java II
 * Version: 10.15.7 
 * OS: macOS Catalina 
 * IDE: Eclipse 2020-06
 * Copyright : This is my own original work based on specifications 
 * issued by our instructor 
 * Description : This program runs both test classes TestCustomer and TestOrder.
 * Academic Honesty: I attest that this is my original work. I have
 * not used unauthorized source code, either modified or unmodified. 
 * I have not given other fellow student(s) access to my program.
 ***************************************************************
 */
package tests;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

/**
 * @author Devin Baack - dfbaack
 * CIS175 - Spring 2021
 * Feb 4, 2021
 */
@RunWith(Suite.class)
@SuiteClasses({ TestCustomer.class, TestOrder.class })
public class AllTests {

}
