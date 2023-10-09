package org.stepDefinitions;

import java.io.IOException;

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
	public void user_checks_the_texts_of_the_header(String text) throws InterruptedException, IOException
	{
		Assert.assertEquals(resetPasswordPage.checkTheLengthOfTextInHeader(),14);
		logger.info("Validated the length of text in header");
		extentTest.log(LogStatus.INFO,"Validated the length of text in header",extentTest.addScreenCapture(FWUtils.takesScreenShot(driver,photoPath)));
		Assert.assertEquals(resetPasswordPage.checkTheDisplayOfIconInHeader(),true);
		logger.info("Validated the presence of icon in header");
		extentTest.log(LogStatus.INFO,"Validated the presence of icon in header",extentTest.addScreenCapture(FWUtils.takesScreenShot(driver,photoPath)));
		Assert.assertEquals(resetPasswordPage.checkTheDisplayOfLinkInHeader(),true);
		logger.info("Validated the presence of link in header");
		extentTest.log(LogStatus.INFO,"Validated the presence of link in header",extentTest.addScreenCapture(FWUtils.takesScreenShot(driver,photoPath)));
		FWUtils.checksTheCountOfCapitalOrSmallLetters(text);
		logger.info("Checked the count of letters");
		extentTest.log(LogStatus.INFO,"Checked the count of letters",extentTest.addScreenCapture(FWUtils.takesScreenShot(driver,photoPath)));
		Assert.assertEquals(resetPasswordPage.checksCSSPropertiesInHeader(),"62.9152px");
		Assert.assertEquals(resetPasswordPage.checksCSSPropertiesInHeaderOthers(),"\"Tiempos Fine\", serif");
		Assert.assertEquals(resetPasswordPage.checksCSSpropertiesInHeaderAnother(),"rgba(255, 255, 255, 1)");
		logger.info("Validated the CSS properties of header");
		extentTest.log(LogStatus.INFO,"Validated the CSS properties of header",extentTest.addScreenCapture(FWUtils.takesScreenShot(driver,photoPath)));
		logger.info("Validated the resetPasswordPage header properties");
		extentTest.log(LogStatus.INFO,"Validated the resetPasswordPage header properties",extentTest.addScreenCapture(FWUtils.takesScreenShot(driver,photoPath)));
	}
	
	@When("User checks the texts of the resetPasswordPage cards {string}")
	public void user_checks_the_texts_of_the_cards(String text) throws InterruptedException, IOException
	{
		FWUtils.scrollUptoParticularElement(driver,resetPasswordPage.getChangeYourPasswordForYourOnlineBeazleyAccountCards());
		Assert.assertEquals(resetPasswordPage.checkTheLengthOfTextInCards(),52);
		logger.info("Validated the length of text in cards");
		extentTest.log(LogStatus.INFO,"Validated the length of text in cards",extentTest.addScreenCapture(FWUtils.takesScreenShot(driver,photoPath)));
		Assert.assertEquals(resetPasswordPage.checkTheDisplayOfImageInCards(),true);
		logger.info("Validated the presence of image in cards");
		extentTest.log(LogStatus.INFO,"Validated the presence of image in cards",extentTest.addScreenCapture(FWUtils.takesScreenShot(driver,photoPath)));
		FWUtils.checksTheCountOfCapitalOrSmallLetters(text);
		logger.info("Checked the count of letters");
		extentTest.log(LogStatus.INFO,"Checked the count of letters",extentTest.addScreenCapture(FWUtils.takesScreenShot(driver,photoPath)));
		Assert.assertEquals(resetPasswordPage.checksCSSPropertiesInCards(),"43.9006px");
		Assert.assertEquals(resetPasswordPage.checksCSSPropertiesInCardsOthers(),"\"Tiempos Fine\", serif");
		Assert.assertEquals(resetPasswordPage.checksCSSpropertiesInCardsAnother(),"rgba(242, 242, 242, 1)");
		logger.info("Validated the CSS properties of cards");
		extentTest.log(LogStatus.INFO,"Validated the CSS properties of cards",extentTest.addScreenCapture(FWUtils.takesScreenShot(driver,photoPath)));
		logger.info("Validated the resetPasswordPage cards properties");
		extentTest.log(LogStatus.INFO,"Validated the resetPasswordPage cards properties",extentTest.addScreenCapture(FWUtils.takesScreenShot(driver,photoPath)));
	}
	
	@And("User checks the texts of the resetPasswordPage footer {string}")
	public void user_checks_the_texts_of_the_footer(String text) throws InterruptedException, IOException
	{
		FWUtils.scrollUptoParticularElement(driver,resetPasswordPage.getBackToTopFooter());
		Assert.assertEquals(resetPasswordPage.checkTheLengthOfTextInFooter(),11);
		logger.info("Validated the length of text in footer");
		extentTest.log(LogStatus.INFO,"Validated the length of text in footer",extentTest.addScreenCapture(FWUtils.takesScreenShot(driver,photoPath)));
		Assert.assertEquals(resetPasswordPage.checkTheDisplayOfTextInFooter(),true);
		logger.info("Validated the presence of text in footer");
		extentTest.log(LogStatus.INFO,"Validated the presence of text in footer",extentTest.addScreenCapture(FWUtils.takesScreenShot(driver,photoPath)));
		FWUtils.checksTheCountOfCapitalOrSmallLetters(text);
		logger.info("Checked the count of letters");
		extentTest.log(LogStatus.INFO,"Checked the count of letters",extentTest.addScreenCapture(FWUtils.takesScreenShot(driver,photoPath)));
		Assert.assertEquals(resetPasswordPage.checksCSSPropertiesInFooter(),"15.8754px");
		Assert.assertEquals(resetPasswordPage.checksCSSPropertiesInFooterOthers(),"Diatype, sans-serif");
		Assert.assertEquals(resetPasswordPage.checksCSSpropertiesInFooterAnother(),"rgba(255, 255, 255, 1)");
		logger.info("Validated the CSS properties of footer");
		extentTest.log(LogStatus.INFO,"Validated the CSS properties of footer",extentTest.addScreenCapture(FWUtils.takesScreenShot(driver,photoPath)));
		logger.info("Validated the resetPasswordPage footer properties");
		extentTest.log(LogStatus.INFO,"Validated the resetPasswordPage footer properties",extentTest.addScreenCapture(FWUtils.takesScreenShot(driver,photoPath)));
	}
	
}
