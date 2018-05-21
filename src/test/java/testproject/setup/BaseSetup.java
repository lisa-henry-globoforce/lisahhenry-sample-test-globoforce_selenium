package testproject.setup;
import org.openqa.selenium.WebDriver;

import testproject.util.WebDriverManager;

public class BaseSetup {
	
	public static String browser;
	public static String chromeBrowserDriverLocation;
	public static String firefoxBrowserDriverLocation;
	
	/**
	 * Get the webDriver instance
	 */
	
	public WebDriver getDriver() {
		return WebDriverManager.webDriver;
	}
	
	
	
}
