package org.testRunner;

import io.cucumber.testng.CucumberOptions;

import io.cucumber.testng.AbstractTestNGCucumberTests;

//@RunWith(Cucumber.class)

@CucumberOptions(

		features = "src/test/resources/Regression/",

		glue = { "org.stepDefinitions" },

//		plugin = { "pretty", "html:target/cucumber.json", "html:target/cucumber.html" }
		
		 plugin = { "pretty", "html:target/Reports/cucumber.html","json:target/Reports/cucumber.json" }

)

public class TestRunner extends AbstractTestNGCucumberTests {
	

}