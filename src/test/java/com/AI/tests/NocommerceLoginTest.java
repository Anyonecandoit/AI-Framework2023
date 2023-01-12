package com.AI.tests;

import com.AI.pages.NoCommerceLoginPage;

public class NocommerceLoginTest {

	
	
	public void loginandlogouttest() {
		
		NoCommerceLoginPage noc = new NoCommerceLoginPage(); 
	
		new NoCommerceLoginPage().enterEmail().enterPassword().ClickLogin();
		
	}
}
