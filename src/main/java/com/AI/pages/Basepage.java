package com.AI.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Basepage {


	
		
		public List<WebElement> getLinksText(By by) {
		    List<WebElement> li = driver.DriverManager.getDriver().findElements(By.tagName("a"));


			int count = li.size();
			
			System.out.println("Total number of links " +count);
			
			for(int i=0; i<li.size();i++)
			{
				System.out.println(li.get(i).getText());
			
				
			}
		    
		    return   li ;
		}

	}
