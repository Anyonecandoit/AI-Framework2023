package com.AI.tests;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.AI.constants.FrameworkConstants;

import driver.Driver;

public class BaseTest {

	protected BaseTest() {

	}

	
	// so we are using reports in listeners there is no use for before and after sutie now because in listeners we are overriding the methods of ISuite listener class
	
	/**
	@BeforeSuite
	
	public void beforeSuite() {
		// ExtentReport.initReports();    //  moving this to listerners in ISUITE one on START test for better code optimisation
		//  Main reason why we are removing reports from suite is to make sure Test is not tightly coupled with the Reports . Test needs to be test , it should be free from other actions in the model.
	}
	*/
	
	/**@AfterSuite
	

	public void AfterSuite()  {
		 // ExtentReport.flushReports();     //  moving this to listeners
		
	} */
	
	
	@BeforeMethod
// here IO Exception is  coming  to the method because driver is taking the data from property file and in the get value method it is having exception IO .So it will be populate same to driver .
	
	
	// once we apply null check condition to the value of get property key , the IO exception will be changed to "Exception" due to implementation of new method.
	protected void setUp() throws Exception {
		Driver.initDriver();

	}


	@AfterMethod

	/**protected void tearDown(ITestResult result) {   we use listeners because of this reason in listerners also we have pass , fail , skip and in reports also we can log status but to avoid this confusion , we will create a listeners package.
		
		if (result.equals(ITestResult.SUCCESS){
			
		}*/
		
		protected void tearDown() throws Throwable {
			
			
		Driver.quitDriver();

		Desktop.getDesktop().browse(new File(FrameworkConstants.getReportPath()).toURI());
	}
}
