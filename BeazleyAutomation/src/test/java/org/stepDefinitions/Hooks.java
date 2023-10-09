package org.stepDefinitions;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.generics.Base;
import org.generics.FWUtils;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.LogStatus;

import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.Scenario;
import io.cucumber.java.Status;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Hooks extends Base {
	
	@BeforeAll
	public static void extentReportsInitialization() {
		String dateName = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
		extentReports = new ExtentReports(System.getProperty("user.dir")+"/reporter/Report "+dateName+".html",false);
	}

	@Before(order = 0)
	public static void setup() throws IOException {
		try {
			prop = new Properties();
			fis = new FileInputStream(System.getProperty("user.dir")+"/src/test/resources/data.properties");
			prop.load(fis);
			String browser = prop.getProperty("browser");
			if(browser.equals("chrome"))
			{
				String getChromeExecutablePath =null;
				 
	            	getChromeExecutablePath= "C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe";
				   WebDriverManager.chromedriver().setup();
				   ChromeOptions chromeOptions = new ChromeOptions();
			        chromeOptions.setBinary(getChromeExecutablePath); // Replace with the actual path to Chrome if needed

			        // Create a WebDriver instance using ChromeDriver with options
			         driver = new ChromeDriver(chromeOptions);
			        // Create a WebDriver instance using ChromeDriver
			}
			else 
			{
				WebDriverManager.firefoxdriver().setup();

		        // Configure Firefox options (if needed)
		        FirefoxOptions firefoxOptions = new FirefoxOptions();
		        String userHome = System.getProperty("user.home");
		        String firefoxPath = userHome + "\\AppData\\Local\\Mozilla Firefox\\firefox.exe";
		        
		        firefoxOptions.setBinary(firefoxPath);
		        // Create a WebDriver instance using FirefoxDriver with options
		         driver = new FirefoxDriver(firefoxOptions);

		        // Your Selenium code here
			}
			driver.manage().timeouts().implicitlyWait(ITO,TimeUnit.SECONDS);
			driver.manage().window().maximize();
		} catch (Exception e) {
			e.printStackTrace();
		}
	
	}
	
	@Before(order=1)
	public static void openApplication()
	{
		String url = prop.getProperty("UATBeazleyURL");
		driver.get(url);
	}
	
	@After(order=1)
	public static void takesScreenShot(Scenario scenario) throws IOException, InterruptedException {
		if(scenario.getStatus()==Status.FAILED)
		{
			extentTest.log(LogStatus.FAIL,"Test case failed is-->"+scenario.getName());
			FWUtils.takesScreenShot(driver,scenario.getName());
			extentTest.log(LogStatus.FAIL,extentTest.addScreenCapture(FWUtils.takesScreenShot(driver,photoPath)));
		}
		else if(scenario.getStatus()==Status.SKIPPED)
		{
			extentTest.log(LogStatus.SKIP,"Test case skipped is-->"+scenario.getName());
		}
		else if(scenario.getStatus()==Status.PASSED)
		{
			extentTest.log(LogStatus.PASS,"Test case passed is-->"+scenario.getName());
			FWUtils.takesScreenShot(driver,scenario.getName());
			extentTest.log(LogStatus.PASS,extentTest.addScreenCapture(FWUtils.takesScreenShot(driver,photoPath)));
		}
//		scenario.attach(FWUtils.getScreenShotByte(driver),"image/png",scenario.getName());
//		extentTest.fail("details", MediaEntityBuilder.createScreenCaptureFromPath(FWUtils.takesScreenShot(driver)).build());
//		extentTest.log(Status.FAIL,"Test case failed");
	}
	
	@After(order=0)
	public static void tearDown() {
		driver.close();
		extentReports.endTest(extentTest);
	}

	@AfterAll
	public static void endReport() {
		extentReports.flush();
		extentReports.close();
	}
	
}
