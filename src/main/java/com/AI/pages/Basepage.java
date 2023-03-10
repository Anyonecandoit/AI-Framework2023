package com.AI.pages;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.WebElement;

import com.AI.enums.WaitStrategy;
import com.tmb.factories.ExplicitWaitFactory;

public class Basepage {

	public List<WebElement> getLinksText(By by) {
		List<WebElement> li = driver.DriverManager.getDriver().findElements(By.tagName("a"));
		int count = li.size();
		System.out.println("Total number of links " +count);
		// ExtentManager.getExtentTest().pass("Total no of links is "  + count);
		/**
			for(int i=0; i<li.size();i++)
			{
				System.out.println(li.get(i).getText());
			}*/
		li.forEach(e -> System.out.println(e.getText()));
		return   li ;
	}

	public void sendkeys(By by , String value , WaitStrategy waitStrategy ) {
		WebElement element = ExplicitWaitFactory.performExplicitWait(waitStrategy, by);
		element.sendKeys(value);
	}

	public void click(By by, WaitStrategy waitStrategy) {
		WebElement element = ExplicitWaitFactory.performExplicitWait(waitStrategy, by);
		element.click();
	}


	
	public void select(By by , WaitStrategy waitstartegy ) {
	  

	

	    WebElement element1=ExplicitWaitFactory.performExplicitWait(waitstartegy, by);
		element1.click();


	
	  
	    
	    
	  
	        Alert alert = driver.DriverManager.getDriver().switchTo().alert();
	       
	        alert.accept();
	       // alert.dismiss();
	     alert.getText();
	       
	        alert.getText();
	        
	   
	       System.out.println("text of alert is  " + alert);
	   
	}

}
