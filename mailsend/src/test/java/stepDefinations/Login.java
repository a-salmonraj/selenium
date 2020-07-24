package stepDefinations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Login {
	WebDriver driver;
	
@When("^I open Url in Chrome browser$")
public void i_open_Url_in_Chrome_browser() throws Throwable {
	driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	driver.get("https://portal.500apps.io/#/login?app=beta");
	driver.manage().window().maximize();
	Thread.sleep(10000);
 
}

@When("^I enter UserName$")
public void i_enter_UserName() throws Throwable {
	driver.findElement(By.name("email")).sendKeys("mantra.qa12@gmail.com");
   
}

@When("^I enter Password$")
public void i_enter_Password() throws Throwable {
	driver.findElement(By.name("password")).sendKeys("mantra123");
    
}

@When("^I click on Login button$")
public void i_click_on_Login_button() throws Throwable {
	driver.findElement(By.xpath("//button[@class='btn w-100 submit-button mt-4 btn-primary py-3']")).click();
	Thread.sleep(10000);
    
}

@Then("^I should see Dashboard text in Url$")
public void i_should_see_Dashboard_text_in_Url() throws Throwable {
	if(driver.getCurrentUrl().contains("dashboard"))
	{
		System.out.println("Login Successful");
	}else
	{
		System.out.println("Login Fail");
	}
   
}

@When("^I close browser$")
public void i_close_browser() throws Throwable {
   driver.close();



}
}
