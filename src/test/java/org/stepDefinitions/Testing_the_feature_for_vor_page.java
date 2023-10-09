package org.stepDefinitions;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.generics.Base;
import org.generics.FWUtils;
import org.pages.VORPage;
import org.testng.Assert;

import com.relevantcodes.extentreports.LogStatus;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

public class Testing_the_feature_for_vor_page extends Base{

	private static Logger logger = LogManager.getLogger(Testing_the_feature_for_vor_page.class);
	VORPage vorPage = new VORPage(driver);
	
	@When("User checks the texts of the vorPage header")
	public void user_checks_the_texts_of_the_vor_page_header() throws InterruptedException, IOException 
	{
		Assert.assertEquals(vorPage.checkTheDisplayOfIconInHeader(),true);
		logger.info("Validated the presence of icon in header");
		extentTest.log(LogStatus.INFO,"Validated the presence of icon in header",extentTest.addScreenCapture(FWUtils.takesScreenShot(driver,photoPath)));
		logger.info("Validated the vorPage header properties");
		extentTest.log(LogStatus.INFO,"Validated the vorPage header properties",extentTest.addScreenCapture(FWUtils.takesScreenShot(driver,photoPath)));
	}

	@When("User checks the texts of the vorPage cards {string}")
	public void user_checks_the_texts_of_the_vor_page_cards(String text) throws InterruptedException, IOException
	{
		FWUtils.scrollUptoParticularElement(driver,vorPage.getSubstantialWeaknessCards());
		Assert.assertEquals(vorPage.checkTheLengthOfTextInCards(),20);
		logger.info("Validated the length of text in cards");
		extentTest.log(LogStatus.INFO,"Validated the length of text in cards",extentTest.addScreenCapture(FWUtils.takesScreenShot(driver,photoPath)));
		Assert.assertEquals(vorPage.checkTheDisplayOfTextInCards(),true);
		logger.info("Validated the presence of text in cards");
		extentTest.log(LogStatus.INFO,"Validated the presence of text in cards",extentTest.addScreenCapture(FWUtils.takesScreenShot(driver,photoPath)));
		FWUtils.checksTheCountOfCapitalOrSmallLetters(text);
		logger.info("Checked the count of letters");
		extentTest.log(LogStatus.INFO,"Checked the count of letters",extentTest.addScreenCapture(FWUtils.takesScreenShot(driver,photoPath)));
		Assert.assertEquals(vorPage.checksCSSPropertiesInCards(),"17.9433px");
		Assert.assertEquals(vorPage.checksCSSPropertiesInCardsOthers(),"Diatype, sans-serif");
		Assert.assertEquals(vorPage.checksCSSpropertiesInCardsAnother(),"rgb(49, 49, 49)");
		logger.info("Validated the CSS properties of cards");
		extentTest.log(LogStatus.INFO,"Validated the CSS properties of cards",extentTest.addScreenCapture(FWUtils.takesScreenShot(driver,photoPath)));
		logger.info("Validated the vorPage cards properties");
		extentTest.log(LogStatus.INFO,"Validated the vorPage cards properties",extentTest.addScreenCapture(FWUtils.takesScreenShot(driver,photoPath)));
	}

	@And("User checks the texts of the vorPage footer {string}")
	public void user_checks_the_texts_of_the_vor_page_footer(String text) throws InterruptedException, IOException
	{
		FWUtils.scrollUptoParticularElement(driver,vorPage.getEventsFooter());
		Assert.assertEquals(vorPage.checkTheLengthOfTextInFooter(),6);
		logger.info("Validated the length of text in footer");
		extentTest.log(LogStatus.INFO,"Validated the length of text in footer",extentTest.addScreenCapture(FWUtils.takesScreenShot(driver,photoPath)));
		Assert.assertEquals(vorPage.checkTheDisplayOfIconInFooter(),true);
		logger.info("Validated the presence of icon in footer");
		extentTest.log(LogStatus.INFO,"Validated the presence of icon in footer",extentTest.addScreenCapture(FWUtils.takesScreenShot(driver,photoPath)));
		FWUtils.checksTheCountOfCapitalOrSmallLetters(text);
		logger.info("Checked the count of letters");
		extentTest.log(LogStatus.INFO,"Checked the count of letters",extentTest.addScreenCapture(FWUtils.takesScreenShot(driver,photoPath)));
		Assert.assertEquals(vorPage.checksCSSPropertiesInFooter(),"15.8633px");
		Assert.assertEquals(vorPage.checksCSSPropertiesInFooterOthers(),"Diatype, sans-serif");
		Assert.assertEquals(vorPage.checksCSSpropertiesInFooterAnother(),"rgb(255, 255, 255)");
		logger.info("Validated the CSS properties of footer");
		extentTest.log(LogStatus.INFO,"Validated the CSS properties of footer",extentTest.addScreenCapture(FWUtils.takesScreenShot(driver,photoPath)));
		logger.info("Validated the vorPage footer properties");
		extentTest.log(LogStatus.INFO,"Validated the vorPage footer properties",extentTest.addScreenCapture(FWUtils.takesScreenShot(driver,photoPath)));
	}
	
}
