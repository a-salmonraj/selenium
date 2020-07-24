package testRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features= {"FeatureFiles"}, 
		tags={"@NewsLetters"}, 
		monochrome=true, 
		glue= {"stepDefinations"},
		plugin = {"com.cucumber.listener.ExtentCucumberFormatter:Reports/Newsletters.html",
		"pretty", "html:target/cucumber-reports"})

public class Newsletters {

}
