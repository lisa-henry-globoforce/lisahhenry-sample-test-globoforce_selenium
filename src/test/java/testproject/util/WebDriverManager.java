package testproject.util;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverManager {

	public static WebDriver webDriver;
	public static final String firefox = "Firefox";
	public static final String chrome = "Chrome";
	
	/**
	 * Default constructor method
	 */
	public WebDriverManager() {
		// We take firefox as the default browser if none is specified
		this(firefox);
	}
	
	/**
	 * Constructor method - Creates the static global WebDriver instance
	 */
	public WebDriverManager(String browser) {
		createWebDriver(browser);
	}

	/**
	 * Creates the WebDriver based on the browser supplied
	 * @param browser - the browser type for which WebDriver to create
	 * @return - the WebDriver Instance
	 */
	public void createWebDriver(String browser){
		String chromeBrowserDriverLocation = GetPropertiesFile.getProperty("chromeBrowserDriverLocation");
		String firefoxBrowserDriverLocation = GetPropertiesFile.getProperty("firefoxBrowserDriverLocation");
		
		
		try{
			if(browser.equalsIgnoreCase("Chrome")){
				System.setProperty("webdriver.chrome.driver", chromeBrowserDriverLocation);
				webDriver = new ChromeDriver();
				webDriver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
				webDriver.manage().window().maximize();
			}else if (browser.equalsIgnoreCase("Firefox")){
				System.setProperty("webdriver.gecko.driver", firefoxBrowserDriverLocation);
				webDriver = new FirefoxDriver();
				webDriver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
				webDriver.manage().window().maximize();
			}else{
				System.out.println("WebDriverManager - Browser Not Supported");
				webDriver = null;
			}
		}catch(Exception e) {
			System.err.println("WebDriverManager - Error creating WebDriver");
			e.printStackTrace();
		}
		
		
	}
}