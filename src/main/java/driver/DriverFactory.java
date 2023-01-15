/**
 * 
 */
package driver;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.AI.enums.ConfigProperties;
import com.AI.utils.PropertyUtils;

import io.github.bonigarcia.wdm.WebDriverManager;


public final class DriverFactory {

	private DriverFactory() {
	}


	public static WebDriver getDriver(String browser) throws MalformedURLException {

		WebDriver driver = null;
	
		String runmode = PropertyUtils.get(ConfigProperties.RUNMODE);
		if (browser.equalsIgnoreCase("chrome"))
			 
		
		{
			if (runmode.equalsIgnoreCase("remote")) {
				DesiredCapabilities cap = new DesiredCapabilities();
				cap.setBrowserName(BrowserType.CHROME);
				//cap.setVersion(version);
				//driver = new RemoteWebDriver(new URL(PropertyUtils.get(ConfigProperties.SELENIUMGRIDURL)), cap);
				driver = new RemoteWebDriver(new URL("http://44.213.77.244:4444"), cap);
			} else {
				WebDriverManager.chromedriver().setup();
				
				driver = new ChromeDriver();
				
			}
		} else if (browser.equalsIgnoreCase("firefox")) {

			if (runmode.equalsIgnoreCase("remote")) {
				DesiredCapabilities cap = new DesiredCapabilities();
				cap.setBrowserName(BrowserType.FIREFOX);
			//	cap.setVersion(version);
				driver = new RemoteWebDriver(new URL("http://44.213.77.244:4444"), cap);
			} else {
				WebDriverManager.firefoxdriver().setup();
				driver = new FirefoxDriver();
			}
		}
		return driver;
	}

}



/**public interface BrowserType {
	  String FIREFOX = "firefox";
	  String FIREFOX_PROXY = "firefoxproxy";
	  String FIREFOX_CHROME = "firefoxchrome";
	  String GOOGLECHROME = "googlechrome";
	  String SAFARI = "safari";
	  
	 
	  String OPERA = "opera";
	  String OPERA_BLINK = "operablink";
	  String EDGE = "MicrosoftEdge";
	  String IEXPLORE= "iexplore";
	  String IEXPLORE_PROXY= "iexploreproxy";
	  String SAFARI_PROXY = "safariproxy";
	  String CHROME = "chrome";
	  String KONQUEROR = "konqueror";
	  String MOCK = "mock";
	  String IE_HTA="iehta";

	  String ANDROID = "android";
	  String HTMLUNIT = "htmlunit";
	  String IE = "internet explorer";
	  String IPHONE = "iPhone";
	 
	
	
*****/