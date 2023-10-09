package org.stepDefinitions;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.generics.Base;
import org.generics.FWUtils;
import org.pages.ImageBlockPage;

import com.relevantcodes.extentreports.LogStatus;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Testing_the_feature_for_image_block extends Base{

	private static Logger logger = LogManager.getLogger(Testing_the_feature_for_image_block.class);
	ImageBlockPage page = new ImageBlockPage(driver);
	public static int count = 0;
	
    @When("I am at the ImageBlock page validate image display")
    public void i_am_at_the_image_block_page_validate_image_display() throws InterruptedException, IOException {
    // Write code here that turns the phrase above into concrete actions
    	count++;
		extentTest = extentReports.startTest("Image Block validation"+count,"Invocation of test-->"+count);
		page.VerifyImageBlockDisplayandHeaderTextOfEachCards(driver);
		 System.out.println("+++++++++++  Image Block Display & Title visible in UI");
		logger.info("Card section - Image Block Display & Title visible in UI");
		extentTest.log(LogStatus.PASS,"Card section - Image Block Display & Title visible in UI",extentTest.addScreenCapture(FWUtils.takesScreenShot(driver,photoPath)));
//		extentReports.endTest(extentTest);
}
    
  
    
	
}
