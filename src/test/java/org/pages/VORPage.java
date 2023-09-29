package org.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VORPage {

	@FindBy(xpath="(//img[@src='/globalassets/logo.svg'])[2]")
	private WebElement beazleyHeader;
	
	@FindBy(xpath="//h4[text()='Substantial weakness']")
	private WebElement substantialWeaknessCards;
	
	@FindBy(xpath="(//a[contains(text(),'See all risk factors')])[2]")
	private WebElement seeAllRiskFactorsCards;
	
	@FindBy(xpath="(//img[@src='/globalassets/logo.svg'])[3]")
	private WebElement beazleyFooter;
	
	@FindBy(xpath="//a[text()='Events']")
	private WebElement eventsFooter;
	
	public VORPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public boolean checkTheDisplayOfIconInHeader()
	{
		return beazleyHeader.isDisplayed();
	}
	
	public int checkTheLengthOfTextInCards()
	{
		return substantialWeaknessCards.getText().length();
	}
	
	public boolean checkTheDisplayOfTextInCards()
	{
		return seeAllRiskFactorsCards.isDisplayed();
	}
	
	public String checksCSSPropertiesInCards()
	{
		return seeAllRiskFactorsCards.getCssValue("font-size");
	}
	
	public String checksCSSPropertiesInCardsOthers()
	{
		return seeAllRiskFactorsCards.getCssValue("font-family");
	}
	
	public String checksCSSpropertiesInCardsAnother()
	{
		return seeAllRiskFactorsCards.getCssValue("color");
	}
	
	public WebElement getSubstantialWeaknessCards()
	{
		return substantialWeaknessCards;
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
