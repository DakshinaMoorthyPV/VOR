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
		extentTest.log(LogStatus.PASS,"Validated the presence of icon in header",extentTest.addScreenCapture(FWUtils.takesScreenShot(driver,photoPath)));
		logger.info("Validated the dashboardPage header properties");
		extentTest.log(LogStatus.PASS,"Validated the dashboardPage header properties",extentTest.addScreenCapture(FWUtils.takesScreenShot(driver,photoPath)));
	}

	@When("User checks the texts of the dashboardPage cards {string}")
	public void user_checks_the_texts_of_the_dashboard_page_cards(String text) throws InterruptedException, IOException 
	{
		FWUtils.scrollUptoParticularElement(driver,dashboardPage.getCriticalWeaknessCards());
		Assert.assertEquals(dashboardPage.checkTheLengthOfTextInCards(),19);
		logger.info("Validated the length of text in cards");
		extentTest.log(LogStatus.PASS,"Validated the length of text in cards",extentTest.addScreenCapture(FWUtils.takesScreenShot(driver,photoPath)));
		Assert.assertEquals(dashboardPage.checkTheDisplayOfTextInCards(),true);
		logger.info("Validated the presence of text in cards");
		extentTest.log(LogStatus.PASS,"Validated the presence of text in cards",extentTest.addScreenCapture(FWUtils.takesScreenShot(driver,photoPath)));
		FWUtils.checksTheCountOfCapitalOrSmallLetters(text);
		logger.info("Checked the count of letters");
		extentTest.log(LogStatus.PASS,"Checked the count of letters",extentTest.addScreenCapture(FWUtils.takesScreenShot(driver,photoPath)));
		Assert.assertEquals(dashboardPage.checksCSSPropertiesInCards(),"12px");
		Assert.assertEquals(dashboardPage.checksCSSPropertiesInCardsOthers(),"Diatype, sans-serif");
		Assert.assertEquals(dashboardPage.checksCSSpropertiesInCardsAnother(),"rgb(49, 49, 49)");
		logger.info("Validated the CSS properties of cards");
		extentTest.log(LogStatus.PASS,"Validated the CSS properties of cards",extentTest.addScreenCapture(FWUtils.takesScreenShot(driver,photoPath)));
		logger.info("Validated the dashboardPage cards properties");
		extentTest.log(LogStatus.PASS,"Validated the dashboardPage cards properties",extentTest.addScreenCapture(FWUtils.takesScreenShot(driver,photoPath)));
	}

	@And("User checks the texts of the dashboardPage footer {string}")
	public void user_checks_the_texts_of_the_dashboard_page_footer(String text) throws InterruptedException, IOException 
	{
		FWUtils.scrollUptoParticularElement(driver,dashboardPage.getEventsFooter());
		Assert.assertEquals(dashboardPage.checkTheLengthOfTextInFooter(),6);
		logger.info("Validated the length of text in footer");
		extentTest.log(LogStatus.PASS,"Validated the length of text in footer",extentTest.addScreenCapture(FWUtils.takesScreenShot(driver,photoPath)));
		Assert.assertEquals(dashboardPage.checkTheDisplayOfIconInFooter(),true);
		logger.info("Validated the presence of icon in footer");
		extentTest.log(LogStatus.PASS,"Validated the presence of icon in footer",extentTest.addScreenCapture(FWUtils.takesScreenShot(driver,photoPath)));
		FWUtils.checksTheCountOfCapitalOrSmallLetters(text);
		logger.info("Checked the count of letters");
		extentTest.log(LogStatus.PASS,"Checked the count of letters",extentTest.addScreenCapture(FWUtils.takesScreenShot(driver,photoPath)));
		Assert.assertEquals(dashboardPage.checksCSSPropertiesInFooter(),"15.8633px");
		Assert.assertEquals(dashboardPage.checksCSSPropertiesInFooterOthers(),"Diatype, sans-serif");
		Assert.assertEquals(dashboardPage.checksCSSpropertiesInFooterAnother(),"rgb(255, 255, 255)");
		logger.info("Validated the CSS properties of footer");
		extentTest.log(LogStatus.PASS,"Validated the CSS properties of footer",extentTest.addScreenCapture(FWUtils.takesScreenShot(driver,photoPath)));
		logger.info("Validated the dashboardPage footer properties");
		extentTest.log(LogStatus.PASS,"Validated the dashboardPage footer properties",extentTest.addScreenCapture(FWUtils.takesScreenShot(driver,photoPath)));
	}
	
	@When("User clicks on beazley logo {string}")
	public void user_clicks_on_beazley_logo(String expected) throws InterruptedException, IOException
	{
		dashboardPage.clickOnBeazleyLogo();
		logger.info("Clicked on Beazley logo");
		extentTest.log(LogStatus.PASS,"Clicked on Beazley logo",extentTest.addScreenCapture(FWUtils.takesScreenShot(driver,photoPath)));
		String actual = driver.getTitle();
		Assert.assertEquals(actual,expected);
		logger.info("Validated the title of the page");
		extentTest.log(LogStatus.PASS,"Validated the title of the page",extentTest.addScreenCapture(FWUtils.takesScreenShot(driver,photoPath)));
	}
	
	@When("User checks the content")
	public void user_checks_the_content() throws InterruptedException, IOException
	{
		Assert.assertEquals(dashboardPage.checkPresenceOfBands(),true);
		logger.info("Validated the presence of bands");
		extentTest.log(LogStatus.PASS,"Validated the presence of bands",extentTest.addScreenCapture(FWUtils.takesScreenShot(driver,photoPath)));
		Assert.assertEquals(dashboardPage.checkPresenceOfRiskFactorSummary(),true);
		logger.info("Validated the Risk Factor Summary");
		extentTest.log(LogStatus.PASS,"Validated the Risk Factor Summary",extentTest.addScreenCapture(FWUtils.takesScreenShot(driver,photoPath)));
		FWUtils.scrollUptoParticularElement(driver,dashboardPage.getcyberAttackSummaryCards());
		Assert.assertEquals(dashboardPage.checkPresenceOfCyberAttackSummary(),true);
		logger.info("Validated the Cyber Attack Summary");
		extentTest.log(LogStatus.PASS,"Validated the Cyber Attack Summary",extentTest.addScreenCapture(FWUtils.takesScreenShot(driver,photoPath)));
		FWUtils.scrollUptoParticularElement(driver,dashboardPage.getRiskScoreByCategory());
		Assert.assertEquals(dashboardPage.checkPresenceOfRiskScoreByCategory(),true);
		logger.info("Validated the Risk Score By Category");
		extentTest.log(LogStatus.PASS,"Validated the Risk Score By Category",extentTest.addScreenCapture(FWUtils.takesScreenShot(driver,photoPath)));
	}
	
	@When("User checks the bands")
	public void user_checks_the_bands() throws InterruptedException, IOException
	{
		Assert.assertEquals(dashboardPage.checkPresenceOfBandsOnly(),true);
		logger.info("Validated the presence of bands");
		extentTest.log(LogStatus.PASS,"Validated the presence of bands",extentTest.addScreenCapture(FWUtils.takesScreenShot(driver,photoPath)));
	}
	
	@When("User checks the status")
	public void user_checks_the_status() throws InterruptedException, IOException
	{
		Assert.assertEquals(dashboardPage.checkPresenceOfStatus(),true);
		logger.info("Validated the presence of status");
		extentTest.log(LogStatus.PASS,"Validated the presence of status",extentTest.addScreenCapture(FWUtils.takesScreenShot(driver,photoPath)));
	}
	
	@When("User checks there are totally 5 bands and can click on it")
	public void user_checks_there_are_totally_5_bands_and_can_click_on_it() throws InterruptedException, IOException
	{
		Assert.assertEquals(dashboardPage.checkTheCountOfBands(),5);
		logger.info("Validated there are totally 5 bands");
		extentTest.log(LogStatus.PASS,"Validated there are totally 5 bands",extentTest.addScreenCapture(FWUtils.takesScreenShot(driver,photoPath)));
		dashboardPage.clickBand();
		logger.info("Validated that the bands can be clickable");
		extentTest.log(LogStatus.PASS,"Validated that the bands can be clickable",extentTest.addScreenCapture(FWUtils.takesScreenShot(driver,photoPath)));
	}

}
