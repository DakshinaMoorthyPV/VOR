package org.stepDefinitions;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.generics.Base;
import org.generics.FWUtils;
import org.pages.CardCarouselBlockPage;
import org.testng.Assert;

import com.relevantcodes.extentreports.LogStatus;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Testing_the_feature_for_card_carousel_block_page extends Base{

	private static Logger logger = LogManager.getLogger(Testing_the_feature_for_card_carousel_block_page.class);
	CardCarouselBlockPage cardCarouselBlockPage = new CardCarouselBlockPage(driver);
	
	@When("User checks the logo displayed")
	public void user_checks_the_logo_displayed() throws InterruptedException, IOException 
	{
		Assert.assertEquals(cardCarouselBlockPage.logoIsPresent(),true);
		logger.info("Validated the logo is present");
		extentTest.log(LogStatus.PASS,"Validated the logo is present",extentTest.addScreenCapture(FWUtils.takesScreenShot(driver,photoPath)));
	}
	
	@When("I am at the cardcarouselblock page")
	public void i_am_at_the_cardcarouselblock_page() throws InterruptedException, IOException
	{
		cardCarouselBlockPage.validatefooterlocationdropdown(driver);
		logger.info("Validated the logo is present");
		extentTest.log(LogStatus.PASS,"Validated the logo is present",extentTest.addScreenCapture(FWUtils.takesScreenShot(driver,photoPath)));
	}
	
	@When("I click on the Country dropdown in Footer Section")
	public void I_click_on_the_Country_dropdown_in_Footer_Section() throws InterruptedException, IOException{
	    // Write code here that turns the phrase above into concrete actions
		try {
//			driver.navigate().to("https://uat.dxp.beazley.com/en-US/test-pages/testpage---c-15---cardcarouselblock---page");	
			cardCarouselBlockPage.validatefooterlocationdropdown(driver);
			logger.info("Footer section - Location dropdown validation");
			extentTest.log(LogStatus.PASS,"Footer section - Location dropdown validation",extentTest.addScreenCapture(FWUtils.takesScreenShot(driver,photoPath)));

		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();throw new io.cucumber.java.PendingException();
		}

	}
	
	@Then("I click on BackToTop link, Arrow icon and Beazley Logo in Footer Section")
	public void i_click_on_back_to_top_link_arrow_icon_and_beazley_logo_in_footer_section() throws InterruptedException, IOException {
	    // Write code here that turns the phrase above into concrete actions
		cardCarouselBlockPage.verifyBacktotop_ArrowUp_BeazleyLogo_DisplayandNavigation(driver);
		logger.info("Verified backtotop arrow up Beazley Logo display and navigation");
		extentTest.log(LogStatus.PASS,"Verified backtotop arrow up Beazley Logo display and navigation",extentTest.addScreenCapture(FWUtils.takesScreenShot(driver,photoPath)));
	}
	
	@And("The Copyright text should display with correct Text")
	public void the_copyright_text_should_display_with_correct_text() throws InterruptedException, IOException {
	    // Write code here that turns the phrase above into concrete actions
		cardCarouselBlockPage.VerifyWebelement();
		logger.info("Verified web element");
		extentTest.log(LogStatus.PASS,"Verified web element",extentTest.addScreenCapture(FWUtils.takesScreenShot(driver,photoPath)));
	}
	
	@Then("I click on all the links in Primary Block")
	public void i_click_on_all_the_links_in_primary_block() throws InterruptedException, IOException {
	    // Write code here that turns the phrase above into concrete actions
		cardCarouselBlockPage.VerifyFootersectionPrimaryBlocklinkNavigation(driver);
	    System.out.println("+++++++++++  primary block completed");
	    logger.info("Verified primary block link, secondary block link navigation and validated footer social link display url navigation");
		extentTest.log(LogStatus.PASS,"Verified primary block link, secondary block link navigation and validated footer social link display url navigation",extentTest.addScreenCapture(FWUtils.takesScreenShot(driver,photoPath)));
	}
	
	@Then("I click on all the links in Secondary Block")
	public void i_click_on_all_the_links_in_secondary_block() throws InterruptedException, IOException {
	    // Write code here that turns the phrase above into concrete actions
	    cardCarouselBlockPage.VerifyFootersectionSecondaryBlocklinkNavigation(driver);
	    System.out.println("++++++++++++ secondary block completed");

	    logger.info("Verified primary block link, secondary block link navigation and validated footer social link display url navigation");
		extentTest.log(LogStatus.PASS,"Verified primary block link, secondary block link navigation and validated footer social link display url navigation",extentTest.addScreenCapture(FWUtils.takesScreenShot(driver,photoPath)));
	}
	
	
	@Then("I click on all the links in Footer Social Block")
	public void i_click_on_all_the_links_in_footer_social_block() throws InterruptedException, IOException {
	    // Write code here that turns the phrase above into concrete actions
	    cardCarouselBlockPage.validatefootersociallinkdisplay_url_navigation(driver);
	    logger.info("Verified primary block link, secondary block link navigation and validated footer social link display url navigation");
		extentTest.log(LogStatus.PASS,"Verified primary block link, secondary block link navigation and validated footer social link display url navigation",extentTest.addScreenCapture(FWUtils.takesScreenShot(driver,photoPath)));
	}
	
	
	@When("I able to view the Headercomponents in Page Header")
	public void i_able_to_view_the_headercomponents_in_page_header() throws InterruptedException, IOException {
	    // Write code here that turns the phrase above into concrete actions
		cardCarouselBlockPage.VerifyHeaderWebelement();
		 System.out.println("+++++++++++  Header Component display & Text validation  completed");
		 logger.info("Verified HeaderWebelement");
			extentTest.log(LogStatus.PASS,"Verified HeaderWebelement",extentTest.addScreenCapture(FWUtils.takesScreenShot(driver,photoPath)));
	}
	
	@When("I able to view all the cardcarousalblock and get each name of the cardcarousalblock in page")
	public void i_able_to_view_all_the_cardcarousalblock_and_get_each_name_of_the_cardcarousalblock_in_page() throws InterruptedException, IOException {
	    // Write code here that turns the phrase above into concrete actions
		cardCarouselBlockPage.VerifyCardCarouselBlockDisplayandHeaderTextOfEachCards(driver);
		 System.out.println("+++++++++++  Card Carousel Block Display & Title visible in UI");
		 logger.info("Verified CardCarouselBlockDisplayandHeaderTextOfEachCards");
			extentTest.log(LogStatus.PASS,"Verified CardCarouselBlockDisplayandHeaderTextOfEachCards",extentTest.addScreenCapture(FWUtils.takesScreenShot(driver,photoPath)));
	}
	
}
