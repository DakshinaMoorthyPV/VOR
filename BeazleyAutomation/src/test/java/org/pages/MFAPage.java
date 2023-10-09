package org.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MFAPage {

	@FindBy(xpath="//h1[contains(text(),'Complete account setup')]")
	private WebElement mfaHeader;
	
	@FindBy(xpath="(//img[@src='/globalassets/logo.svg'])[2]")
	private WebElement beazleyHeader;
	
	@FindBy(xpath="//h2[contains(text(),'Complete set up of your online Beazley account')]")
	private WebElement completeSetUpOfYourOnlineBeazleyAccountCards;
	
	@FindBy(xpath="(//img)[3]")
	private WebElement descriptionCards;
	
	@FindBy(xpath="//span[text()='Back to top']")
	private WebElement backToTopFooter;
	
	@FindBy(xpath="//a[text()='Privacy and cookies']")
	private WebElement privacyAndCookiesFooter;
	
	public MFAPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public int checkTheLengthOfTextInHeader()
	{
		return mfaHeader.getText().length();
	}
	
	public boolean checkTheDisplayOfIconInHeader()
	{
		return beazleyHeader.isDisplayed();
	}
	
	public String checksCSSPropertiesInHeader()
	{
		return mfaHeader.getCssValue("font-size");
	}
	
	public String checksCSSPropertiesInHeaderOthers()
	{
		return mfaHeader.getCssValue("font-family");
	}
	
	public String checksCSSpropertiesInHeaderAnother()
	{
		return mfaHeader.getCssValue("color");
	}
	
	public int checkTheLengthOfTextInCards()
	{
		return completeSetUpOfYourOnlineBeazleyAccountCards.getText().length();
	}
	
	public boolean checkTheDisplayOfImageInCards()
	{
		return descriptionCards.isDisplayed();
	}
	
	public String checksCSSPropertiesInCards()
	{
		return completeSetUpOfYourOnlineBeazleyAccountCards.getCssValue("font-size");
	}
	
	public String checksCSSPropertiesInCardsOthers()
	{
		return completeSetUpOfYourOnlineBeazleyAccountCards.getCssValue("font-family");
	}
	
	public String checksCSSpropertiesInCardsAnother()
	{
		return completeSetUpOfYourOnlineBeazleyAccountCards.getCssValue("color");
	}
	
	public WebElement getCompleteSetUpOfYourOnlineBeazleyAccountCards()
	{
		return completeSetUpOfYourOnlineBeazleyAccountCards;
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
