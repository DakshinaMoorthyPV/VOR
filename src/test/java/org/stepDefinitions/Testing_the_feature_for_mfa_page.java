package org.stepDefinitions;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.generics.Base;
import org.generics.FWUtils;
import org.pages.MFAPage;
import org.testng.Assert;

import com.relevantcodes.extentreports.LogStatus;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

public class Testing_the_feature_for_mfa_page extends Base{

	private static Logger logger = LogManager.getLogger(Testing_the_feature_for_mfa_page.class);
	MFAPage mfaPage = new MFAPage(driver);
	
	@When("User checks the texts of the mfaPage header {string}")
	public void user_checks_the_texts_of_the_header(String text)
	{
		logger.info("User checks the texts of the mfaPage header properties");
		mfaPage.checkTheLengthOfTextInHeader();
		Assert.assertEquals(mfaPage.checkTheLengthOfTextInHeader(),22);
		mfaPage.checkTheDisplayOfIconInHeader();
		Assert.assertEquals(mfaPage.checkTheDisplayOfIconInHeader(),true);
		FWUtils.checksTheCountOfCapitalOrSmallLetters(text);
		mfaPage.checksCSSPropertiesInHeader();
		Assert.assertEquals(mfaPage.checksCSSPropertiesInHeader(),"62.9152px");
		Assert.assertEquals(mfaPage.checksCSSPropertiesInHeaderOthers(),"\"Tiempos Fine\", serif");
		Assert.assertEquals(mfaPage.checksCSSpropertiesInHeaderAnother(),"rgba(255, 255, 255, 1)");
		extentTest.log(LogStatus.INFO,"User checks the texts of the mfaPage header properties");
	}
	
	@When("User checks the texts of the mfaPage cards {string}")
	public void user_checks_the_texts_of_the_cards(String text) throws InterruptedException
	{
		logger.info("User checks the texts of the mfaPage cards properties");
		FWUtils.scrollUptoParticularElement(driver,mfaPage.getCompleteSetUpOfYourOnlineBeazleyAccountCards());
		Assert.assertEquals(mfaPage.checkTheLengthOfTextInCards(),46);
		mfaPage.checkTheDisplayOfImageInCards();
		Assert.assertEquals(mfaPage.checkTheDisplayOfImageInCards(),true);
		FWUtils.checksTheCountOfCapitalOrSmallLetters(text);
		Assert.assertEquals(mfaPage.checksCSSPropertiesInCards(),"43.9006px");
		Assert.assertEquals(mfaPage.checksCSSPropertiesInCardsOthers(),"\"Tiempos Fine\", serif");
		Assert.assertEquals(mfaPage.checksCSSpropertiesInCardsAnother(),"rgba(242, 242, 242, 1)");
		extentTest.log(LogStatus.INFO,"User checks the texts of the mfaPage cards properties");
	}
	
	@And("User checks the texts of the mfaPage footer {string}")
	public void user_checks_the_texts_of_the_footer(String text) throws InterruptedException
	{
		logger.info("User checks the texts of the mfaPage footer properties");
		FWUtils.scrollUptoParticularElement(driver,mfaPage.getBackToTopFooter());
		Assert.assertEquals(mfaPage.checkTheLengthOfTextInFooter(),11);
		mfaPage.checkTheDisplayOfTextInFooter();
		Assert.assertEquals(mfaPage.checkTheDisplayOfTextInFooter(),true);
		FWUtils.checksTheCountOfCapitalOrSmallLetters(text);
		Assert.assertEquals(mfaPage.checksCSSPropertiesInFooter(),"15.8754px");
		Assert.assertEquals(mfaPage.checksCSSPropertiesInFooterOthers(),"Diatype, sans-serif");
		Assert.assertEquals(mfaPage.checksCSSpropertiesInFooterAnother(),"rgba(255, 255, 255, 1)");
		extentTest.log(LogStatus.INFO,"User checks the texts of the mfaPage footer properties");
	}
	
}
