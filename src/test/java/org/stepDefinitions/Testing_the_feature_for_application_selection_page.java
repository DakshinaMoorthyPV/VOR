package org.stepDefinitions;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.generics.Base;
import org.generics.FWUtils;
import org.pages.ApplicationSelectionPage;
import org.testng.Assert;

import com.relevantcodes.extentreports.LogStatus;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Testing_the_feature_for_application_selection_page extends Base{
	
	private static Logger logger = LogManager.getLogger(Testing_the_feature_for_application_selection_page.class);
	ApplicationSelectionPage applicationSelectionPage = new ApplicationSelectionPage(driver);
	public static int count = 0;
	
	@Given("User need to be on {string}")
	public void user_need_to_be_on_Beazley_page(String expected) {
		count++;
		extentTest = extentReports.startTest("Scenario-->"+count,"Invocation of test-->"+count);
		logger.info("Validating the title of the page");
		String actual = driver.getTitle();
		Assert.assertEquals(actual,expected);
		extentTest.log(LogStatus.INFO,"Validating the title of the page");
	}
	
	@When("User checks the texts of the applicationSelectionPage header {string}")
	public void user_checks_the_texts_of_the_header(String text)
	{
		logger.info("User checks the texts of the applicationSelectionPage header properties");
		Assert.assertEquals(applicationSelectionPage.checkTheLengthOfTextInHeader(),16);
		Assert.assertEquals(applicationSelectionPage.checkTheDisplayOfIconInHeader(),true);
		FWUtils.checksTheCountOfCapitalOrSmallLetters(text);
		Assert.assertEquals(applicationSelectionPage.checksCSSPropertiesInHeader(),"62.91px");
		Assert.assertEquals(applicationSelectionPage.checksCSSPropertiesInHeaderOthers(),"Tiempos Fine, serif");
		Assert.assertEquals(applicationSelectionPage.checksCSSpropertiesInHeaderAnother(),"rgb(255, 255, 255)");
		extentTest.log(LogStatus.INFO,"User checks the texts of the applicationSelectionPage header properties");
	}
	
	@When("User checks the texts of the applicationSelectionPage cards {string}")
	public void user_checks_the_texts_of_the_cards(String text) throws InterruptedException
	{
		logger.info("User checks the texts of the applicationSelectionPage cards properties");
		FWUtils.scrollUptoParticularElement(driver,applicationSelectionPage.getYourApplicationsCards());
		Assert.assertEquals(applicationSelectionPage.checkTheLengthOfTextInCards(),17);
		Assert.assertEquals(applicationSelectionPage.checkTheDisplayOfTextInCards(),true);
		FWUtils.checksTheCountOfCapitalOrSmallLetters(text);
		Assert.assertEquals(applicationSelectionPage.checksCSSPropertiesInCards(),"76.88px");
		Assert.assertEquals(applicationSelectionPage.checksCSSPropertiesInCardsOthers(),"Tiempos Fine, serif");
		Assert.assertEquals(applicationSelectionPage.checksCSSpropertiesInCardsAnother(),"rgb(75, 0, 80)");
		extentTest.log(LogStatus.INFO,"User checks the texts of the applicationSelectionPage cards properties");
	}
	
	@And("User checks the texts of the applicationSelectionPage footer {string}")
	public void user_checks_the_texts_of_the_footer(String text) throws InterruptedException
	{
		logger.info("User checks the texts of the applicationSelectionPage footer properties");
		FWUtils.scrollUptoParticularElement(driver,applicationSelectionPage.getEventsFooter());
		Assert.assertEquals(applicationSelectionPage.checkTheLengthOfTextInFooter(),6);
		Assert.assertEquals(applicationSelectionPage.checkTheDisplayOfIconInFooter(),true);
		FWUtils.checksTheCountOfCapitalOrSmallLetters(text);
		Assert.assertEquals(applicationSelectionPage.checksCSSPropertiesInFooter(),"15.8633px");
		Assert.assertEquals(applicationSelectionPage.checksCSSPropertiesInFooterOthers(),"Diatype, sans-serif");
		Assert.assertEquals(applicationSelectionPage.checksCSSpropertiesInFooterAnother(),"rgb(255, 255, 255)");
		extentTest.log(LogStatus.INFO,"User checks the texts of the applicationSelectionPage footer properties");
	}
	
	@When("User checks texts of applicationSelectionPage timeout session popup {string}")
	public void user_checks_texts_of_timeout_session_popup(String text) 
	{
		logger.info("User checks texts of applicationSelectionPage timeout session popup");
		Assert.assertEquals(applicationSelectionPage.checkTheLengthOfTextInTimeOutSessionPopup(),21);
		Assert.assertEquals(applicationSelectionPage.checkTheDisplayOfTextInTimeOutSessionPopup(),true);
		FWUtils.checksTheCountOfCapitalOrSmallLetters(text);
		Assert.assertEquals(applicationSelectionPage.checkCSSPropertiesInTimeOutSessionPopup(),"30px");
		Assert.assertEquals(applicationSelectionPage.checkCSSPropertiesInTimeOutSessionPopupOthers(),"Tiempos Fine, serif");
		Assert.assertEquals(applicationSelectionPage.checksCSSpropertiesInTimeOutSessionPopupAnother(),"rgb(75, 0, 80)");
		extentTest.log(LogStatus.INFO,"User checks texts of applicationSelectionPage timeout session popup");
	}
	
}
