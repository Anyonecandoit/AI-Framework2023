package com.AI.constants;

public final  class FrameworkConstants {

	private FrameworkConstants() {}


	// DriverManager.getDriver().get("https://www.google.com/");
	
	//In driver class we are hardcoding the value but to avoid that we can use that url in this constant class but if any manual tester come and work here he will be confused where he have to change the url . so to avoid that we can user property file.
	
	
	
private static final String RESOURCESPATH =	System.getProperty("user.dir")+ "/src/test/resources/";
	
	
	
	// chromedriver path
	private static final String CHROMEDRIVERPATH = RESOURCESPATH + "/executables/chromedriver.exe";

	
// configfile path
	private static final String CONFIGFILEPATH = RESOURCESPATH+ "/config/config.properties";
	
	
	
	private static final int EXPLICITWAIT = 10;

	private static String getResourcespath() {
		return RESOURCESPATH;
	}

	public static int getExplicitwait() {
		return EXPLICITWAIT;
	}


	public static String getChromedriverpath() {
		return CHROMEDRIVERPATH;
	}

	public static String getConfigfilepath() {
		return CONFIGFILEPATH;
	}


}
