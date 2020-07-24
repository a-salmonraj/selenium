package testRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@RunWith(Cucumber.class)
@CucumberOptions(
		features= {"FeatureFiles"}, 
		tags={"@loginwithmultipledata"}, 
		monochrome=true, 
		glue= {"stepDefinations"},
		plugin = {"com.cucumber.listener.ExtentCucumberFormatter:Reports/Loginmulti.html",
		"pretty", "html:target/cucumber-reports"})




public class Login2 extends AbstractTestNGCucumberTests{

}
