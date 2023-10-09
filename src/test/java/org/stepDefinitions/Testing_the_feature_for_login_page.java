package org.stepDefinitions;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.generics.Base;
import org.generics.FWUtils;
import org.pages.CreatePasswordPage;
import org.pages.LoginPage;
import org.testng.Assert;

import com.relevantcodes.extentreports.LogStatus;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

public class Testing_the_feature_for_login_page extends Base{

	private static Logger logger = LogManager.getLogger(Testing_the_feature_for_login_page.class);
	LoginPage loginPage = new LoginPage(driver);
	
	@When("User checks the texts of the loginPage header {string}")
	public void user_checks_the_texts_of_the_header(String text) throws InterruptedException, IOException
	{
		Assert.assertEquals(loginPage.checkTheLengthOfTextInHeader(),5);
		logger.info("Validated the length of text in header");
		extentTest.log(LogStatus.INFO,"Validated the length of text in header",extentTest.addScreenCapture(FWUtils.takesScreenShot(driver,photoPath)));
		Assert.assertEquals(loginPage.checkTheDisplayOfIconInHeader(),true);
		logger.info("Validated the presence of icon in header");
		extentTest.log(LogStatus.INFO,"Validated the presence of icon in header",extentTest.addScreenCapture(FWUtils.takesScreenShot(driver,photoPath)));
		FWUtils.checksTheCountOfCapitalOrSmallLetters(text);
		logger.info("Checked the count of letters");
		extentTest.log(LogStatus.INFO,"Checked the count of letters",extentTest.addScreenCapture(FWUtils.takesScreenShot(driver,photoPath)));
		Assert.assertEquals(loginPage.checksCSSPropertiesInHeader(),"62.9152px");
		Assert.assertEquals(loginPage.checksCSSPropertiesInHeaderOthers(),"\"Tiempos Fine\", serif");
		Assert.assertEquals(loginPage.checksCSSpropertiesInHeaderAnother(),"rgba(255, 255, 255, 1)");
		logger.info("Validated the CSS properties of header");
		extentTest.log(LogStatus.INFO,"Validated the CSS properties of header",extentTest.addScreenCapture(FWUtils.takesScreenShot(driver,photoPath)));
		logger.info("Validated the loginPage header properties");
		extentTest.log(LogStatus.INFO,"Validated the loginPage header properties",extentTest.addScreenCapture(FWUtils.takesScreenShot(driver,photoPath)));
	}
	
	@When("User checks the texts of the loginPage cards {string}")
	public void user_checks_the_texts_of_the_cards(String text) throws InterruptedException, IOException
	{
		FWUtils.scrollUptoParticularElement(driver,loginPage.getloginToYourBeazleyDigitalAccountCards());
		Assert.assertEquals(loginPage.checkTheLengthOfTextInCards(),37);
		logger.info("Validated the length of text in cards");
		extentTest.log(LogStatus.INFO,"Validated the length of text in cards",extentTest.addScreenCapture(FWUtils.takesScreenShot(driver,photoPath)));
		Assert.assertEquals(loginPage.checkTheDisplayOfImageInCards(),true);
		logger.info("Validated the presence of image in cards");
		extentTest.log(LogStatus.INFO,"Validated the presence of image in cards",extentTest.addScreenCapture(FWUtils.takesScreenShot(driver,photoPath)));
		FWUtils.checksTheCountOfCapitalOrSmallLetters(text);
		logger.info("Checked the count of letters");
		extentTest.log(LogStatus.INFO,"Checked the count of letters",extentTest.addScreenCapture(FWUtils.takesScreenShot(driver,photoPath)));
		Assert.assertEquals(loginPage.checksCSSPropertiesInCards(),"43.9006px");
		Assert.assertEquals(loginPage.checksCSSPropertiesInCardsOthers(),"\"Tiempos Fine\", serif");
		Assert.assertEquals(loginPage.checksCSSpropertiesInCardsAnother(),"rgba(242, 242, 242, 1)");
		logger.info("Validated the CSS properties of cards");
		extentTest.log(LogStatus.INFO,"Validated the CSS properties of cards",extentTest.addScreenCapture(FWUtils.takesScreenShot(driver,photoPath)));
		logger.info("Validated the loginPage cards properties");
		extentTest.log(LogStatus.INFO,"Validated the loginPage cards properties",extentTest.addScreenCapture(FWUtils.takesScreenShot(driver,photoPath)));
	}
	
	@And("User checks the texts of the loginPage footer {string}")
	public void user_checks_the_texts_of_the_footer(String text) throws InterruptedException, IOException
	{
		FWUtils.scrollUptoParticularElement(driver,loginPage.getBackToTopFooter());
		Assert.assertEquals(loginPage.checkTheLengthOfTextInFooter(),11);
		logger.info("Validated the length of text in footer");
		extentTest.log(LogStatus.INFO,"Validated the length of text in footer",extentTest.addScreenCapture(FWUtils.takesScreenShot(driver,photoPath)));
		Assert.assertEquals(loginPage.checkTheDisplayOfTextInFooter(),true);
		logger.info("Validated the presence of text in footer");
		extentTest.log(LogStatus.INFO,"Validated the presence of text in footer",extentTest.addScreenCapture(FWUtils.takesScreenShot(driver,photoPath)));
		FWUtils.checksTheCountOfCapitalOrSmallLetters(text);
		logger.info("Checked the count of letters");
		extentTest.log(LogStatus.INFO,"Checked the count of letters",extentTest.addScreenCapture(FWUtils.takesScreenShot(driver,photoPath)));
		Assert.assertEquals(loginPage.checksCSSPropertiesInFooter(),"15.8754px");
		Assert.assertEquals(loginPage.checksCSSPropertiesInFooterOthers(),"Diatype, sans-serif");
		Assert.assertEquals(loginPage.checksCSSpropertiesInFooterAnother(),"rgba(255, 255, 255, 1)");
		logger.info("Validated the CSS properties of footer");
		extentTest.log(LogStatus.INFO,"Validated the CSS properties of footer",extentTest.addScreenCapture(FWUtils.takesScreenShot(driver,photoPath)));
		logger.info("Validated the loginPage footer properties");
		extentTest.log(LogStatus.INFO,"Validated the loginPage footer properties",extentTest.addScreenCapture(FWUtils.takesScreenShot(driver,photoPath)));
	}
	
}
