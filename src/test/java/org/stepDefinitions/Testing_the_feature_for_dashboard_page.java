package org.stepDefinitions;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.generics.Base;
import org.generics.FWUtils;
import org.pages.DashboardPage;
import org.testng.Assert;

import com.relevantcodes.extentreports.LogStatus;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

public class Testing_the_feature_for_dashboard_page extends Base{

	private static Logger logger = LogManager.getLogger(Testing_the_feature_for_dashboard_page.class);
	DashboardPage dashboardPage = new DashboardPage(driver);
	
	@When("User checks the texts of the dashboardPage header")
	public void user_checks_the_texts_of_the_dashboard_page_header() throws InterruptedException, IOException 
	{
		Assert.assertEquals(dashboardPage.checkTheDisplayOfIconInHeader(),true);
		logger.info("Validated the presence of icon in header");
		extentTest.log(LogStatus.INFO,"Validated the presence of icon in header",extentTest.addScreenCapture(FWUtils.takesScreenShot(driver,photoPath)));
		logger.info("Validated the dashboardPage header properties");
		extentTest.log(LogStatus.INFO,"Validated the dashboardPage header properties",extentTest.addScreenCapture(FWUtils.takesScreenShot(driver,photoPath)));
	}

	@When("User checks the texts of the dashboardPage cards {string}")
	public void user_checks_the_texts_of_the_dashboard_page_cards(String text) throws InterruptedException, IOException 
	{
		FWUtils.scrollUptoParticularElement(driver,dashboardPage.getCriticalWeaknessCards());
		Assert.assertEquals(dashboardPage.checkTheLengthOfTextInCards(),17);
		logger.info("Validated the length of text in cards");
		extentTest.log(LogStatus.INFO,"Validated the length of text in cards",extentTest.addScreenCapture(FWUtils.takesScreenShot(driver,photoPath)));
		Assert.assertEquals(dashboardPage.checkTheDisplayOfTextInCards(),true);
		logger.info("Validated the presence of text in cards");
		extentTest.log(LogStatus.INFO,"Validated the presence of text in cards",extentTest.addScreenCapture(FWUtils.takesScreenShot(driver,photoPath)));
		FWUtils.checksTheCountOfCapitalOrSmallLetters(text);
		logger.info("Checked the count of letters");
		extentTest.log(LogStatus.INFO,"Checked the count of letters",extentTest.addScreenCapture(FWUtils.takesScreenShot(driver,photoPath)));
		Assert.assertEquals(dashboardPage.checksCSSPropertiesInCards(),"12px");
		Assert.assertEquals(dashboardPage.checksCSSPropertiesInCardsOthers(),"Diatype, sans-serif");
		Assert.assertEquals(dashboardPage.checksCSSpropertiesInCardsAnother(),"rgb(49, 49, 49)");
		logger.info("Validated the CSS properties of cards");
		extentTest.log(LogStatus.INFO,"Validated the CSS properties of cards",extentTest.addScreenCapture(FWUtils.takesScreenShot(driver,photoPath)));
		logger.info("Validated the dashboardPage cards properties");
		extentTest.log(LogStatus.INFO,"Validated the dashboardPage cards properties",extentTest.addScreenCapture(FWUtils.takesScreenShot(driver,photoPath)));
	}

	@And("User checks the texts of the dashboardPage footer {string}")
	public void user_checks_the_texts_of_the_dashboard_page_footer(String text) throws InterruptedException, IOException 
	{
		FWUtils.scrollUptoParticularElement(driver,dashboardPage.getEventsFooter());
		Assert.assertEquals(dashboardPage.checkTheLengthOfTextInFooter(),6);
		logger.info("Validated the length of text in footer");
		extentTest.log(LogStatus.INFO,"Validated the length of text in footer",extentTest.addScreenCapture(FWUtils.takesScreenShot(driver,photoPath)));
		Assert.assertEquals(dashboardPage.checkTheDisplayOfIconInFooter(),true);
		logger.info("Validated the presence of icon in footer");
		extentTest.log(LogStatus.INFO,"Validated the presence of icon in footer",extentTest.addScreenCapture(FWUtils.takesScreenShot(driver,photoPath)));
		FWUtils.checksTheCountOfCapitalOrSmallLetters(text);
		logger.info("Checked the count of letters");
		extentTest.log(LogStatus.INFO,"Checked the count of letters",extentTest.addScreenCapture(FWUtils.takesScreenShot(driver,photoPath)));
		Assert.assertEquals(dashboardPage.checksCSSPropertiesInFooter(),"15.8633px");
		Assert.assertEquals(dashboardPage.checksCSSPropertiesInFooterOthers(),"Diatype, sans-serif");
		Assert.assertEquals(dashboardPage.checksCSSpropertiesInFooterAnother(),"rgb(255, 255, 255)");
		logger.info("Validated the CSS properties of footer");
		extentTest.log(LogStatus.INFO,"Validated the CSS properties of footer",extentTest.addScreenCapture(FWUtils.takesScreenShot(driver,photoPath)));
		logger.info("Validated the dashboardPage footer properties");
		extentTest.log(LogStatus.INFO,"Validated the dashboardPage footer properties",extentTest.addScreenCapture(FWUtils.takesScreenShot(driver,photoPath)));
	}
	
}
