package org.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	@FindBy(xpath="//h1[contains(text(),'Login')]")
	private WebElement loginHeader;
	
	@FindBy(xpath="(//img[@src='/globalassets/logo.svg'])[2]")
	private WebElement beazleyHeader;
	
	@FindBy(xpath="//h2[contains(text(),'Login to your Beazley digital account')]")
	private WebElement loginToYourBeazleyDigitalAccountCards;
	
	@FindBy(xpath="(//img)[3]")
	private WebElement descriptionCards;
	
	@FindBy(xpath="//span[text()='Back to top']")
	private WebElement backToTopFooter;
	
	@FindBy(xpath="//a[text()='Privacy and cookies']")
	private WebElement privacyAndCookiesFooter;
	
	public LoginPage(WebDriver driver)
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
	
	public boolean checkTheDisplayOfImageInCards()
	{
		return descriptionCards.isDisplayed();
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
	
	public WebElement getloginToYourBeazleyDigitalAccountCards()
	{
		return loginToYourBeazleyDigitalAccountCards;
	}
	
	public int checkTheLengthOfTextInFooter()
	{
		return backToTopFooter.getText().length();
	}
	
	public boolean checkTheDisplayOfTextInFooter()
	{
		return privacyAndCookiesFooter.isDisplayed();
	}
	
	public String checksCSSPropertiesInFooter()
	{
		return backToTopFooter.getCssValue("font-size");
	}
	
	public String checksCSSPropertiesInFooterOthers()
	{
		return backToTopFooter.getCssValue("font-family");
	}
	
	public String checksCSSpropertiesInFooterAnother()
	{
		return backToTopFooter.getCssValue("color");
	}
	
	public WebElement getBackToTopFooter()
	{
		return backToTopFooter;
	}
	
}
