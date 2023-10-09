package org.stepDefinitions;

import java.io.IOException;

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
	public void user_checks_the_texts_of_the_header(String text) throws InterruptedException, IOException
	{
		Assert.assertEquals(createPasswordPage.checkTheLengthOfTextInHeader(),15);
		logger.info("Validated the length of text in header");
		extentTest.log(LogStatus.INFO,"Validated the length of text in header",extentTest.addScreenCapture(FWUtils.takesScreenShot(driver,photoPath)));
		Assert.assertEquals(createPasswordPage.checkTheDisplayOfIconInHeader(),true);
		logger.info("Validated the presence of icon in header");
		extentTest.log(LogStatus.INFO,"Validated the presence of icon in header",extentTest.addScreenCapture(FWUtils.takesScreenShot(driver,photoPath)));
		FWUtils.checksTheCountOfCapitalOrSmallLetters(text);
		logger.info("Checked the count of letters");
		extentTest.log(LogStatus.INFO,"Checked the count of letters",extentTest.addScreenCapture(FWUtils.takesScreenShot(driver,photoPath)));
		Assert.assertEquals(createPasswordPage.checksCSSPropertiesInHeader(),"62.9152px");
		Assert.assertEquals(createPasswordPage.checksCSSPropertiesInHeaderOthers(),"\"Tiempos Fine\", serif");
		Assert.assertEquals(createPasswordPage.checksCSSpropertiesInHeaderAnother(),"rgba(255, 255, 255, 1)");
		logger.info("Validated the CSS properties of header");
		extentTest.log(LogStatus.INFO,"Validated the CSS properties of header",extentTest.addScreenCapture(FWUtils.takesScreenShot(driver,photoPath)));
		logger.info("Validated the createPasswordPage header properties");
		extentTest.log(LogStatus.INFO,"Validated the createPasswordPage header properties",extentTest.addScreenCapture(FWUtils.takesScreenShot(driver,photoPath)));
	}
	
	@When("User checks the texts of the createPasswordPage cards {string}")
	public void user_checks_the_texts_of_the_cards(String text) throws InterruptedException, IOException
	{
		FWUtils.scrollUptoParticularElement(driver,createPasswordPage.getCurrentCustomersAndBrokersCards());
		Assert.assertEquals(createPasswordPage.checkTheLengthOfTextInCards(),27);
		logger.info("Validated the length of text in cards");
		extentTest.log(LogStatus.INFO,"Validated the length of text in cards",extentTest.addScreenCapture(FWUtils.takesScreenShot(driver,photoPath)));
		Assert.assertEquals(createPasswordPage.checkTheDisplayOfTextInCards(),true);
		logger.info("Validated the presence of text in cards");
		extentTest.log(LogStatus.INFO,"Validated the presence of text in cards",extentTest.addScreenCapture(FWUtils.takesScreenShot(driver,photoPath)));
		FWUtils.checksTheCountOfCapitalOrSmallLetters(text);
		logger.info("Checked the count of letters");
		extentTest.log(LogStatus.INFO,"Checked the count of letters",extentTest.addScreenCapture(FWUtils.takesScreenShot(driver,photoPath)));
		Assert.assertEquals(createPasswordPage.checksCSSPropertiesInCards(),"15.7508px");
		Assert.assertEquals(createPasswordPage.checksCSSPropertiesInCardsOthers(),"Diatype, sans-serif");
		Assert.assertEquals(createPasswordPage.checksCSSpropertiesInCardsAnother(),"rgba(220, 25, 155, 1)");
		logger.info("Validated the CSS properties of cards");
		extentTest.log(LogStatus.INFO,"Validated the CSS properties of cards",extentTest.addScreenCapture(FWUtils.takesScreenShot(driver,photoPath)));
		logger.info("Validated the createPasswordPage cards properties");
		extentTest.log(LogStatus.INFO,"Validated the createPasswordPage cards properties",extentTest.addScreenCapture(FWUtils.takesScreenShot(driver,photoPath)));
	}
	
	@And("User checks the texts of the createPasswordPage footer {string}")
	public void user_checks_the_texts_of_the_footer(String text) throws InterruptedException, IOException
	{
		FWUtils.scrollUptoParticularElement(driver,createPasswordPage.getBackToTopFooter());
		Assert.assertEquals(createPasswordPage.checkTheLengthOfTextInFooter(),11);
		logger.info("Validated the length of text in footer");
		extentTest.log(LogStatus.INFO,"Validated the length of text in footer",extentTest.addScreenCapture(FWUtils.takesScreenShot(driver,photoPath)));
		Assert.assertEquals(createPasswordPage.checkTheDisplayOfTextInFooter(),true);
		logger.info("Validated the presence of text in footer");
		extentTest.log(LogStatus.INFO,"Validated the presence of text in footer",extentTest.addScreenCapture(FWUtils.takesScreenShot(driver,photoPath)));
		FWUtils.checksTheCountOfCapitalOrSmallLetters(text);
		logger.info("Checked the count of letters");
		extentTest.log(LogStatus.INFO,"Checked the count of letters",extentTest.addScreenCapture(FWUtils.takesScreenShot(driver,photoPath)));
		Assert.assertEquals(createPasswordPage.checksCSSPropertiesInFooter(),"15.8754px");
		Assert.assertEquals(createPasswordPage.checksCSSPropertiesInFooterOthers(),"Diatype, sans-serif");
		Assert.assertEquals(createPasswordPage.checksCSSpropertiesInFooterAnother(),"rgba(255, 255, 255, 1)");
		logger.info("Validated the CSS properties of footer");
		extentTest.log(LogStatus.INFO,"Validated the CSS properties of footer",extentTest.addScreenCapture(FWUtils.takesScreenShot(driver,photoPath)));
		logger.info("Validated the createPasswordPage footer properties");
		extentTest.log(LogStatus.INFO,"Validated the createPasswordPage footer properties",extentTest.addScreenCapture(FWUtils.takesScreenShot(driver,photoPath)));
	}
	
}
