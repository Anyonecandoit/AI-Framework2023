package com.AI.pages;

import org.openqa.selenium.By;

import com.tmb.enums.WaitStrategy;

import driver.DriverManager;

public class TechiedelightPage  extends Basepage{

	
	By Links =  By.tagName("a");
	
//	BY by = BY by 
	
	public TechiedelightPage gettext() {
		getLinksText(Links);
		return this;
	}
	
	
		
	}
	
	
	
	

