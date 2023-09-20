package org.testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features= {"src/test/resources/beazleyResetPasswordPageFeatures/"},
glue={"org.stepDefinitions"}, tags= "@beazley", plugin = {"pretty", 
		"html:target/Reports/cucumber.html",
		"json:target/Reports/cucumber.json"
},publish = true,monochrome=true)
public class RunnerTest{
	
}
