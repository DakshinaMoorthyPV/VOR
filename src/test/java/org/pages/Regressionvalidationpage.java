package org.pages;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.generics.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.logging.LogEntries;
import org.openqa.selenium.logging.LogEntry;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.stepDefinitions.Testing_the_feature_for_card_carousel_block_page;
import org.testng.Assert;

import com.relevantcodes.extentreports.LogStatus;

public class Regressionvalidationpage extends Base{
	private static Logger logger = LogManager.getLogger(Regressionvalidationpage.class);
				
		@FindBy(xpath = "//h2[@class='font-headline text-s-h3 text-amethyst-base']")
		private WebElement formBlockHeading;
		
		@FindBy(xpath = "//h2[text()='Error 404']")
		private WebElement Error404;
		
		@FindBy(xpath = "//span[@data-testid='contentListingFilterSelectedOptions']//span")
		private WebElement listingfilter;
		
		
		@FindBy(xpath = "//section[@data-testid='eventInformation']")
		private WebElement eventinformation;
		
		@FindBy(xpath = "//div[@class='block genericheroblockmodel']")
		private WebElement genericheroblock;
		
		
		
		
		
		
		
		
		

		
		@FindBy(xpath = "//p[@data-testid='formBlockDescription'] ")
		private WebElement formBlockDescription;
		
		@FindBy(xpath = "//a[@data-testid='formBlockLink']")
		private WebElement formBlockLink;
		
		@FindBy(xpath = "//div[@class='custom-scrollbar w-full overflow-x-auto pb-1 max-md:hidden']//li[@aria-current='true']")
		private WebElement formprogressstep;
		
		@FindBy(xpath = "//label[@data-testid='formFieldYesNoListItemLabel-0']")
		private WebElement yesradiobutton;
		
		@FindBy(xpath = "//label[@data-testid='formFieldYesNoListItemLabel-1']")
		private WebElement Noradiobutton;
		
		@FindBy(xpath = "//span[text()='Anti-phishing training from KnowB4']")
		private WebElement serviceformantiphishing;
		
		@FindBy(xpath = "//button[@data-testid='formActionNextButton']//span")
		private WebElement nextbutton;
		
		@FindBy(xpath = "//span[@data-testid='formFieldError']")
		private WebElement formfielderror;
		
		@FindBy(xpath = "//input[@id='nameOfOrganization']")
		private WebElement nameoforganization;
		
		@FindBy(xpath = "//input[@id='policyReference']")
		private WebElement policyreference;
		
		@FindBy(xpath = "//select[@id='country']")
		private WebElement country;
		
		
		@FindBy(xpath = "//input[@id='nameOfBrokerage']")
		private WebElement nameofBrokerage;
		@FindBy(xpath = "//input[@id='name']")
		private WebElement name;
		@FindBy(xpath = "//input[@id='email']")
		private WebElement email;
		@FindBy(xpath = "//input[@id='phoneNumber']")
		private WebElement phonenumber;
		@FindBy(xpath = "//input[@id='privacyPolicy']")
		private WebElement privacypolicy;
		@FindBy(xpath = "//h3[@data-testid='thankYouCardTitle']")
		private WebElement thankyoucardtitle;		
		

		public Regressionvalidationpage(WebDriver driver) {
			PageFactory.initElements(driver, this);
		}
		
		public boolean isDisplayed(WebElement UIelement) {
			return UIelement.isDisplayed();
		}
		
		public boolean isTextMatched(WebElement UIelement, String Expected) {
			Boolean verifytext = null;
			try {
				Thread.sleep(100);
				verifytext = UIelement.getText().equalsIgnoreCase(Expected);
				System.out.println("verifytext  "+UIelement.getText()+":  "+verifytext);
				System.out.println("actual text: "+UIelement.getText());
				System.out.println("actual text: "+Expected);
				
				Assert.assertTrue(verifytext);
				extentTest.log(LogStatus.PASS,"The expected content displayed in page : '"+Expected+"'"  );
			} catch (InterruptedException e) {
				e.printStackTrace();
				extentTest.log(LogStatus.FAIL,"The expected content not displayed in page : '"+Expected+"'" );
			}
			return verifytext.booleanValue();

		}
		
