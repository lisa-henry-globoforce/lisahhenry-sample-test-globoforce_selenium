package testproject.testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import testproject.appobjects.TestProjectAppObjects;
import testproject.setup.BaseSetup;
import testproject.tasks.CommonTasks;
import testproject.util.GetPropertiesFile;
import testproject.util.WebDriverManager;


public class TestFlightSearch extends BaseSetup {		
	

	private static final String ORIGIN_CITY = "London";
	private static final String DESTINATION_CITY = "Dublin";
	private static final String DEPARTING_DATE = "01/11/2018";
	private static final String RETURNING_DATE = "07/11/2018";
	
	private static String browser;
	private static String url;
	
	public CommonTasks tasks;
	public TestProjectAppObjects appobjects;
	public WebDriverManager manager;
	
	
	public TestFlightSearch() {
		
		browser = GetPropertiesFile.getProperty("browser");
		url = GetPropertiesFile.getProperty("url");
		manager = new WebDriverManager(browser);
		
		appobjects = new TestProjectAppObjects();
		tasks = new CommonTasks();
		
		
		
	}
	

	@BeforeTest
	public void openBrowser() {
		try{
			getDriver().get(url);
			
			System.out.print("Successfully loaded the "+ browser + " WebDriver Instance");
			System.out.println();
		}catch (Exception e) {
			System.err.println("Error finding Expedia Hompage");
			e.printStackTrace();
		}
		

	
	}
	
	

	@Test
	public void searchFilghts() {
		WebDriverWait wait = new WebDriverWait(getDriver(), 30);
		
		try{appobjects.getFlightLink().click();}catch (Exception e) {
			System.err.println("Error clicking flights link");
			e.printStackTrace();
		}
		

		try{appobjects.getFlyingFrom().sendKeys(ORIGIN_CITY);
			WebElement dropdown = wait.until(ExpectedConditions.elementToBeClickable(appobjects.getFlyingFrom_dropdown()));
			if(dropdown.isDisplayed()){
				appobjects.getFlyingFrom_heathrow().click();
			}else{
				System.err.println("Flying From Dropdown not displaying");
			}
			
		}catch (Exception e) {
			System.err.println("Error in Flying From selection");
			e.printStackTrace();
		}
		
		try{appobjects.getFlyingTo().sendKeys(DESTINATION_CITY);
			WebElement dropdown = wait.until(ExpectedConditions.elementToBeClickable(appobjects.getFlyingTo_dropdown()));
			if(dropdown.isDisplayed()){
				appobjects.getFlyingTo_dublin().click();
				
			}else{
				System.err.println("Flying To Dropdown not displaying");
			}
			
		}catch (Exception e) {
			System.err.println("Error in Flying To selection");
			e.printStackTrace();
		}
		
		try{appobjects.getFlight_travelers().click();
			appobjects.getFlight_travelers_adults(2).click();
		}catch (Exception e) {
			System.err.println("Error in number of travelers selection");
			e.printStackTrace();
		}
		
		
		try{appobjects.getFlight_departingDate().sendKeys(DEPARTING_DATE);}catch (Exception e) {
			System.err.println("Error in departing date selection");
			e.printStackTrace();
		}
		
		try{appobjects.getFlight_returningDate().click();
			appobjects.getFlight_returningDate_dtp().click();
		}catch (Exception e) {
			System.err.println("Error in returning date selection");
			e.printStackTrace();
		}
		
		
		
		
		try{appobjects.getFlight_search_button().click();}catch (Exception e) {
			System.err.println("Error clicking Search Button");
			e.printStackTrace();
		}
		
		
		getDriver().manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		
		String resultList = appobjects.getFlightList_result1().getText();
		assert(resultList.contains("€85")):"Incorrect result price found; expected €85";
		assert(!resultList.contains("€0.92")):"Incorreect result price found; €0.92 not expected";
			
		String footerCopyright = appobjects.getFooter_copyright().getText();
		String expectedFooterCopyright = "© 2018 Expedia, Inc. All rights reserved.";
		
		assert(appobjects.getFlightList_airlinesIncluded().isDisplayed()):"Airlines included panel not displayed";
		assert(footerCopyright.equalsIgnoreCase(expectedFooterCopyright)):"Footer copyright not found";	
		
		
		
	}
		
		
	
	
	
	/*
	 * Close the Web Browser
	 * 
	 */
	@AfterTest
	public void closeBrowser() {
		getDriver().close();
	}
	
	
}


