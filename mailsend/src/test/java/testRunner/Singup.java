package testRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

 
@RunWith(Cucumber.class)
@CucumberOptions(
		features= {"FeatureFiles"}, 
		tags={"@singupinsingledata"}, 
		monochrome=true, 
		glue= {"stepDefinations"},
		plugin = {"com.cucumber.listener.ExtentCucumberFormatter:Reports/Signup.html",
		"pretty", "html:target/cucumber-reports"})


public class Singup{

}
