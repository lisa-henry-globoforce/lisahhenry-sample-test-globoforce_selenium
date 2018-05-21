package testproject.appobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import testproject.setup.BaseSetup;
import testproject.uimap.TestProjectUIMap;

public class TestProjectAppObjects extends BaseSetup {

	public WebElement getFlightLink() {
        return getDriver().findElement(TestProjectUIMap.flights_link);
    }
	
	public WebElement getFlyingFrom() {
		return getDriver().findElement(TestProjectUIMap.flights_flyingFrom);
    }
	
	public WebElement getFlyingFrom_dropdown() {
		return getDriver().findElement(TestProjectUIMap.flights_flyingFrom_dropdown);
    }
	
	public WebElement getFlyingFrom_heathrow() {
		return getDriver().findElement(TestProjectUIMap.flights_flyingFrom_heathrow);
    }
	
	public WebElement getFlyingTo() {
		return getDriver().findElement(TestProjectUIMap.flights_flyingTo);
    }
	
	public WebElement getFlyingTo_dropdown() {
		return getDriver().findElement(TestProjectUIMap.flights_flyingTo_dropdown);
    }
	
	public WebElement getFlyingTo_dublin() {
		return getDriver().findElement(TestProjectUIMap.flights_flyingTo_dublin);
    }
	
	public WebElement getFlight_travelers() {
		return getDriver().findElement(TestProjectUIMap.flights_travelers);
    }
	
	public WebElement getFlight_travelers_adults(int index) {
		return getDriver().findElement(By.cssSelector(TestProjectUIMap.flights_travelers_adults.replace("${index}", ""+ index)));
    }
	
	public WebElement getFlight_departingDate() {
		return getDriver().findElement(TestProjectUIMap.flights_departingDate);
    }
	
	public WebElement getFlight_returningDate() {
		return getDriver().findElement(TestProjectUIMap.flights_returningDate);
    }
	
	public WebElement getFlight_returningDate_dtp() {
		return getDriver().findElement(TestProjectUIMap.flights_returningDate_dtp);
    }
	
	public WebElement getFlight_search_button() {
		return getDriver().findElement(TestProjectUIMap.flights_search_button);
    }
	
	public WebElement getFlightList_result1() {
		return getDriver().findElement(TestProjectUIMap.flightsList_result1);
    }
	
	public WebElement getFlightList_airlinesIncluded() {
		return getDriver().findElement(TestProjectUIMap.flightsList_airlinesIncluded);
    }
	
	public WebElement getFooter_copyright() {
		return getDriver().findElement(TestProjectUIMap.footer_copyright);
    }
	
	
}