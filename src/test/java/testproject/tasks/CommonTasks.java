package testproject.tasks;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import testproject.setup.BaseSetup;

public class CommonTasks extends BaseSetup{
	
	
	public boolean verifyElementExists(By locator){
		WebDriverWait wait = new WebDriverWait(getDriver(), 30);
		assert ((wait.until(ExpectedConditions.elementToBeClickable(locator)))!=null): "Element does exist";
		
		return true;
	}

	
	
	
}
