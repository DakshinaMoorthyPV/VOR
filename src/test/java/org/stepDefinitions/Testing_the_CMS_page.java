package org.stepDefinitions;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.generics.Base;
import org.generics.FWUtils;
import org.pages.CMSPage;
import org.testng.Assert;

import com.relevantcodes.extentreports.LogStatus;

import io.cucumber.java.en.When;

public class Testing_the_CMS_page extends Base{
	
	private static Logger logger = LogManager.getLogger(Testing_the_CMS_page.class);
	CMSPage cmsPage = new CMSPage(driver);

	@When("User checks the texts of the cmspage header {string}")
	public void user_checks_the_texts_of_the_cmspage_header(String text) throws InterruptedException
	{
		logger.info("User checks the texts of the cmspage header");
		cmsPage.enterTextInBeazleyLogin("Nitin.kumar@beazley.com");
		Thread.sleep(2000);
		cmsPage.clickOnNext();
		Thread.sleep(3000);
		cmsPage.enterTextInBeazleyPassword("Papajaan2129#");
		cmsPage.signInButton();
		Thread.sleep(3000);
		//Assert.assertEquals(cmsPage.getText(),17);
		//Assert.assertEquals(cmsPage.isDisplayed(),true);
		//FWUtils.checksTheCountOfCapitalOrSmallLetters(text);
		extentTest.log(LogStatus.INFO,"User checks the texts of the cmspage header");
	}
	
}
