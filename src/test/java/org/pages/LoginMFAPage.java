package org.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginMFAPage {

	@FindBy(xpath="//h1[contains(text(),'Login')]")
	private WebElement loginHeader;
	
	@FindBy(xpath="(//img[@src='/globalassets/logo.svg'])[2]")
	private WebElement beazleyHeader;
	
	@FindBy(xpath="//h2[contains(text(),'Login to your Beazley digital account')]")
	private WebElement loginToYourBeazleyDigitalAccountCards;
	
	@FindBy(xpath="//h2[contains(text(),'Looking for more Broker information?')]")
	private WebElement lookingForMoreBrokerInformationCards;
	
	@FindBy(xpath="//a[text()='Careers']")
	private WebElement careersFooter;
	
	@FindBy(xpath="(//img[@src='/globalassets/logo.svg'])[3]")
	private WebElement beazleyFooter;
	
	public LoginMFAPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public int checkTheLengthOfTextInHeader()
	{
		return loginHeader.getText().length();
	}
	
	public boolean checkTheDisplayOfIconInHeader()
	{
		return beazleyHeader.isDisplayed();
	}
	
	public String checksCSSPropertiesInHeader()
	{
		return loginHeader.getCssValue("font-size");
	}
	
	public String checksCSSPropertiesInHeaderOthers()
	{
		return loginHeader.getCssValue("font-family");
	}
	
	public String checksCSSpropertiesInHeaderAnother()
	{
		return loginHeader.getCssValue("color");
	}
	
	public int checkTheLengthOfTextInCards()
	{
		return loginToYourBeazleyDigitalAccountCards.getText().length();
	}
	
	public boolean checkTheDisplayOfTextInCards()
	{
		return lookingForMoreBrokerInformationCards.isDisplayed();
	}
	
	public String checksCSSPropertiesInCards()
	{
		return loginToYourBeazleyDigitalAccountCards.getCssValue("font-size");
	}
	
	public String checksCSSPropertiesInCardsOthers()
	{
		return loginToYourBeazleyDigitalAccountCards.getCssValue("font-family");
	}
	
	public String checksCSSpropertiesInCardsAnother()
	{
		return loginToYourBeazleyDigitalAccountCards.getCssValue("color");
	}
	
	public WebElement getLoginToYourBeazleyDigitalAccountCards()
	{
		return loginToYourBeazleyDigitalAccountCards;
	}
	
	public int checkTheLengthOfTextInFooter()
	{
		return careersFooter.getText().length();
	}
	
	public boolean checkTheDisplayOfIconInFooter()
	{
		return beazleyFooter.isDisplayed();
	}
	
	public String checksCSSPropertiesInFooter()
	{
		return careersFooter.getCssValue("font-size");
	}
	
	public String checksCSSPropertiesInFooterOthers()
	{
		return careersFooter.getCssValue("font-family");
	}
	
	public String checksCSSpropertiesInFooterAnother()
	{
		return careersFooter.getCssValue("color");
	}
	
	public WebElement getCareersFooter()
	{
		return careersFooter;
	}
	
}
