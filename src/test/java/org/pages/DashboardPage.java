package org.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage {

	@FindBy(xpath="(//img[@src='/globalassets/logo.svg'])[2]")
	private WebElement beazleyHeader;
	
	@FindBy(xpath="//h4[text()='Critical weakness']")
	private WebElement criticalWeaknessCards;
	
	@FindBy(xpath="//div[text()='Widespread Ransomware']")
	private WebElement wideSpreadRansomwareCards;
	
	@FindBy(xpath="//label[text()='Endpoint']")
	private WebElement endpointCards;
	
	@FindBy(xpath="(//img[@src='/globalassets/logo.svg'])[3]")
	private WebElement beazleyFooter;
	
	@FindBy(xpath="//a[text()='Events']")
	private WebElement eventsFooter;
	
	public DashboardPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public boolean checkTheDisplayOfIconInHeader()
	{
		return beazleyHeader.isDisplayed();
	}
	
	public int checkTheLengthOfTextInCards()
	{
		return criticalWeaknessCards.getText().length();
	}
	
	public boolean checkTheDisplayOfTextInCards()
	{
		return wideSpreadRansomwareCards.isDisplayed();
	}
	
	public String checksCSSPropertiesInCards()
	{
		return endpointCards.getCssValue("font-size");
	}
	
	public String checksCSSPropertiesInCardsOthers()
	{
		return endpointCards.getCssValue("font-family");
	}
	
	public String checksCSSpropertiesInCardsAnother()
	{
		return endpointCards.getCssValue("color");
	}
	
	public WebElement getCriticalWeaknessCards()
	{
		return criticalWeaknessCards;
	}
	
	public int checkTheLengthOfTextInFooter()
	{
		return eventsFooter.getText().length();
	}
	
	public boolean checkTheDisplayOfIconInFooter()
	{
		return beazleyFooter.isDisplayed();
	}
	
	public String checksCSSPropertiesInFooter()
	{
		return eventsFooter.getCssValue("font-size");
	}
	
	public String checksCSSPropertiesInFooterOthers()
	{
		return eventsFooter.getCssValue("font-family");
	}
	
	public String checksCSSpropertiesInFooterAnother()
	{
		return eventsFooter.getCssValue("color");
	}
	
	public WebElement getEventsFooter()
	{
		return eventsFooter;
	}
	
}
