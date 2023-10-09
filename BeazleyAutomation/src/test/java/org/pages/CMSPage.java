package org.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CMSPage {

	@FindBy(xpath="//h1[text()='Your Applications']")
	private WebElement yourApplicationsHeaderCMS;
	
	@FindBy(xpath="//input[@name='loginfmt']")
	private WebElement beazleyLogin;
	
	@FindBy(xpath="//input[@id='passwordInput']")
	private WebElement beazleyPassword;
	
	@FindBy(xpath="//input[@id='idSIButton9']")
	private WebElement nextButton;
	
	@FindBy(xpath="//span[text()='Sign in']")
	private WebElement signInButton;
	
	public CMSPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public int getText()
	{
		return yourApplicationsHeaderCMS.getText().length();
	}
	
	public boolean isDisplayed()
	{
		return yourApplicationsHeaderCMS.isDisplayed();
	}
	
	public void enterTextInBeazleyLogin(String text)
	{
		beazleyLogin.sendKeys(text);
	}
	
	public void enterTextInBeazleyPassword(String text)
	{
		beazleyPassword.sendKeys(text);
	}
	
	public void clickOnNext()
	{
		nextButton.click();
	}
	
	public void signInButton()
	{
		signInButton.click();
	}
	
}
