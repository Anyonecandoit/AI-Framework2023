package driver;

import java.util.Objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.AI.constants.FrameworkConstants;

public class Driver {



	public static WebDriver driver ;
	public static  void initDriver() {
		//if(driver==null)

		if(Objects.isNull(driver)) {
			System.setProperty("webdriver.chrome.driver",FrameworkConstants.getChromedriverpath());

			driver = new ChromeDriver();
			DriverManager.setDriver(driver);

			DriverManager.getDriver().get("https://www.google.com/");
		}
	}

	public static  void quitDriver() {

		//	if(driver!=null)
		if(Objects.nonNull(DriverManager.getDriver())) {
			DriverManager.getDriver().quit();
			DriverManager.unload();

		}}


}
