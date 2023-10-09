package org.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreatePasswordPage {
	
	@FindBy(xpath="//h1[contains(text(),'Create Password')]")
	private WebElement createPasswordHeader;
	
	@FindBy(xpath="(//img[@src='/globalassets/logo.svg'])[2]")
	private WebElement beazleyHeader;
	
	@FindBy(xpath="//h3[contains(text(),'CURRENT CUSTOMERS & BROKERS')]")
	private WebElement currentCustomersAndBrokersCards;
	
	@FindBy(xpath="//span[text()='Broker Contact']")
	private WebElement brokerContactCards;
	
	@FindBy(xpath="//span[text()='Back to top']")
	private WebElement backToTopFooter;
	
	@FindBy(xpath="//a[text()='Privacy and cookies']")
	private WebElement privacyAndCookiesFooter;
	
	public CreatePasswordPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public int checkTheLengthOfTextInHeader()
	{
		return createPasswordHeader.getText().length();
	}
	
	public boolean checkTheDisplayOfIconInHeader()
	{
		return beazleyHeader.isDisplayed();
	}
	
	public String checksCSSPropertiesInHeader()
	{
		return createPasswordHeader.getCssValue("font-size");
	}
	
	public String checksCSSPropertiesInHeaderOthers()
	{
		return createPasswordHeader.getCssValue("font-family");
	}
	
	public String checksCSSpropertiesInHeaderAnother()
	{
		return createPasswordHeader.getCssValue("color");
	}
	
	public int checkTheLengthOfTextInCards()
	{
		return currentCustomersAndBrokersCards.getText().length();
	}
	
	public boolean checkTheDisplayOfTextInCards()
	{
		return brokerContactCards.isDisplayed();
	}
	
	public String checksCSSPropertiesInCards()
	{
		return currentCustomersAndBrokersCards.getCssValue("font-size");
	}
	
	public String checksCSSPropertiesInCardsOthers()
	{
		return currentCustomersAndBrokersCards.getCssValue("font-family");
	}
	
	public String checksCSSpropertiesInCardsAnother()
	{
		return currentCustomersAndBrokersCards.getCssValue("color");
	}
	
	public WebElement getCurrentCustomersAndBrokersCards()
	{
		return currentCustomersAndBrokersCards;
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
