package testRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features= {"FeatureFiles"}, 
		tags={"@DashboardView"}, 
		monochrome=true, 
		glue= {"stepDefinations"},
		plugin = {"com.cucumber.listener.ExtentCucumberFormatter:Reports/Dashboard.html",
		"pretty", "html:target/cucumber-reports"})
public class Dashboard {

}
