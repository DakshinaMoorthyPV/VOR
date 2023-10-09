package org.stepDefinitions;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.generics.Base;
import org.generics.FWUtils;
import org.pages.ApplicationSelectionPage;
import org.pages.CardCarouselBlockPage;
import org.testng.Assert;

import com.relevantcodes.extentreports.LogStatus;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class Testing_the_feature_for_application_selection_page extends Base{
	
	private static Logger logger = LogManager.getLogger(Testing_the_feature_for_application_selection_page.class);
	ApplicationSelectionPage applicationSelectionPage = new ApplicationSelectionPage(driver);
	CardCarouselBlockPage cardCarouselBlockPage = new CardCarouselBlockPage(driver);
	public static int count = 0;
	
	@Given("User need to be on {string}")
	public void user_need_to_be_on_Beazley_page(String expected) throws InterruptedException, IOException {
		count++;
		extentTest = extentReports.startTest("card carousel block page validation"+count,"Invocation of test-->"+count);
		String actual = driver.getTitle();
		Assert.assertEquals(actual,expected);
		logger.info("Validated the title of the page");
		extentTest.log(LogStatus.PASS,"Validated the title of the page",extentTest.addScreenCapture(FWUtils.takesScreenShot(driver,photoPath)));
	}
	
	@When("User checks the texts of the applicationSelectionPage header {string}")
	public void user_checks_the_texts_of_the_header(String text) throws InterruptedException, IOException
	{
		Assert.assertEquals(applicationSelectionPage.checkTheLengthOfTextInHeader(),16);
		logger.info("Validated the length of text Your Application title in header");
		extentTest.log(LogStatus.INFO,"Validated the length of text Your Application title in header",extentTest.addScreenCapture(FWUtils.takesScreenShot(driver,photoPath)));
		Assert.assertEquals(applicationSelectionPage.checkTheDisplayOfIconInHeader(),true);
		logger.info("Validated the presence of Beazley Icon in header");
		extentTest.log(LogStatus.INFO,"Validated the presence of Beazley Icon in header",extentTest.addScreenCapture(FWUtils.takesScreenShot(driver,photoPath)));
		FWUtils.checksTheCountOfCapitalOrSmallLetters(text);
		logger.info("Checked the count of capital and small letters of Your Application in header");
		extentTest.log(LogStatus.INFO,"Checked the count of capital and small letters of Your Application in header",extentTest.addScreenCapture(FWUtils.takesScreenShot(driver,photoPath)));
		Assert.assertEquals(applicationSelectionPage.checksCSSPropertiesInHeader(),"62.91px");
		Assert.assertEquals(applicationSelectionPage.checksCSSPropertiesInHeaderOthers(),"Tiempos Fine, serif");
		Assert.assertEquals(applicationSelectionPage.checksCSSpropertiesInHeaderAnother(),"rgb(255, 255, 255)");
		logger.info("Validated the CSS properties of Your Application title in header");
		extentTest.log(LogStatus.INFO,"Validated the CSS properties of Your Application title in header",extentTest.addScreenCapture(FWUtils.takesScreenShot(driver,photoPath)));
		logger.info("Validated the Application Selection page header properties");
		extentTest.log(LogStatus.INFO,"Validated the Application Selection page header properties",extentTest.addScreenCapture(FWUtils.takesScreenShot(driver,photoPath)));
	}
	
	@When("User checks the texts of the applicationSelectionPage cards {string}")
	public void user_checks_the_texts_of_the_cards(String text) throws InterruptedException, IOException
	{
		FWUtils.scrollUptoParticularElement(driver,applicationSelectionPage.getYourApplicationsCards());
		Assert.assertEquals(applicationSelectionPage.checkTheLengthOfTextInCards(),17);
		logger.info("Validated the length of text of title Your Applications in cards section");
		extentTest.log(LogStatus.INFO,"Validated the length of text of title Your Applications in cards section",extentTest.addScreenCapture(FWUtils.takesScreenShot(driver,photoPath)));
		Assert.assertEquals(applicationSelectionPage.checkTheDisplayOfTextInCards(),true);
		logger.info("Validated the presence of text Contact Us in cards section");
		extentTest.log(LogStatus.INFO,"Validated the presence of text Contact Us in cards section",extentTest.addScreenCapture(FWUtils.takesScreenShot(driver,photoPath)));
		FWUtils.checksTheCountOfCapitalOrSmallLetters(text);
		logger.info("Checked the count of capital and small letters of Your Applications title in Cards section");
		extentTest.log(LogStatus.INFO,"Checked the count of capital and small letters of Your Applications title in Cards section",extentTest.addScreenCapture(FWUtils.takesScreenShot(driver,photoPath)));
		Assert.assertEquals(applicationSelectionPage.checksCSSPropertiesInCards(),"76.88px");
		Assert.assertEquals(applicationSelectionPage.checksCSSPropertiesInCardsOthers(),"Tiempos Fine, serif");
		Assert.assertEquals(applicationSelectionPage.checksCSSpropertiesInCardsAnother(),"rgb(75, 0, 80)");
		logger.info("Validated the CSS properties of Your Applications title in cards section");
		extentTest.log(LogStatus.INFO,"Validated the CSS properties of Your Applications title in cards section",extentTest.addScreenCapture(FWUtils.takesScreenShot(driver,photoPath)));
		logger.info("Validated the Application Selection page cards section properties");
		extentTest.log(LogStatus.INFO,"Validated the Application Selection page cards section properties",extentTest.addScreenCapture(FWUtils.takesScreenShot(driver,photoPath)));
	}
	
	@And("User checks the texts of the applicationSelectionPage footer {string}")
	public void user_checks_the_texts_of_the_footer(String text) throws InterruptedException, IOException
	{
		FWUtils.scrollUptoParticularElement(driver,applicationSelectionPage.getEventsFooter());
		Assert.assertEquals(applicationSelectionPage.checkTheLengthOfTextInFooter(),6);
		logger.info("Validated the length of text for Events link in footer");
		extentTest.log(LogStatus.INFO,"Validated the length of text for Events link in footer",extentTest.addScreenCapture(FWUtils.takesScreenShot(driver,photoPath)));
		Assert.assertEquals(applicationSelectionPage.checkTheDisplayOfIconInFooter(),true);
		logger.info("Validated the presence of Beazley icon in footer");
		extentTest.log(LogStatus.INFO,"Validated the presence of Beazley icon in footer",extentTest.addScreenCapture(FWUtils.takesScreenShot(driver,photoPath)));
		FWUtils.checksTheCountOfCapitalOrSmallLetters(text);
		logger.info("Checked the count of capital and small letters of Events link in footer");
		extentTest.log(LogStatus.INFO,"Checked the count of capital and small letters of Events link in footer",extentTest.addScreenCapture(FWUtils.takesScreenShot(driver,photoPath)));
		Assert.assertEquals(applicationSelectionPage.checksCSSPropertiesInFooter(),"15.8633px");
		Assert.assertEquals(applicationSelectionPage.checksCSSPropertiesInFooterOthers(),"Diatype, sans-serif");
		Assert.assertEquals(applicationSelectionPage.checksCSSpropertiesInFooterAnother(),"rgb(255, 255, 255)");
		logger.info("Validated the CSS properties of Events link in footer");
		extentTest.log(LogStatus.INFO,"Validated the CSS properties of Events link in footer",extentTest.addScreenCapture(FWUtils.takesScreenShot(driver,photoPath)));
		logger.info("Validated the Application Selection page footer properties");
		extentTest.log(LogStatus.INFO,"Validated the Application Selection page footer properties",extentTest.addScreenCapture(FWUtils.takesScreenShot(driver,photoPath)));
	}
	
	@When("User checks texts of applicationSelectionPage timeout session popup {string}")
	public void user_checks_texts_of_timeout_session_popup(String text) throws InterruptedException, IOException 
	{
		Assert.assertEquals(applicationSelectionPage.checkTheLengthOfTextInTimeOutSessionPopup(),21);
		logger.info("Validated the length of text 'Session due to expire' in timeout session popup");
		extentTest.log(LogStatus.INFO,"Validated the length of text 'Session due to expire' in timeout session popup",extentTest.addScreenCapture(FWUtils.takesScreenShot(driver,photoPath)));
		Assert.assertEquals(applicationSelectionPage.checkTheDisplayOfTextInTimeOutSessionPopup(),true);
		logger.info("Validated the presence of text Extend Session in timeout session popup");
		extentTest.log(LogStatus.INFO,"Validated the presence of text Extend Session in timeout session popup",extentTest.addScreenCapture(FWUtils.takesScreenShot(driver,photoPath)));
		FWUtils.checksTheCountOfCapitalOrSmallLetters(text);
		logger.info("Checked the count of letters of capital and small letters in 'Session due to expire' text in timeout session popup");
		extentTest.log(LogStatus.INFO,"Checked the count of letters of capital and small letters in 'Session due to expire' text in timeout session popup",extentTest.addScreenCapture(FWUtils.takesScreenShot(driver,photoPath)));
		Assert.assertEquals(applicationSelectionPage.checkCSSPropertiesInTimeOutSessionPopup(),"30px");
		Assert.assertEquals(applicationSelectionPage.checkCSSPropertiesInTimeOutSessionPopupOthers(),"Tiempos Fine, serif");
		Assert.assertEquals(applicationSelectionPage.checksCSSpropertiesInTimeOutSessionPopupAnother(),"rgb(75, 0, 80)");
		logger.info("Validated the CSS properties of text 'Session due to expire' in timeout session popup");
		extentTest.log(LogStatus.INFO,"Validated the CSS properties of text 'Session due to expire' in timeout session popup",extentTest.addScreenCapture(FWUtils.takesScreenShot(driver,photoPath)));
		logger.info("Validated the timeout session popup properties");
		extentTest.log(LogStatus.INFO,"Validated the timeout session popup properties",extentTest.addScreenCapture(FWUtils.takesScreenShot(driver,photoPath)));
	}
	
}
