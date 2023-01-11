package com.AI.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import driver.DriverManager;

public final class HomepageTest extends BaseTest {
	private  HomepageTest() {

	}

	@Test


	public void test3() {


		DriverManager.getDriver().findElement(By.name("q")).sendKeys("selenium",Keys.ENTER);


	}

}
