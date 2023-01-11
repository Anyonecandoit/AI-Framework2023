package com.AI.tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import driver.Driver;

public class BaseTest {

	protected BaseTest() {

	}


	@BeforeMethod

	public void setUp() {
		Driver.initDriver();

	}


	@AfterMethod

	public void tearDown() {
		Driver.quitDriver();


	}
}
