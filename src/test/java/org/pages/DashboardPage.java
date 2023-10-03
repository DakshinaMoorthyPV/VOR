package org.pages;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage {

	@FindBy(xpath="(//img[@src='/globalassets/logo.svg'])[2]")
	private WebElement beazleyHeader;
	
	@FindBy(xpath="//h4[text()='Critical Weaknesses']")
	private WebElement criticalWeaknessCards;
	
	@FindBy(xpath="//div[text()='Widespread Ransomware']")
	private WebElement wideSpreadRansomwareCards;
	
	@FindBy(xpath="//label[text()='Endpoint']")
	private WebElement endpointCards;
	
	@FindBy(xpath="//div[@class='relative']")
	private WebElement completeBandCards;
	
	@FindBy(xpath="//p[@class='font-headline text-primary leading-5 text-[24px] leading-8']")
	private WebElement riskFactorSummaryCards;
	
	@FindBy(xpath="//h1[text()='You are currently at risk of 7 common types of cyber attack']")
	private WebElement cyberAttackSummaryCards;
	
	@FindBy(xpath="//p[text()='Your cyber security score by category']")
	private WebElement riskScoreByCategoryCards;
	
	@FindBy(xpath="//div[@class='relative']//*[name()='svg'][1]/*[name()='text'][1]")
	private WebElement statusCards;
	
	@FindBy(xpath="//div[@class='relative']//*[name()='svg']//*[name()='path'][2]")
	private WebElement band1Cards;
	
	@FindBy(xpath="//div[@class='relative']//*[name()='svg']//*[name()='path'][4]")
	private WebElement band2Cards;
	
	@FindBy(xpath="//div[@class='relative']//*[name()='svg']//*[name()='path'][6]")
	private WebElement band3Cards;
	
	@FindBy(xpath="//div[@class='relative']//*[name()='svg']//*[name()='path'][7]")
	private WebElement band4Cards;
	
	@FindBy(xpath="//div[@class='relative']//*[name()='svg']//*[name()='path'][9]")
	private WebElement band5Cards;
	
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
	
	public void clickOnBeazleyLogo()
	{
		beazleyHeader.click();
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
	
	public boolean checkPresenceOfBands()
	{
		return completeBandCards.isDisplayed();
	}
	
	public boolean checkPresenceOfRiskFactorSummary()
	{
		return riskFactorSummaryCards.isDisplayed();
	}
	
	public boolean checkPresenceOfCyberAttackSummary()
	{
		return cyberAttackSummaryCards.isDisplayed();
	}
	
	public boolean checkPresenceOfRiskScoreByCategory()
	{
		return riskScoreByCategoryCards.isDisplayed();
	}
	
	public boolean checkPresenceOfBandsOnly()
	{
		return band3Cards.isDisplayed();
	}
	
	public boolean checkPresenceOfStatus()
	{
		return statusCards.isDisplayed();
	}
	
	public int checkTheCountOfBands()
	{
		ArrayList<WebElement> a = new ArrayList<>();
		a.add(band1Cards);
		a.add(band2Cards);
		a.add(band3Cards);
		a.add(band4Cards);
		a.add(band5Cards);
		return a.size();
	}
	
	public void clickBand()
	{
		band3Cards.click();
	}
	
	public WebElement getRiskScoreByCategory()
	{
		return riskScoreByCategoryCards;
	}
	
	public WebElement getCriticalWeaknessCards()
	{
		return criticalWeaknessCards;
	}
	
	public WebElement getcyberAttackSummaryCards()
	{
		return cyberAttackSummaryCards;
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
