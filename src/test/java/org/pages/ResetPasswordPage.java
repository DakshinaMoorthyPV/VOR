package org.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ResetPasswordPage {

	@FindBy(xpath="//h1[contains(text(),'Reset Password')]")
	private WebElement resetPasswordHeader;
	
	@FindBy(xpath="(//img[@src='/globalassets/logo.svg'])[2]")
	private WebElement beazleyHeader;
	
	@FindBy(xpath="//span[text()='Logout']")
	private WebElement logoutHeader;
	
	@FindBy(xpath="//h2[contains(text(),'Change your password for  your online Beazley account')]")
	private WebElement changeYourPasswordForYourOnlineBeazleyAccountCards;
	
	@FindBy(xpath="(//img)[3]")
	private WebElement descriptionCards;
	
	@FindBy(xpath="//span[text()='Back to top']")
	private WebElement backToTopFooter;
	
	@FindBy(xpath="//a[text()='Privacy and cookies']")
	private WebElement privacyAndCookiesFooter;
	
	public ResetPasswordPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public int checkTheLengthOfTextInHeader()
	{
		return resetPasswordHeader.getText().length();
	}
	
	public boolean checkTheDisplayOfIconInHeader()
	{
		return beazleyHeader.isDisplayed();
	}
	
	public boolean checkTheDisplayOfLinkInHeader()
	{
		return logoutHeader.isDisplayed();
	}
	
	public String checksCSSPropertiesInHeader()
	{
		return resetPasswordHeader.getCssValue("font-size");
	}
	
	public String checksCSSPropertiesInHeaderOthers()
	{
		return resetPasswordHeader.getCssValue("font-family");
	}
	
	public String checksCSSpropertiesInHeaderAnother()
	{
		return resetPasswordHeader.getCssValue("color");
	}
	
	public int checkTheLengthOfTextInCards()
	{
		return changeYourPasswordForYourOnlineBeazleyAccountCards.getText().length();
	}
	
	public boolean checkTheDisplayOfImageInCards()
	{
		return descriptionCards.isDisplayed();
	}
	
	public String checksCSSPropertiesInCards()
	{
		return changeYourPasswordForYourOnlineBeazleyAccountCards.getCssValue("font-size");
	}
	
	public String checksCSSPropertiesInCardsOthers()
	{
		return changeYourPasswordForYourOnlineBeazleyAccountCards.getCssValue("font-family");
	}
	
	public String checksCSSpropertiesInCardsAnother()
	{
		return changeYourPasswordForYourOnlineBeazleyAccountCards.getCssValue("color");
	}
	
	public WebElement getChangeYourPasswordForYourOnlineBeazleyAccountCards()
	{
		return changeYourPasswordForYourOnlineBeazleyAccountCards;
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
