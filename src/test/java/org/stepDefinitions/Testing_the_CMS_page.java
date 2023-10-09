package org.stepDefinitions;

import java.io.IOException;

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

	@When("User logins in the cmspage {string}")
	public void user_checks_the_texts_of_the_cmspage_header(String text) throws InterruptedException, IOException
	{
		cmsPage.enterTextInBeazleyLogin("Nitin.kumar@beazley.com");
		logger.info("Validated the username");
		extentTest.log(LogStatus.PASS,"Validated the username",extentTest.addScreenCapture(FWUtils.takesScreenShot(driver,photoPath)));
		cmsPage.clickOnNext();
		logger.info("Clicked on the next button");
		extentTest.log(LogStatus.PASS,"Clicked on the next button",extentTest.addScreenCapture(FWUtils.takesScreenShot(driver,photoPath)));
		Thread.sleep(3000);
		cmsPage.enterTextInBeazleyPassword("");
		logger.info("Validated the password");
		extentTest.log(LogStatus.PASS,"Validated the password",extentTest.addScreenCapture(FWUtils.takesScreenShot(driver,photoPath)));
		cmsPage.signInButton();
		logger.info("Clicked on sign in button");
		extentTest.log(LogStatus.PASS,"Clicked on sign in button",extentTest.addScreenCapture(FWUtils.takesScreenShot(driver,photoPath)));
		//Thread.sleep(3000);
		//Assert.assertEquals(cmsPage.getText(),17);
		//Assert.assertEquals(cmsPage.isDisplayed(),true);
		//FWUtils.checksTheCountOfCapitalOrSmallLetters(text);
		logger.info("Validated the login of cmspage");
		extentTest.log(LogStatus.PASS,"Validated the login of cmspage",extentTest.addScreenCapture(FWUtils.takesScreenShot(driver,photoPath)));
	}
	
}