		public void ServiceQuestion(WebDriver driver, String question, boolean YesorNo) throws InterruptedException {
			
			ScrollToobject(driver, "300,300");
			String Q = question;
			switch(Q){
			
			case "Do you know which cyber security prevention services you want to access?": 
				
				if(driver.findElement(By.xpath("//legend[@data-testid='formSectionTitle']//span[text()='"+question+"']")).isDisplayed()){
					if(YesorNo==true) {
						yesradiobutton.click();
						serviceformantiphishing.click();
						if(Noradiobutton.isEnabled()==false)
							System.out.println("Filled service Form - Anti-phishing training from KnowB4 Enabled - no option disappered.");						
						
						System.out.println("Filled service Form for 1st question");
						extentTest.log(LogStatus.PASS,"Filled service Form for 1st question");
					}else {
						Noradiobutton.click();
						System.out.println("Filled service Form - Anti-phishing training from KnowB4 Disabled - no option clicked.");
						extentTest.log(LogStatus.PASS,"Filled service Form - Anti-phishing training from KnowB4 Disabled - no option clicked.");
					}
					
//					nextbutton.click();
				}else {
					System.out.println("Filled service Form - first question not displayed");	
					extentTest.log(LogStatus.FAIL,"Filled service Form - first question not displayed");
				}
				break;
				
			case "Does the policy holder have a Beazley Cyber policy?": 
				Thread.sleep(500);
				if(driver.findElement(By.xpath("//legend[@data-testid='formSectionTitle']//span[text()='"+question+"']")).isDisplayed()){
					if(YesorNo==true) {
						Noradiobutton.click();
						nextbutton.click();
						if (formfielderror.isDisplayed()==true)
							System.out.println("Filled service Form - 'Unfortunately these services are only available to customers who hold a Cyber policy. Please confirm your organisation hold a Beazley Cyber policy- Error message displayed.");
						
						yesradiobutton.click();
						nextbutton.click();
						if (formfielderror.isDisplayed()==true)
							System.out.println("Filled service Form - 'Unfortunately these services are only available to customers who hold a Cyber policy. Please confirm your organisation hold a Beazley Cyber policy- Error message displayed.");			
					
						nameoforganization.sendKeys("Beazley");
						policyreference.sendKeys("polic12");						
						Select select = new Select(driver.findElement(By.xpath("//select[@id='country']")));
						select.selectByVisibleText("United Kingdom");
						nextbutton.click();				
						
						System.out.println("Filled service Form for 2nd question");
						extentTest.log(LogStatus.PASS,"Filled service Form for 2nd question");
					}
				}else {
					System.out.println("Filled service Form - second question not displayed");	
					extentTest.log(LogStatus.FAIL,"Filled service Form - second question not displayed");
				}
			break;
			
			case "Please provide your contact details so that we can reach you to discuss*":
				
				Thread.sleep(500);
				if(driver.findElement(By.xpath("//legend[@data-testid='formSectionTitle']//span[text()='"+question+"']")).isDisplayed()){
					
					nextbutton.click();	
					
					if (formfielderror.isDisplayed()==true)
//						System.out.println("Filled service Form - 'This feild is required' - Error message displayed.");
					    extentTest.log(LogStatus.FAIL,"Filled service Form - 'This feild is required' - Error message displayed.");
					
					isTextMatched(formfielderror,"This feild is required");
					
					nameofBrokerage.sendKeys("Brokerage name");
					name.sendKeys("Name");
					email.sendKeys("Beazley@abc.com");
					phonenumber.sendKeys("99002342342");
					ScrollToobject(driver, "300,300");
					privacypolicy.click();
					
					nextbutton.click();	
					
					isDisplayed(thankyoucardtitle);
					
				}else {
					System.out.println("Filled service Form - thrid question not displayed");	
				}	
				
				break;
				
			case "Please provide your contact details so that we can reach you *":
				
				Thread.sleep(500);
				if(driver.findElement(By.xpath("//legend[@data-testid='formSectionTitle']//span[text()='"+question+"']")).isDisplayed()){
					
					JavascriptExecutor js = (JavascriptExecutor) driver;
					js.executeScript("window.scrollBy(200,200)", "");
					Thread.sleep(500);
					
					nextbutton.click();	
					
					if (formfielderror.isDisplayed()==true)
						System.out.println("Filled service Form - 'This feild is required' - Error message displayed.");
					
					isTextMatched(formfielderror,"This feild is required");
					
					nameofBrokerage.sendKeys("Brokerage name");
					name.sendKeys("Name");
					email.sendKeys("Beazley@abc.com");
					phonenumber.sendKeys("99002342342");
					ScrollToobject(driver, "300,300");
					
					nextbutton.click();	
					
					isDisplayed(thankyoucardtitle);
					
				}else {
					System.out.println("Filled service Form - 'Please provide your contact details so that we can reach you *' not displayed");	
				}	
				
				break;
				
			case "What would you like to talk to us about or give feedback on? *":
				
				Thread.sleep(500);
				if(driver.findElement(By.xpath("//legend[@data-testid='formSectionTitle']//span[text()='"+question+"']")).isDisplayed()){
					//div//textarea[@id='feedback']
					ScrollToobject(driver, "300,300");
					privacypolicy.click();
					
					nextbutton.click();	
					
					if (formfielderror.isDisplayed()==true)
						System.out.println("Filled service Form - 'This feild is required' - Error message displayed.");
					
				}else {
					System.out.println("Filled service Form - 'What would you like to talk to us about or give feedback on? *' not displayed");	
				}	
				
				break;
				
			default :
				String validateQuestion= "In valid - question";
				System.out.println(validateQuestion);
			}
			System.out.println("verify the question is correct? " +Q);		
			
		}



