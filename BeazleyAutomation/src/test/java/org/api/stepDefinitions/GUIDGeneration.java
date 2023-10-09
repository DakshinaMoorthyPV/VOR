package org.api.stepDefinitions;

import org.generics.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GUIDGeneration extends Base {

	public static String generateGUID() {
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://guidgenerator.com/online-guid-generator.aspx");
		driver.findElement(By.xpath("//input[@name='btnGenerate']")).click();
		String text = driver.findElement(By.xpath("//textarea[@id='txtResults']")).getText();
		System.out.println(text);
		driver.close();
		return text;
	}

}