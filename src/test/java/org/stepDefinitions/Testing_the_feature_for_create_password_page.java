package org.stepDefinitions;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.generics.Base;
import org.generics.FWUtils;
import org.pages.CreatePasswordPage;
import org.testng.Assert;

import com.relevantcodes.extentreports.LogStatus;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

public class Testing_the_feature_for_create_password_page extends Base{

	private static Logger logger = LogManager.getLogger(Testing_the_feature_for_create_password_page.class);
	CreatePasswordPage createPasswordPage = new CreatePasswordPage(driver);
	
	@When("User checks the texts of the createPasswordPage header {string}")
	public void user_checks_the_texts_of_the_header(String text)
	{
		logger.info("User checks the texts of the createPasswordPage header properties");
		Assert.assertEquals(createPasswordPage.checkTheLengthOfTextInHeader(),15);
		Assert.assertEquals(createPasswordPage.checkTheDisplayOfIconInHeader(),true);
		FWUtils.checksTheCountOfCapitalOrSmallLetters(text);
		Assert.assertEquals(createPasswordPage.checksCSSPropertiesInHeader(),"62.9152px");
		Assert.assertEquals(createPasswordPage.checksCSSPropertiesInHeaderOthers(),"\"Tiempos Fine\", serif");
		Assert.assertEquals(createPasswordPage.checksCSSpropertiesInHeaderAnother(),"rgba(255, 255, 255, 1)");
		extentTest.log(LogStatus.INFO,"User checks the texts of the createPasswordPage header properties");
	}
	
	@When("User checks the texts of the createPasswordPage cards {string}")
	public void user_checks_the_texts_of_the_cards(String text) throws InterruptedException
	{
		logger.info("User checks the texts of the createPasswordPage cards properties");
		FWUtils.scrollUptoParticularElement(driver,createPasswordPage.getCurrentCustomersAndBrokersCards());
		Assert.assertEquals(createPasswordPage.checkTheLengthOfTextInCards(),27);
		Assert.assertEquals(createPasswordPage.checkTheDisplayOfTextInCards(),true);
		FWUtils.checksTheCountOfCapitalOrSmallLetters(text);
		Assert.assertEquals(createPasswordPage.checksCSSPropertiesInCards(),"15.7508px");
		Assert.assertEquals(createPasswordPage.checksCSSPropertiesInCardsOthers(),"Diatype, sans-serif");
		Assert.assertEquals(createPasswordPage.checksCSSpropertiesInCardsAnother(),"rgba(220, 25, 155, 1)");
		extentTest.log(LogStatus.INFO,"User checks the texts of the createPasswordPage cards properties");
	}
	
	@And("User checks the texts of the createPasswordPage footer {string}")
	public void user_checks_the_texts_of_the_footer(String text) throws InterruptedException
	{
		logger.info("User checks the texts of the createPasswordPage footer properties");
		FWUtils.scrollUptoParticularElement(driver,createPasswordPage.getBackToTopFooter());
		Assert.assertEquals(createPasswordPage.checkTheLengthOfTextInFooter(),11);
		Assert.assertEquals(createPasswordPage.checkTheDisplayOfTextInFooter(),true);
		FWUtils.checksTheCountOfCapitalOrSmallLetters(text);
		Assert.assertEquals(createPasswordPage.checksCSSPropertiesInFooter(),"15.8754px");
		Assert.assertEquals(createPasswordPage.checksCSSPropertiesInFooterOthers(),"Diatype, sans-serif");
		Assert.assertEquals(createPasswordPage.checksCSSpropertiesInFooterAnother(),"rgba(255, 255, 255, 1)");
		extentTest.log(LogStatus.INFO,"User checks the texts of the createPasswordPage footer properties");
	}
	
}