		public boolean brokercontactformclientservicesisDisplayed(WebDriver driver) throws InterruptedException {
			
			boolean servicedisplay = isDisplayed(formBlockHeading)== true && isDisplayed(formBlockDescription)== true  &&  isDisplayed(formBlockLink)== true  && isDisplayed(formprogressstep)== true;
			
			
			if (servicedisplay == true)
				System.out.println("Form Heading, Description, Link & servcie progress is displayed.");
			
			Thread.sleep(500);
			
//			isTextMatched(formBlockHeading,"Contact us for client access to third party cyber services.");
			isTextMatched(formBlockDescription,"Need to contact us about something else?");
			isTextMatched(formBlockLink,"Choose another contact option");
			isTextMatched(formBlockHeading,"Contact us for client access to third party cyber services.");
			
			System.out.println("Form Heanding, Description & link text are displayed as exepected.");
			
			
			ServiceQuestion(driver, "Do you know which cyber security prevention services you want to access?", true);
			
//			ServiceQuestion(driver, "Does the policy holder have a Beazley Cyber policy?", true);		
			
//			ServiceQuestion(driver, "Please provide your contact details so that we can reach you to discuss*", true);
		
			return servicedisplay;
		}

		
		public boolean brokercontactformgeneralfeedback(WebDriver driver) throws InterruptedException {
			
			boolean servicedisplay = isDisplayed(formBlockHeading)== true && isDisplayed(formBlockDescription)== true  &&  isDisplayed(formBlockLink)== true  && isDisplayed(formprogressstep)== true;
			
			
			if (servicedisplay == true)
				System.out.println("Form Heading, Description, Link & servcie progress is displayed.");
			
			Thread.sleep(500);
			
//			isTextMatched(formBlockHeading,"Contact us for client access to third party cyber services.");
			isTextMatched(formBlockDescription,"Need to contact us about something else?");
			isTextMatched(formBlockLink,"Choose another contact option");
			isTextMatched(formBlockHeading,"Ask us about something else / give us feedback");
			
			System.out.println("Form Heanding, Description & link text are displayed as exepected.");
			
			
			ServiceQuestion(driver, "Please provide your contact details so that we can reach you *", true);
			
//			ServiceQuestion(driver, "What would you like to talk to us about or give feedback on? *", true);		
			
//			ServiceQuestion(driver, "Please provide your contact details so that we can reach you to discuss*", true);
		
			return servicedisplay;
		}
		
