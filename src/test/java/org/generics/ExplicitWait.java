package org.generics;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait extends Base {

	public static void explicitWaitForSeconds(WebElement element)
	{
		WebDriverWait wait = new WebDriverWait(driver,ETO);
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}
	
	public static void explicitWaitForMinutes(WebElement element)
	{
		WebDriverWait wait = new WebDriverWait(driver,MTO);
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}
	
}
