package org.stepDefinitions;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.generics.Base;
import org.generics.FWUtils;
import org.pages.LoginMFAPage;
import org.testng.Assert;

import com.relevantcodes.extentreports.LogStatus;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

public class Testing_the_feature_for_login_mfa_page extends Base{

	private static Logger logger = LogManager.getLogger(Testing_the_feature_for_login_mfa_page.class);
	LoginMFAPage loginMFAPage = new LoginMFAPage(driver);
	
	@When("User checks the texts of the loginMFA header {string}")
	public void user_checks_the_texts_of_the_header(String text)
	{
		logger.info("User checks the texts of the loginMFA header properties");
		loginMFAPage.checkTheLengthOfTextInHeader();
		Assert.assertEquals(loginMFAPage.checkTheLengthOfTextInHeader(),5);
		loginMFAPage.checkTheDisplayOfIconInHeader();
		Assert.assertEquals(loginMFAPage.checkTheDisplayOfIconInHeader(),true);
		FWUtils.checksTheCountOfCapitalOrSmallLetters(text);
		loginMFAPage.checksCSSPropertiesInHeader();
		Assert.assertEquals(loginMFAPage.checksCSSPropertiesInHeader(),"62.9152px");
		Assert.assertEquals(loginMFAPage.checksCSSPropertiesInHeaderOthers(),"\"Tiempos Fine\", serif");
		Assert.assertEquals(loginMFAPage.checksCSSpropertiesInHeaderAnother(),"rgba(255, 255, 255, 1)");
		extentTest.log(LogStatus.INFO,"User checks the texts of the loginMFA header properties");
	}
	
	@When("User checks the texts of the loginMFA cards {string}")
	public void user_checks_the_texts_of_the_cards(String text) throws InterruptedException
	{
		logger.info("User checks the texts of the loginMFA cards properties");
		FWUtils.scrollUptoParticularElement(driver,loginMFAPage.getLoginToYourBeazleyDigitalAccountCards());
		Assert.assertEquals(loginMFAPage.checkTheLengthOfTextInCards(),37);
		loginMFAPage.checkTheDisplayOfTextInCards();
		Assert.assertEquals(loginMFAPage.checkTheDisplayOfTextInCards(),true);
		FWUtils.checksTheCountOfCapitalOrSmallLetters(text);
		Assert.assertEquals(loginMFAPage.checksCSSPropertiesInCards(),"43.9006px");
		Assert.assertEquals(loginMFAPage.checksCSSPropertiesInCardsOthers(),"\"Tiempos Fine\", serif");
		Assert.assertEquals(loginMFAPage.checksCSSpropertiesInCardsAnother(),"rgba(242, 242, 242, 1)");
		extentTest.log(LogStatus.INFO,"User checks the texts of the loginMFA cards properties");
	}
	
	@And("User checks the texts of the loginMFA footer {string}")
	public void user_checks_the_texts_of_the_footer(String text) throws InterruptedException
	{
		logger.info("User checks the texts of the loginMFA footer properties");
		FWUtils.scrollUptoParticularElement(driver,loginMFAPage.getCareersFooter());
		Assert.assertEquals(loginMFAPage.checkTheLengthOfTextInFooter(),7);
		loginMFAPage.checkTheDisplayOfIconInFooter();
		Assert.assertEquals(loginMFAPage.checkTheDisplayOfIconInFooter(),true);
		FWUtils.checksTheCountOfCapitalOrSmallLetters(text);
		Assert.assertEquals(loginMFAPage.checksCSSPropertiesInFooter(),"15.8754px");
		Assert.assertEquals(loginMFAPage.checksCSSPropertiesInFooterOthers(),"Diatype, sans-serif");
		Assert.assertEquals(loginMFAPage.checksCSSpropertiesInFooterAnother(),"rgba(255, 255, 255, 1)");
		extentTest.log(LogStatus.INFO,"User checks the texts of the loginMFA footer properties");
	}
	
}
