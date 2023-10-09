package org.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ApplicationSelectionPage {

	@FindBy(xpath="(//img[@src='/globalassets/logo.svg'])[2]")
	private WebElement beazleyHeader;
	
	@FindBy(xpath="//h1[contains(text(),'Your Application')]")
	private WebElement yourApplicationsHeader;
	
	@FindBy(xpath="//h2[text()='Your Applications']")
	private WebElement yourApplicationsCards;
	
	@FindBy(xpath="//h2[contains(text(),'Contact us')]")
	private WebElement contactUsCards;
	
	@FindBy(xpath="//span[text()='Contact details for Underwriters']")
	private WebElement contactDetailsForUnderwritersCards;
	
	@FindBy(xpath="(//img[@src='/globalassets/logo.svg'])[3]")
	private WebElement beazleyFooter;
	
	@FindBy(xpath="//a[text()='Events']")
	private WebElement eventsFooter; 
	
	@FindBy(xpath="//h2[text()='Session due to expire']")
	private WebElement popupTimeOutSession;
	
	@FindBy(xpath="//button[contains(text(),'Extend Session')]")
	private WebElement extendSessionTimeOutSession;
	
	public ApplicationSelectionPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public int checkTheLengthOfTextInHeader()
	{
		return yourApplicationsHeader.getText().length();
	}
	
	public boolean checkTheDisplayOfIconInHeader()
	{
		return beazleyHeader.isDisplayed();
	}
	
	public String checksCSSPropertiesInHeader()
	{
		return yourApplicationsHeader.getCssValue("font-size");
	}
	
	public String checksCSSPropertiesInHeaderOthers()
	{
		return yourApplicationsHeader.getCssValue("font-family");
	}
	
	public String checksCSSpropertiesInHeaderAnother()
	{
		return yourApplicationsHeader.getCssValue("color");
	}
	
	public int checkTheLengthOfTextInCards()
	{
		return yourApplicationsCards.getText().length();
	}
	
	public boolean checkTheDisplayOfTextInCards()
	{
		return contactUsCards.isDisplayed();
	}
	
	public String checksCSSPropertiesInCards()
	{
		return yourApplicationsCards.getCssValue("font-size");
	}
	
	public String checksCSSPropertiesInCardsOthers()
	{
		return yourApplicationsCards.getCssValue("font-family");
	}
	
	public String checksCSSpropertiesInCardsAnother()
	{
		return yourApplicationsCards.getCssValue("color");
	}
	
	public WebElement getYourApplicationsCards()
	{
		return yourApplicationsCards;
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
	
	public int checkTheLengthOfTextInTimeOutSessionPopup()
	{
		return popupTimeOutSession.getText().length();
	}
	
	public boolean checkTheDisplayOfTextInTimeOutSessionPopup()
	{
		return extendSessionTimeOutSession.isDisplayed();
	}
	
	public String checkCSSPropertiesInTimeOutSessionPopup()
	{
		return popupTimeOutSession.getCssValue("font-size");
	}
	
	public String checkCSSPropertiesInTimeOutSessionPopupOthers()
	{
		return popupTimeOutSession.getCssValue("font-family");
	}
	
	public String checksCSSpropertiesInTimeOutSessionPopupAnother()
	{
		return popupTimeOutSession.getCssValue("color");
	}

}
