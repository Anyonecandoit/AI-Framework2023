package driver;

import java.util.Objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.AI.constants.FrameworkConstants;
import com.AI.utils.ReadPropertyFile;

public class Driver {

	
	
	// private constructor is helpful for no one can call this class .
private Driver() {
	
}

//once we apply null check condition to the value of get property key , the IO exception will be changed to "Exception" due to implementation of new method.
//public static  void initDriver() throws IOException
public static  void initDriver() throws Exception {
		//if(driver==null)
		
		//checking the null condition for driver 

		if(Objects.isNull(DriverManager.getDriver())) {
			System.setProperty("webdriver.chrome.driver",FrameworkConstants.getChromedriverpath());

		WebDriver	driver = new ChromeDriver();
		
		// system.out.println(Thread.currentThreadcount formula we can use ) in this line so we can find which thread is active when test is running in parallel methods 
			DriverManager.setDriver(driver);

			
			// hardcoded url here . because of this ,  based on rule never hardcode, we are using property file .
			
			
			//DriverManager.getDriver().get("https://www.google.com/");
			DriverManager.getDriver().get(ReadPropertyFile.get("url")); // inputout exception will come because it is using property file exception
		
		}
	}

	public static  void quitDriver() {

		//	if(driver!=null)
		if(Objects.nonNull(DriverManager.getDriver())) {
			DriverManager.getDriver().quit();
			
			// unload will clear the driver instance and reset driver to null
			DriverManager.unload();

		}}


}
