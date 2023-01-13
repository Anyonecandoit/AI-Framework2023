package com.AI.tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import driver.Driver;

public class BaseTest {

	protected BaseTest() {

	}


	@BeforeMethod
// here IO Exception is  coming  to the method because driver is taking the data from property file and in the get value method it is having exception IO .So it will be populate same to driver .
	
	
	// once we apply null check condition to the value of get property key , the IO exception will be changed to "Exception" due to implementation of new method.
	protected void setUp() throws Exception {
		Driver.initDriver();

	}


	@AfterMethod

	protected void tearDown() {
		Driver.quitDriver();


	}
}
