package testproject.uimap;

import org.openqa.selenium.By;

public class TestProjectUIMap {
		
		// menu
	    public static By		flights_link					= By.cssSelector("#primary-header-flight");
	    
	    // flights
	    public static By		flights_flyingFrom				= By.cssSelector("#flight-origin-flp");
	    public static By		flights_flyingFrom_dropdown		= By.cssSelector("#gcw-flights-form-flp > div.cols-nested.ab25184-location > div:nth-child(1) > div > div.autocomplete-dropdown");
	    public static By		flights_flyingFrom_heathrow 	= By.cssSelector("#aria-option-1");
	    
	    public static By		flights_flyingTo				= By.cssSelector("#flight-destination-flp");
	    public static By		flights_flyingTo_dropdown		= By.cssSelector("#gcw-flights-form-flp > div.cols-nested.ab25184-location > div:nth-child(2) > div > div.autocomplete-dropdown");
	    public static By		flights_flyingTo_dublin		 	= By.cssSelector("#aria-option-0");
	    
	    public static By		flights_departingDate			= By.cssSelector("#flight-departing-flp");
	    public static By		flights_returningDate			= By.cssSelector("#flight-returning-flp");
	    public static By		flights_returningDate_dtp		= By.cssSelector("#flight-returning-wrapper-flp > div > div > div:nth-child(5) > table > tbody > tr:nth-child(2) > td:nth-child(3) > button");
	    
	    public static By 		flights_travelers				= By.cssSelector("#flight-adults-flp");
	    public static String 	flights_travelers_adults		= "#flight-adults-flp > option:nth-child(${index})";
	       
	    public static By		flights_search_button			= By.cssSelector("[class='btn-primary btn-action gcw-submit']");
	    
	    
	    // search results
	    public static By 		flightsList						= By.cssSelector("#flightModuleList");
	    public static By 		flightsList_result1				= By.cssSelector("#flightModuleList > li");
		public static By		flightsList_airlinesIncluded	= By.cssSelector("#airlines");
	    
		//footer
		public static By 		footer_copyright				= By.cssSelector("#footer-copyright-msg");
		

}
