package org.stepDefinitions;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.generics.Base;
import org.generics.FWUtils;
import org.pages.ResetPasswordPage;
import org.testng.Assert;

import com.relevantcodes.extentreports.LogStatus;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

public class Testing_the_feature_for_reset_password_page extends Base{

	private static Logger logger = LogManager.getLogger(Testing_the_feature_for_reset_password_page.class);
	ResetPasswordPage resetPasswordPage = new ResetPasswordPage(driver);
	
	@When("User checks the texts of the resetPasswordPage header {string}")
	public void user_checks_the_texts_of_the_header(String text)
	{
		logger.info("User checks the texts of the resetPasswordPage header properties");
		Assert.assertEquals(resetPasswordPage.checkTheLengthOfTextInHeader(),14);
		Assert.assertEquals(resetPasswordPage.checkTheDisplayOfIconInHeader(),true);
		Assert.assertEquals(resetPasswordPage.checkTheDisplayOfLinkInHeader(),true);
		FWUtils.checksTheCountOfCapitalOrSmallLetters(text);
		Assert.assertEquals(resetPasswordPage.checksCSSPropertiesInHeader(),"62.9152px");
		Assert.assertEquals(resetPasswordPage.checksCSSPropertiesInHeaderOthers(),"\"Tiempos Fine\", serif");
		Assert.assertEquals(resetPasswordPage.checksCSSpropertiesInHeaderAnother(),"rgba(255, 255, 255, 1)");
		extentTest.log(LogStatus.INFO,"User checks the texts of the resetPasswordPage header properties");
	}
	
	@When("User checks the texts of the resetPasswordPage cards {string}")
	public void user_checks_the_texts_of_the_cards(String text) throws InterruptedException
	{
		logger.info("User checks the texts of the resetPasswordPage cards properties");
		FWUtils.scrollUptoParticularElement(driver,resetPasswordPage.getChangeYourPasswordForYourOnlineBeazleyAccountCards());
		Assert.assertEquals(resetPasswordPage.checkTheLengthOfTextInCards(),52);
		Assert.assertEquals(resetPasswordPage.checkTheDisplayOfImageInCards(),true);
		FWUtils.checksTheCountOfCapitalOrSmallLetters(text);
		Assert.assertEquals(resetPasswordPage.checksCSSPropertiesInCards(),"43.9006px");
		Assert.assertEquals(resetPasswordPage.checksCSSPropertiesInCardsOthers(),"\"Tiempos Fine\", serif");
		Assert.assertEquals(resetPasswordPage.checksCSSpropertiesInCardsAnother(),"rgba(242, 242, 242, 1)");
		extentTest.log(LogStatus.INFO,"User checks the texts of the resetPasswordPage cards properties");
	}
	
	@And("User checks the texts of the resetPasswordPage footer {string}")
	public void user_checks_the_texts_of_the_footer(String text) throws InterruptedException
	{
		logger.info("User checks the texts of the resetPasswordPage footer properties");
		FWUtils.scrollUptoParticularElement(driver,resetPasswordPage.getBackToTopFooter());
		Assert.assertEquals(resetPasswordPage.checkTheLengthOfTextInFooter(),11);
		Assert.assertEquals(resetPasswordPage.checkTheDisplayOfTextInFooter(),true);
		FWUtils.checksTheCountOfCapitalOrSmallLetters(text);
		Assert.assertEquals(resetPasswordPage.checksCSSPropertiesInFooter(),"15.8754px");
		Assert.assertEquals(resetPasswordPage.checksCSSPropertiesInFooterOthers(),"Diatype, sans-serif");
		Assert.assertEquals(resetPasswordPage.checksCSSpropertiesInFooterAnother(),"rgba(255, 255, 255, 1)");
		extentTest.log(LogStatus.INFO,"User checks the texts of the resetPasswordPage footer properties");
	}
	
}
