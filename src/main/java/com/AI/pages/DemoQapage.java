package com.AI.pages;

import org.openqa.selenium.By;

import com.AI.enums.WaitStrategy;

public class DemoQapage extends Basepage {
	
	
	By clickme = By.xpath("//button[@id = \"alertButton\"]");
	
	

	public void alerttest()  {
		
		select(clickme,  WaitStrategy.CLICKABLE );
		
	}

}
