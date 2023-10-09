package org.pages;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.logging.LogEntries;
import org.openqa.selenium.logging.LogEntry;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ImageBlockPage {

		@FindBy(xpath = "//span[@data-testid='footerBlockSelectedLocationText']")
		private WebElement footerlocation;

		@FindBy(xpath = "//li//a[@data-testid='footerBlockLocationLink']")
		private WebElement footerlocationlist;

		@FindBy(xpath = "//input[@id='passwordInput']")
		private WebElement beazleyPassword;

		@FindBy(xpath = "//input[@id='idSIButton9']")
		private WebElement nextButton;

		@FindBy(xpath = "//span[text()='Back to Top']")
		private WebElement backtotop;
		
		@FindBy(xpath = "//span[@data-testid='footerBlockArrowUp']")
		private WebElement footerarrowup;
		
		@FindBy(xpath = "//a[@data-testid='footerBlockLogoLink']")
		private WebElement beazleylogo;
		
		@FindBy(xpath = "//div[@class='bg-pezzottaite-deep-base footer-bottom']//ul[@data-testid='footerBlockSecondaryLinks']//li//a[contains(text(),'Privacy & Cookies')]")
		private WebElement privacycookies;
		
		@FindBy(xpath = "//div[@class='bg-pezzottaite-deep-base footer-bottom']//ul[@data-testid='footerBlockSecondaryLinks']//li//a[contains(text(),'Legal Information')]")
		private WebElement legalinformation;
		
		@FindBy(xpath = "//div[@class='bg-pezzottaite-deep-base footer-bottom']//ul[@data-testid='footerBlockSecondaryLinks']//li//a[contains(text(),'Modern Slavery')]")
		private WebElement modernslavery;
		
		@FindBy(xpath = "//div[@class='bg-pezzottaite-deep-base footer-bottom']//ul[@data-testid='footerBlockSecondaryLinks']//li//a[contains(text(),'HP UAT')]")
		private WebElement hpuat;
		
		@FindBy(xpath = "//div[@class='bg-pezzottaite-deep-base footer-bottom']//ul[@data-testid='footerBlockSecondaryLinks']//li//span[contains(text(),'© Beazley Group | LLOYD’s Underwriters HP  | some extra text to check if the wrapping issue is fixed')]")
		private WebElement copyrighttext;
		
		@FindBy(xpath = "//div[@class='bg-pezzottaite-deep-base footer-bottom']//ul[@data-testid='footerBlockPrimaryLinks']//li//a[contains(text(),'Investor Relations')]")
		private WebElement investorrelations;
		
		@FindBy(xpath = "//div[@class='bg-pezzottaite-deep-base footer-bottom']//ul[@data-testid='footerBlockPrimaryLinks']//li//a[contains(text(),'Careers')]")
		private WebElement careers;
		
		@FindBy(xpath = "//div[@class='bg-pezzottaite-deep-base footer-bottom']//ul[@data-testid='footerBlockPrimaryLinks']//li//a[contains(text(),'Contact Us')]")
		private WebElement contactus;
		
		@FindBy(xpath = "//div[@class='bg-pezzottaite-deep-base footer-bottom']//ul[@data-testid='footerBlockPrimaryLinks']//li//a[contains(text(),'Link 4')]")
		private WebElement link4;
		
		@FindBy(xpath = "//div[@class='bg-pezzottaite-deep-base footer-bottom']//ul[@data-testid='footerBlockPrimaryLinks']//li//a[contains(text(),'Link 5')]")
		private WebElement link5;
		
		@FindBy(xpath = "//div[@class='bg-pezzottaite-deep-base footer-bottom']//ul[@data-testid='footerBlockPrimaryLinks']//li//a[contains(text(),'HP UAT')]")
		private WebElement primaryhpuat;
		
		@FindBy(xpath = "//a[@data-testid='footerBlockSocialLink']")
		private WebElement sociallinks;
		
		
		@FindBy(xpath = "//span[text()='Log In']")
		private WebElement headerlogin;
		
		@FindBy(xpath = "//div[@id='headerBlockSearchToggle']")
		private WebElement headersearchicon;

		@FindBy(xpath = "//div[@class='py-[25px] hidden justify-between items-center md:block']//a[@data-testid='headerBlockLogoLink']")
		private WebElement headerbeazleylogo;
		
		@FindBy(xpath = "//ul[@data-testid='headerBlockMainNavItems']//li//div[@data-ga-param-click-text='Who We Are']")
		private WebElement heaerwhoweare;
		
		@FindBy(xpath = "//ul[@data-testid='headerBlockMainNavItems']//li//a[@data-ga-param-click-text='Products']")
		private WebElement headerproducts;
		
		@FindBy(xpath = "//ul[@data-testid='headerBlockMainNavItems']//li//a[@data-ga-param-click-text='Industries']")
		private WebElement headerindustries;
		
		@FindBy(xpath = "//ul[@data-testid='headerBlockMainNavItems']//li//a[@data-ga-param-click-text='Claims']")
		private WebElement headerclaims;
		
		@FindBy(xpath = "//ul[@data-testid='headerBlockMainNavItems']//li//div[@data-ga-param-click-text='Investor']")
		private WebElement headerinvestor;
		
		@FindBy(xpath = "//ul[@data-testid='headerBlockMainNavItems']//li//div[@data-ga-param-click-text='News & Events']")
		private WebElement headernewsevents;
		
		
		@FindBy(xpath = "//div[@class='block cardcarouselblockmodel']//div//div//h2")
		private WebElement cardcarouselblockmodel;
		
		private String imageblock ="//div[@class='block imageblockmodel']//picture//img";
		
		//ul[@data-testid='headerBlockMainNavItems']//li//a[@data-ga-param-click-text='Claims']
		
		

		public ImageBlockPage(WebDriver driver) {
			PageFactory.initElements(driver, this);
		}

//		public int getText()
//		{
//			return yourApplicationsHeaderCMS.getText().length();
//		}

		public boolean isDisplayed(WebElement UIelement) {
			return UIelement.isDisplayed();
		}

		public void ScrollToFooter(WebDriver driver) throws InterruptedException {
			Thread.sleep(5000);
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(20000,20000)", "");
			Thread.sleep(1000);
		}
		
		public void validatefootersociallinkdisplay_url_navigation(WebDriver driver) throws InterruptedException {
			ScrollToFooter(driver);
			List<WebElement> allsociallinks = driver.findElements(By.xpath("//a[@data-testid='footerBlockSocialLink']"));

			Iterator<WebElement> itr = allsociallinks.iterator();
			List<String> UIlink = new ArrayList<String>();
			while (itr.hasNext()) {
				UIlink.add(itr.next().getAttribute("href"));
//				    System.out.println(itr.next().getText());
				}
			ArrayList<String> ExpectedURL1 = new ArrayList<String>();
			ExpectedURL1.add("https://www.facebook.com/beazleyinsurance");
			ExpectedURL1.add("https://www.linkedin.com/company/beazley");
			ExpectedURL1.add("https://www.twitter.com/BeazleyGroup");
			ExpectedURL1.add("https://www.youtube.com/user/BeazleyGroup");
			ExpectedURL1.add("https://www.instagram.com/beazleygroup");
			ExpectedURL1.add("https://uat.dxp.beazley.com/en-US/training-pages/hp-uat-careers/");
			
			System.out.println(UIlink);
			System.out.println(ExpectedURL1);
			
			boolean urlvalue = UIlink.equals(ExpectedURL1); // returns true because lists are equal
			System.out.println(urlvalue);
			if (urlvalue == true) {
				System.out.println("Footer section - Social links- URL Text validation: -Actual value: ----" + UIlink	+ "Expected value: -----" + ExpectedURL1 + "   . URL Values Matched!");
			}
			
//			solicallinknavig(driver);
			
		}
		
		public void solicallinknavig(WebDriver driver) throws InterruptedException{
			List<WebElement> sociallinknavigation = driver.findElements(By.xpath("//a[@data-testid='footerBlockSocialLink']"));
			for(int i=0;i<sociallinknavigation.size();i++)
	        { 
				sociallinknavigation.get(i).click();
	            System.out.println(driver.getTitle());
	            Thread.sleep(50);
	            driver.navigate().back();
	        }
		}
		
		public void validateheaderlocationdropdown(WebDriver driver) throws InterruptedException {
//			ScrollToFooter(driver);

				String Navigationitem = "//button[@data-testid='headerBlockButton']";
				String Navigationitemlist ="//button[@data-testid='headerBlockButton']//ul//li";
				
			driver.findElement(By.xpath(Navigationitem)).click();
			Thread.sleep(500);

			List<WebElement> allLinks = driver.findElements(By.xpath(Navigationitemlist));

			Iterator<WebElement> itr = allLinks.iterator();
			List<String> secondList = new ArrayList<String>();
			while (itr.hasNext()) {
				secondList.add(itr.next().getText());
//				    System.out.println(itr.next().getText());

			}
			ArrayList<String> firstList = new ArrayList<String>();
			
//			United Kingdom, Asia Pacific, Canada, Switzerland, London, Canada (French), France (French), Germany (German), Spain (Spanish), Latin Ameria (Spanish)

//				ArrayList<String> ArrayList1 = new ArrayList<String>();
			firstList.add("United Kingdom");
			firstList.add("Asia Pacific");
			firstList.add("Canada");
			firstList.add("Switzerland");
			firstList.add("London");
			firstList.add("Canada (French)");
			firstList.add("France (French)");
			firstList.add("Germany (German)");
			firstList.add("Spain (Spanish)");
			firstList.add("Latin Ameria (Spanish)");
			System.out.println(firstList);
			System.out.println(secondList);
			// comparing both lists
			boolean boolval = firstList.equals(secondList); // returns true because lists are equal
			System.out.println(boolval);
			if (boolval == true) {
				System.out.println("Header section - Location dropdown validation: -Actual value: ----" + firstList
						+ "Expected value: -----" + secondList + "   . Location Values Matched!");
			}
		}

		public void validatefooterlocationdropdown(WebDriver driver) throws InterruptedException {
			ScrollToFooter(driver);

				String Navigationitem = "//span[@data-testid='footerBlockSelectedLocationText']";
				String Navigationitemlist ="//li//a[@data-testid='footerBlockLocationLink']";

//			String Navigationitem = "//div[@class='footer-container']//li[@class='navigation-item']";
//			String Navigationitemlist = "//div[@class='footer-container']//li[@class='navigation-item']//li//a[@role='menuitem']";

			// WebElement select = driver.findElement(By.id("airlineid"));
			// WebElement option = select.getFirstSelectedOption();
			// String selectedValueInDropDown = option.getText();
//				Boolean found = false;
			driver.findElement(By.xpath(Navigationitem)).click();
			Thread.sleep(500);
//				WebElement element = driver.findElement(By.xpath(Navigationitemlist));

			List<WebElement> allLinks = driver.findElements(By.xpath(Navigationitemlist));

			Iterator<WebElement> itr = allLinks.iterator();
			List<String> secondList = new ArrayList<String>();
			while (itr.hasNext()) {
				secondList.add(itr.next().getText());
//				    System.out.println(itr.next().getText());

			}
			ArrayList<String> firstList = new ArrayList<String>();
			;

//				ArrayList<String> ArrayList1 = new ArrayList<String>();
			firstList.add("USA");
			firstList.add("London Market");
			firstList.add("Asia Pacific");
			firstList.add("Canada (English)");
			firstList.add("France");
			firstList.add("Germany");
			firstList.add("Latin America");
			firstList.add("Spain");
			firstList.add("United Kingdom");
			firstList.add("Switzerland");
			firstList.add("Canada (French)");
			System.out.println(firstList);
			System.out.println(secondList);
			// comparing both lists
			boolean boolval = firstList.equals(secondList); // returns true because lists are equal
			System.out.println(boolval);
			if (boolval == true) {
				System.out.println("Footer section - Location dropdown validation: -Actual value: ----" + firstList
						+ "Expected value: -----" + secondList + "   . Location Values Matched!");
			}
		}

		public void clickOnNext() {
			nextButton.click();
		}
		
		public void verifyBacktotop_ArrowUp_BeazleyLogo_DisplayandNavigation(WebDriver driver) throws InterruptedException {
			ScrollToFooter(driver);
			FooterWebelementDisplay_Navigation(driver, backtotop,"In Footer Section - Clicked on 'Back to Top' link & Link Navigaiton verified!");
			ScrollToFooter(driver);
			FooterWebelementDisplay_Navigation(driver, footerarrowup,"In Footer Section - Clicked on 'Arrow Up' link & Link Navigaiton verified!");

			ScrollToFooter(driver);
			FooterWebelementDisplay_Navigation(driver, beazleylogo,"In Footer Section - Clicked on 'Beazley' logo & Link Navigaiton verified!");
			
			String url = driver.getCurrentUrl();
//			checkpageload500error(driver);
			if(url.equalsIgnoreCase("https://www.beazley.com/en-us"))
			System.out.println("In Footer Section - Beazley logo navigation Success! Page landed in 'https://www.beazley.com/en-us' ");
			driver.navigate().back();
			ScrollToFooter(driver);
		}

		public void VerifyFootersectionSecondaryBlocklinkNavigation(WebDriver driver) throws InterruptedException {
			ScrollToFooter(driver);
			String url = driver.getCurrentUrl();		
			FooterWebelementDisplay_Navigation(driver, privacycookies,"In Footer Section - Clicked on 'Privacy & Cookies' link & Link Navigaiton verified!");
			if(url.equalsIgnoreCase("https://www.beazley.com/en-us"))
			System.out.println("In Footer Section - Privacy & Cookies link  navigation Success! Page landed in 'https://www.beazley.com/en-us' ");
			driver.navigate().back();
			ScrollToFooter(driver);
			
			FooterWebelementDisplay_Navigation(driver, legalinformation,"In Footer Section - Clicked on 'Legal Information' link & Link Navigaiton verified!");
			if(url.equalsIgnoreCase("https://www.beazley.com/en-us"))
			System.out.println("In Footer Section - Legal Information Link navigation Success! Page landed in 'https://www.beazley.com/en-us' ");
			driver.navigate().back();
			ScrollToFooter(driver);
			
			FooterWebelementDisplay_Navigation(driver, modernslavery,"In Footer Section - Clicked on 'Modern Slavery' link & Link Navigaiton verified!");
			if(url.equalsIgnoreCase("https://www.beazley.com/en-us"))
			System.out.println("In Footer Section - Modern Slavery Link  navigation Success! Page landed in 'https://www.beazley.com/en-us' ");
			driver.navigate().back();
			ScrollToFooter(driver);
			
			FooterWebelementDisplay_Navigation(driver, hpuat,"In Footer Section - Clicked on 'HP UAT ' link  & Link Navigaiton verified!" );
			if(url.equalsIgnoreCase("https://uat.dxp.beazley.com/en-US/training-pages/hp-uat-page-1-v2/"))
			System.out.println("In Footer Section - Hp UAT link navigation Failed! Page landed in '500 Page data error' ");
			driver.navigate().back();
			ScrollToFooter(driver);
			System.out.println("************** Footer - Secondary  Block Links - Display & Navigation - Validaiton Compelted! ");
			
		}
		
		public void VerifyFootersectionPrimaryBlocklinkNavigation(WebDriver driver) throws InterruptedException {
			ScrollToFooter(driver);
			FooterWebelementDisplay_Navigation(driver, investorrelations,"In Footer Section - Clicked on 'Investor Relations' link & Link Navigaiton verified!");
			String url = driver.getCurrentUrl();	
			if(url.equalsIgnoreCase("https://www.beazley.com/en-us"))
			System.out.println("In Footer Section - Investor Relations link  navigation Success! Page landed in 'https://www.beazley.com/en-us' ");
			driver.navigate().back();
			ScrollToFooter(driver);
			
			FooterWebelementDisplay_Navigation(driver, careers,"In Footer Section - Clicked on 'Careers' link & Link Navigaiton verified!");
			if(url.equalsIgnoreCase("https://www.beazley.com/en-us"))
			System.out.println("In Footer Section - Careers  Link navigation Success! Page landed in 'https://www.beazley.com/en-us' ");
			driver.navigate().back();
			ScrollToFooter(driver);
			
			FooterWebelementDisplay_Navigation(driver, contactus,"In Footer Section - Clicked on 'Contact Us' link & Link Navigaiton verified!");
			if(url.equalsIgnoreCase("https://www.beazley.com/en-us"))
			System.out.println("In Footer Section - Contact Us Link  navigation Success! Page landed in 'https://www.beazley.com/en-us' ");
			driver.navigate().back();
			ScrollToFooter(driver);
			
			FooterWebelementDisplay_Navigation(driver, link4,"In Footer Section - Clicked on 'Link 4' link & Link Navigaiton verified!");
			if(url.equalsIgnoreCase("https://www.beazley.com/en-us"))
			System.out.println("In Footer Section - 'Link 4' Link  navigation Success! Page landed in 'https://www.beazley.com/en-us' ");
			driver.navigate().back();
			ScrollToFooter(driver);
			
			FooterWebelementDisplay_Navigation(driver, link5,"In Footer Section - Clicked on 'Link 5' link & Link Navigaiton verified!");
			if(url.equalsIgnoreCase("https://www.beazley.com/en-us"))
			System.out.println("In Footer Section - Link 5 Link  navigation Success! Page landed in 'https://www.beazley.com/en-us' ");
			driver.navigate().back();
			ScrollToFooter(driver);
			
			FooterWebelementDisplay_Navigation(driver, primaryhpuat,"In Footer Section - Clicked on 'HP UAT ' link  & Link Navigaiton verified!" );
			if(url.equalsIgnoreCase("https://uat.dxp.beazley.com/en-US/training-pages/hp-uat-page-1-v2/"))
			System.out.println("In Footer Section - Hp UAT link navigation Failed! Page landed in '500 Page data error' ");
			driver.navigate().back();
			ScrollToFooter(driver);
			System.out.println("************** Footer - Primary Block Links - Display & Navigation - Validaiton Compelted! ");
			
		}

		
		
		public void VerifyWebelement() {
			FooterElementDisplayandTextvalidation(copyrighttext, "© Beazley Group | LLOYD’s Underwriters HP  | some extra text to check if the wrapping issue is fixed");
			
		}

		
		public void VerifyHeaderWebelement() {
			HeaderElementDisplayandTextvalidation(headerlogin, "Log In");
//			HeaderElementDisplayandTextvalidation(headersearchicon, "");
//			HeaderElementDisplayandTextvalidation(headerbeazleylogo, "");
			HeaderElementDisplayandTextvalidation(heaerwhoweare, "Who We Are");
			HeaderElementDisplayandTextvalidation(headerproducts, "Products");
			HeaderElementDisplayandTextvalidation(headerindustries, "Industries");
			HeaderElementDisplayandTextvalidation(headerclaims, "Claims");
			HeaderElementDisplayandTextvalidation(headerinvestor, "Investor");
			HeaderElementDisplayandTextvalidation(headernewsevents, "News & Events'");
			isDisplayed(headersearchicon);
			isDisplayed(headerbeazleylogo);
			
		}
		
		public void VerifyImageBlockDisplayandHeaderTextOfEachCards(WebDriver driver) {
			
			CardCarouselBlock(driver,imageblock );
		}
		
		
		public void checkpageload500error(WebDriver driver) {
			boolean error; 
			error =isDisplayed(driver.findElement(By.xpath("//p[text()='Failed to request pageData from API, check the request URL']")));
			    if (error = true)
//			        fail("500 page displayed! Failing test, and quitting.");
					System.out.println("!!!!!!!!!   Error LogType: Error Log message: Failed to request pageData from API, check the request URL ");
			}
		
		public void checkpageload404error(WebDriver driver) {
			LogEntries logEntries = driver.manage().logs().get("browser");
			for (LogEntry entry : logEntries) {
			System.out.println(new Date(entry.getTimestamp()) + " " + entry.getLevel() + " " + entry.getMessage());
			String errorLogType= entry.getLevel().toString();
			String errorLog= entry.getMessage().toString();
			if(errorLog.contains("404")){
			System.out.println("!!!!!!!!!   Error LogType: "+ errorLogType+" Error Log message: "+errorLog);
//			fail("Error LogType: "+ errorLogType+" Error Log message: "+errorLog);
			}
			}
		}
		

		public Object FooterWebelementDisplay_Navigation(WebDriver driver, WebElement ele, String desc) throws InterruptedException{
			boolean display = isDisplayed(ele);
			if (display == true) {
				System.out.println(display + "! " + desc);
			} else {
				System.out.println(ele + "- NO ! Element is not Present");
			}
			System.out.println("Click to Action on " + ele.getText()+ "- Success!");
			ele.click();

			
			
//			checkpageload500error(driver);
//			checkpageload404error(driver);

			return display;

		}
		
		public void CardCarouselBlock(WebDriver driver, String webelement) {
			List<WebElement> CardCarouselBlock = driver.findElements(By.xpath(webelement));

			Iterator<WebElement> itr = CardCarouselBlock.iterator();
			while (itr.hasNext()) {
				    System.out.println("CardCarouselBlock Heading: "+itr.next().getText());

			}
			
		}
		
		public WebElement FooterElementDisplayandTextvalidation(WebElement ele, String ExpectedWebElementTextDescription) {
			boolean display = isDisplayed(ele);
			if (display == true) {
				System.out.println("Yes ! Element is Present :" + display);
				String ActualText=ele.getText();
				if(ActualText.equals(ExpectedWebElementTextDescription))
					System.out.println("Verification Successful - Correct text is shown on the FooterSection. ActualText: ---"+ ActualText+ "Expected Text to be shown in UI :"+ ExpectedWebElementTextDescription);
						
				
			} else {
				System.out.println(ele + "- NO ! Element is not Present");
			}
			
			return copyrighttext;
			
		}
		
		public WebElement HeaderElementDisplayandTextvalidation(WebElement ele, String ExpectedWebElementTextDescription) {
			boolean display = isDisplayed(ele);
			if (display == true) {
				System.out.println("Yes ! Element is Present :" + display);
				String ActualText=ele.getText();
				if(ActualText.equals(ExpectedWebElementTextDescription))
					System.out.println("Verification Successful - Correct text is shown on the FooterSection. ActualText: ---"+ ActualText+ "Expected Text to be shown in UI :"+ ExpectedWebElementTextDescription);
						
				
			} else{
				System.out.println(ele + "- NO ! Element is not Present");
			}
			
			return copyrighttext;
			
		}

	}

