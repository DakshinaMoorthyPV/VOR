package org.stepDefinitions;

import java.io.IOException;

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
	public void user_checks_the_texts_of_the_header(String text) throws InterruptedException, IOException
	{
		Assert.assertEquals(loginMFAPage.checkTheLengthOfTextInHeader(),5);
		logger.info("Validated the length of text in header");
		extentTest.log(LogStatus.INFO,"Validated the length of text in header",extentTest.addScreenCapture(FWUtils.takesScreenShot(driver,photoPath)));
		Assert.assertEquals(loginMFAPage.checkTheDisplayOfIconInHeader(),true);
		logger.info("Validated the presence of icon in header");
		extentTest.log(LogStatus.INFO,"Validated the presence of icon in header",extentTest.addScreenCapture(FWUtils.takesScreenShot(driver,photoPath)));
		FWUtils.checksTheCountOfCapitalOrSmallLetters(text);
		logger.info("Checked the count of letters");
		extentTest.log(LogStatus.INFO,"Checked the count of letters",extentTest.addScreenCapture(FWUtils.takesScreenShot(driver,photoPath)));
		Assert.assertEquals(loginMFAPage.checksCSSPropertiesInHeader(),"62.9152px");
		Assert.assertEquals(loginMFAPage.checksCSSPropertiesInHeaderOthers(),"\"Tiempos Fine\", serif");
		Assert.assertEquals(loginMFAPage.checksCSSpropertiesInHeaderAnother(),"rgba(255, 255, 255, 1)");
		logger.info("Validated the CSS properties of header");
		extentTest.log(LogStatus.INFO,"Validated the CSS properties of header",extentTest.addScreenCapture(FWUtils.takesScreenShot(driver,photoPath)));
		logger.info("Validated the loginMFA header properties");
		extentTest.log(LogStatus.INFO,"Validated the loginMFA header properties",extentTest.addScreenCapture(FWUtils.takesScreenShot(driver,photoPath)));
	}
	
	@When("User checks the texts of the loginMFA cards {string}")
	public void user_checks_the_texts_of_the_cards(String text) throws InterruptedException, IOException
	{
		FWUtils.scrollUptoParticularElement(driver,loginMFAPage.getLoginToYourBeazleyDigitalAccountCards());
		Assert.assertEquals(loginMFAPage.checkTheLengthOfTextInCards(),37);
		logger.info("Validated the length of text in cards");
		extentTest.log(LogStatus.INFO,"Validated the length of text in cards",extentTest.addScreenCapture(FWUtils.takesScreenShot(driver,photoPath)));
		Assert.assertEquals(loginMFAPage.checkTheDisplayOfTextInCards(),true);
		logger.info("Validated the presence of text in cards");
		extentTest.log(LogStatus.INFO,"Validated the presence of text in cards",extentTest.addScreenCapture(FWUtils.takesScreenShot(driver,photoPath)));
		FWUtils.checksTheCountOfCapitalOrSmallLetters(text);
		logger.info("Checked the count of letters");
		extentTest.log(LogStatus.INFO,"Checked the count of letters",extentTest.addScreenCapture(FWUtils.takesScreenShot(driver,photoPath)));
		Assert.assertEquals(loginMFAPage.checksCSSPropertiesInCards(),"43.9006px");
		Assert.assertEquals(loginMFAPage.checksCSSPropertiesInCardsOthers(),"\"Tiempos Fine\", serif");
		Assert.assertEquals(loginMFAPage.checksCSSpropertiesInCardsAnother(),"rgba(242, 242, 242, 1)");
		logger.info("Validated the CSS properties of cards");
		extentTest.log(LogStatus.INFO,"Validated the CSS properties of cards",extentTest.addScreenCapture(FWUtils.takesScreenShot(driver,photoPath)));
		logger.info("Validated the loginMFA cards properties");
		extentTest.log(LogStatus.INFO,"Validated the loginMFA cards properties",extentTest.addScreenCapture(FWUtils.takesScreenShot(driver,photoPath)));
	}
	
	@And("User checks the texts of the loginMFA footer {string}")
	public void user_checks_the_texts_of_the_footer(String text) throws InterruptedException, IOException
	{
		FWUtils.scrollUptoParticularElement(driver,loginMFAPage.getCareersFooter());
		Assert.assertEquals(loginMFAPage.checkTheLengthOfTextInFooter(),7);
		logger.info("Validated the length of text in footer");
		extentTest.log(LogStatus.INFO,"Validated the length of text in footer",extentTest.addScreenCapture(FWUtils.takesScreenShot(driver,photoPath)));
		Assert.assertEquals(loginMFAPage.checkTheDisplayOfIconInFooter(),true);
		logger.info("Validated the presence of icon in footer");
		extentTest.log(LogStatus.INFO,"Validated the presence of icon in footer",extentTest.addScreenCapture(FWUtils.takesScreenShot(driver,photoPath)));
		FWUtils.checksTheCountOfCapitalOrSmallLetters(text);
		logger.info("Checked the count of letters");
		extentTest.log(LogStatus.INFO,"Checked the count of letters",extentTest.addScreenCapture(FWUtils.takesScreenShot(driver,photoPath)));
		Assert.assertEquals(loginMFAPage.checksCSSPropertiesInFooter(),"15.8754px");
		Assert.assertEquals(loginMFAPage.checksCSSPropertiesInFooterOthers(),"Diatype, sans-serif");
		Assert.assertEquals(loginMFAPage.checksCSSpropertiesInFooterAnother(),"rgba(255, 255, 255, 1)");
		logger.info("Validated the CSS properties of footer");
		extentTest.log(LogStatus.INFO,"Validated the CSS properties of footer",extentTest.addScreenCapture(FWUtils.takesScreenShot(driver,photoPath)));
		logger.info("Validated the loginMFA footer properties");
		extentTest.log(LogStatus.INFO,"Validated the loginMFA footer properties",extentTest.addScreenCapture(FWUtils.takesScreenShot(driver,photoPath)));
	}
	
}
