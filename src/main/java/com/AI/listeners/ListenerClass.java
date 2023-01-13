package com.AI.listeners;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.AI.Reports.ExtentManager;
import com.AI.Reports.ExtentReport;
import com.AI.constants.FrameworkConstants;

public class ListenerClass  implements ITestListener , ISuiteListener{

	@Override
	public void onStart(ISuite suite) {
		 ExtentReport.initReports();  
		
	}

	@Override
	public void onFinish(ISuite suite) {
		try {
			ExtentReport.flushReports();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		 try {
			Desktop.getDesktop().browse(new File(FrameworkConstants.getReportPath()).toURI());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void onTestStart(ITestResult result) {
		ExtentReport.createTest(result.getMethod().getMethodName()); 
	}

	@Override
	public void onTestSuccess(ITestResult result) {
	
		ExtentManager.getExtentTest().pass(result.getMethod().getMethodName() + "is passed");
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		ExtentManager.getExtentTest().fail(result.getMethod().getMethodName() + "is failed");
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		ExtentManager.getExtentTest().skip(result.getMethod().getMethodName() + "is skipped");
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
		
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		
		
	}

	@Override
	public void onStart(ITestContext context) {
	
		
	}

	@Override
	public void onFinish(ITestContext context) {
		
		
	}

}