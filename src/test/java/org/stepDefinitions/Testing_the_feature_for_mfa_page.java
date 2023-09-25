package org.stepDefinitions;

import java.io.IOException;

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
	public void user_checks_the_texts_of_the_header(String text) throws InterruptedException, IOException
	{
		Assert.assertEquals(mfaPage.checkTheLengthOfTextInHeader(),22);
		logger.info("Validated the length of text in header");
		extentTest.log(LogStatus.INFO,"Validated the length of text in header",extentTest.addScreenCapture(FWUtils.takesScreenShot(driver,photoPath)));
		Assert.assertEquals(mfaPage.checkTheDisplayOfIconInHeader(),true);
		logger.info("Validated the presence of icon in header");
		extentTest.log(LogStatus.INFO,"Validated the presence of icon in header",extentTest.addScreenCapture(FWUtils.takesScreenShot(driver,photoPath)));
		FWUtils.checksTheCountOfCapitalOrSmallLetters(text);
		logger.info("Checked the count of letters");
		extentTest.log(LogStatus.INFO,"Checked the count of letters",extentTest.addScreenCapture(FWUtils.takesScreenShot(driver,photoPath)));
		Assert.assertEquals(mfaPage.checksCSSPropertiesInHeader(),"62.9152px");
		Assert.assertEquals(mfaPage.checksCSSPropertiesInHeaderOthers(),"\"Tiempos Fine\", serif");
		Assert.assertEquals(mfaPage.checksCSSpropertiesInHeaderAnother(),"rgba(255, 255, 255, 1)");
		logger.info("Validated the CSS properties of header");
		extentTest.log(LogStatus.INFO,"Validated the CSS properties of header",extentTest.addScreenCapture(FWUtils.takesScreenShot(driver,photoPath)));
		logger.info("Validated the mfaPage header properties");
		extentTest.log(LogStatus.INFO,"Validated the mfaPage header properties",extentTest.addScreenCapture(FWUtils.takesScreenShot(driver,photoPath)));
	}
	
	@When("User checks the texts of the mfaPage cards {string}")
	public void user_checks_the_texts_of_the_cards(String text) throws InterruptedException, IOException
	{
		FWUtils.scrollUptoParticularElement(driver,mfaPage.getCompleteSetUpOfYourOnlineBeazleyAccountCards());
		Assert.assertEquals(mfaPage.checkTheLengthOfTextInCards(),46);
		logger.info("Validated the length of text in cards");
		extentTest.log(LogStatus.INFO,"Validated the length of text in cards",extentTest.addScreenCapture(FWUtils.takesScreenShot(driver,photoPath)));
		Assert.assertEquals(mfaPage.checkTheDisplayOfImageInCards(),true);
		logger.info("Validated the presence of image in cards");
		extentTest.log(LogStatus.INFO,"Validated the presence of image in cards",extentTest.addScreenCapture(FWUtils.takesScreenShot(driver,photoPath)));
		FWUtils.checksTheCountOfCapitalOrSmallLetters(text);
		logger.info("Checked the count of letters");
		extentTest.log(LogStatus.INFO,"Checked the count of letters",extentTest.addScreenCapture(FWUtils.takesScreenShot(driver,photoPath)));
		Assert.assertEquals(mfaPage.checksCSSPropertiesInCards(),"43.9006px");
		Assert.assertEquals(mfaPage.checksCSSPropertiesInCardsOthers(),"\"Tiempos Fine\", serif");
		Assert.assertEquals(mfaPage.checksCSSpropertiesInCardsAnother(),"rgba(242, 242, 242, 1)");
		logger.info("Validated the CSS properties of cards");
		extentTest.log(LogStatus.INFO,"Validated the CSS properties of cards",extentTest.addScreenCapture(FWUtils.takesScreenShot(driver,photoPath)));
		logger.info("Validated the mfaPage cards properties");
		extentTest.log(LogStatus.INFO,"Validated the mfaPage cards properties",extentTest.addScreenCapture(FWUtils.takesScreenShot(driver,photoPath)));
	}
	
	@And("User checks the texts of the mfaPage footer {string}")
	public void user_checks_the_texts_of_the_footer(String text) throws InterruptedException, IOException
	{
		FWUtils.scrollUptoParticularElement(driver,mfaPage.getBackToTopFooter());
		Assert.assertEquals(mfaPage.checkTheLengthOfTextInFooter(),11);
		logger.info("Validated the length of text in footer");
		extentTest.log(LogStatus.INFO,"Validated the length of text in footer",extentTest.addScreenCapture(FWUtils.takesScreenShot(driver,photoPath)));
		Assert.assertEquals(mfaPage.checkTheDisplayOfTextInFooter(),true);
		logger.info("Validated the presence of text in footer");
		extentTest.log(LogStatus.INFO,"Validated the presence of text in footer",extentTest.addScreenCapture(FWUtils.takesScreenShot(driver,photoPath)));
		FWUtils.checksTheCountOfCapitalOrSmallLetters(text);
		logger.info("Checked the count of letters");
		extentTest.log(LogStatus.INFO,"Checked the count of letters",extentTest.addScreenCapture(FWUtils.takesScreenShot(driver,photoPath)));
		Assert.assertEquals(mfaPage.checksCSSPropertiesInFooter(),"15.8754px");
		Assert.assertEquals(mfaPage.checksCSSPropertiesInFooterOthers(),"Diatype, sans-serif");
		Assert.assertEquals(mfaPage.checksCSSpropertiesInFooterAnother(),"rgba(255, 255, 255, 1)");
		logger.info("Validated the CSS properties of footer");
		extentTest.log(LogStatus.INFO,"Validated the CSS properties of footer",extentTest.addScreenCapture(FWUtils.takesScreenShot(driver,photoPath)));
		logger.info("Validated the mfaPage footer properties");
		extentTest.log(LogStatus.INFO,"Validated the mfaPage footer properties",extentTest.addScreenCapture(FWUtils.takesScreenShot(driver,photoPath)));
	}
	
}
