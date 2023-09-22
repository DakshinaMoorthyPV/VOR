package org.stepDefinitions;

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
	public void user_checks_the_texts_of_the_header(String text)
	{
		logger.info("User checks the texts of the loginPage header properties");
		Assert.assertEquals(loginPage.checkTheLengthOfTextInHeader(),5);
		Assert.assertEquals(loginPage.checkTheDisplayOfIconInHeader(),true);
		FWUtils.checksTheCountOfCapitalOrSmallLetters(text);
		Assert.assertEquals(loginPage.checksCSSPropertiesInHeader(),"62.9152px");
		Assert.assertEquals(loginPage.checksCSSPropertiesInHeaderOthers(),"\"Tiempos Fine\", serif");
		Assert.assertEquals(loginPage.checksCSSpropertiesInHeaderAnother(),"rgba(255, 255, 255, 1)");
		extentTest.log(LogStatus.INFO,"User checks the texts of the loginPage header properties");
	}
	
	@When("User checks the texts of the loginPage cards {string}")
	public void user_checks_the_texts_of_the_cards(String text) throws InterruptedException
	{
		logger.info("User checks the texts of the loginPage cards properties");
		FWUtils.scrollUptoParticularElement(driver,loginPage.getloginToYourBeazleyDigitalAccountCards());
		Assert.assertEquals(loginPage.checkTheLengthOfTextInCards(),37);
		Assert.assertEquals(loginPage.checkTheDisplayOfImageInCards(),true);
		FWUtils.checksTheCountOfCapitalOrSmallLetters(text);
		Assert.assertEquals(loginPage.checksCSSPropertiesInCards(),"43.9006px");
		Assert.assertEquals(loginPage.checksCSSPropertiesInCardsOthers(),"\"Tiempos Fine\", serif");
		Assert.assertEquals(loginPage.checksCSSpropertiesInCardsAnother(),"rgba(242, 242, 242, 1)");
		extentTest.log(LogStatus.INFO,"User checks the texts of the loginPage cards properties");
	}
	
	@And("User checks the texts of the loginPage footer {string}")
	public void user_checks_the_texts_of_the_footer(String text) throws InterruptedException
	{
		logger.info("User checks the texts of the loginPage footer properties");
		FWUtils.scrollUptoParticularElement(driver,loginPage.getBackToTopFooter());
		Assert.assertEquals(loginPage.checkTheLengthOfTextInFooter(),11);
		Assert.assertEquals(loginPage.checkTheDisplayOfTextInFooter(),true);
		FWUtils.checksTheCountOfCapitalOrSmallLetters(text);
		Assert.assertEquals(loginPage.checksCSSPropertiesInFooter(),"15.8754px");
		Assert.assertEquals(loginPage.checksCSSPropertiesInFooterOthers(),"Diatype, sans-serif");
		Assert.assertEquals(loginPage.checksCSSpropertiesInFooterAnother(),"rgba(255, 255, 255, 1)");
		extentTest.log(LogStatus.INFO,"User checks the texts of the loginPage footer properties");
	}
	
}