		public boolean customercontactform() {
			return isTextMatched(Error404,"Error 404");
		}
		
		public boolean customer_form_cyberaccess_3rd_party(WebDriver driver) throws InterruptedException {
			
			boolean servicedisplay = isDisplayed(formBlockHeading)== true && isDisplayed(formBlockDescription)== true  &&  isDisplayed(formBlockLink)== true  && isDisplayed(formprogressstep)== true;
			
			
			if (servicedisplay == true)
				System.out.println("Form Heading, Description, Link & servcie progress is displayed.");
			
			Thread.sleep(500);
			
			isTextMatched(formBlockDescription,"Need to contact us about something else?");
			isTextMatched(formBlockLink,"Choose another contact option");
			isTextMatched(formBlockHeading,"Enquire about becoming a Beazley Broker");
			
			System.out.println("Form Heanding, Description & link text are displayed as exepected.");
			extentTest.log(LogStatus.PASS,"Form Heanding, Description & link text are displayed as exepected.");
			
			
			ServiceQuestion(driver, "Do you know which cyber security prevention services you want to access?", true);
			
		
			return servicedisplay;
		}
		


		public void ScrollToobject(WebDriver driver, String viewport) throws InterruptedException {
			Thread.sleep(5000);
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy("+viewport+")", "");
			Thread.sleep(1000);
		}
		
		public void filterlisting(WebDriver driver, String Expected) {
			
			if(isDisplayed(listingfilter))
//				System.out.println("Content listing filter selected options are displayed");
			 extentTest.log(LogStatus.PASS,"Content listing filter selected options are displayed");
			
			List<WebElement> filter = driver.findElements(By.xpath("//span[@data-testid='contentListingFilterSelectedOptions']"));
			for (WebElement element : filter){
                if(element.getText().contains(Expected)) {
        			System.out.println("Document Listing page contains the filter: "+Expected);
        			logger.info("Document Listing page contains the filter: "+Expected);
        			extentTest.log(LogStatus.PASS,"Document Listing page contains the filter: "+Expected);
                }
            }
			
		}
		
		
		public void eventinformation(WebDriver driver, String Expected) {
			
			if(isDisplayed(eventinformation))
				System.out.println("Event Information is displayed");
			
			List<WebElement> event = driver.findElements(By.xpath("//section[@data-testid='eventInformation']//p"));
			for (WebElement element : event){
                if(element.getText().contains(Expected)) {
        			System.out.println("Event Page contain the information about : "+Expected);
        			logger.info("Event Page contain the information about : "+Expected);
        			extentTest.log(LogStatus.PASS,"Event Page contain the information about :"+Expected);
                }
            }
			
		}
		
public void genericheroblock(WebDriver driver, String Expected) {
			
			if(isDisplayed(genericheroblock))
				System.out.println("Generic Hero Blocks are displayed");
			
			List<WebElement> heroblock = driver.findElements(By.xpath("//div[@class='block genericheroblockmodel']//div//div//h1"));
			for (WebElement element : heroblock){
                if(element.getText().contains(Expected)) {
        			System.out.println("Generic Hero Block contain the model: "+Expected);
        			logger.info("Generic Hero Block contain the model : "+Expected);
        			extentTest.log(LogStatus.PASS,"Generic Hero Block contain the model : "+Expected);
                }
            }
			
		}
		
	

	}

