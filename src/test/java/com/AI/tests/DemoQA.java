package com.AI.tests;

import org.testng.annotations.Test;

import com.AI.pages.DemoQapage;

public class DemoQA extends BaseTest {
	
	
	@Test
	
	public void alert()  {
		
		DemoQapage dqp = new DemoQapage();
		
		dqp.alerttest();
		
		
		
	}

}
