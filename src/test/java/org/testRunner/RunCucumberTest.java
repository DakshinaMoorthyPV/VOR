package org.testRunner;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;

@CucumberOptions(
		features= {"src/test/resources/beazleyDashboardPageFeatures/"},  // Path to your feature files
        glue = "org.stepDefinitions", // Path to your step definition files
        plugin = {"pretty", "html:target/cucumber-reports.html"} // Plugins for reporting, etc.
)
public class RunCucumberTest extends AbstractTestNGCucumberTests {

    @Override
    @DataProvider(parallel = false)  // Set to 'true' if you want to run scenarios in parallel
    public Object[][] scenarios() {
        return super.scenarios();
    }
}