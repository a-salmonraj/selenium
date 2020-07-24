package stepDefinations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Login2 {
	WebDriver driver;
	String url="https://portal.500apps.io/#/login?app=beta";
	

@When("^I open Url in \"([^\"]*)\"$")
public void i_open_Url_in(String brw) throws Throwable {
	if(brw.equalsIgnoreCase("Chrome"))
	{
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(180, TimeUnit.SECONDS);
		driver.get(url);
		driver.manage().window().maximize();
	}
	else if(brw.equalsIgnoreCase("Firefox"))
	{
		driver=new FirefoxDriver();
		driver.get(url);
		
		
	}
	else
	{
		System.out.println("Browser value is not matching");
	}
   
}

@When("^I enter \"([^\"]*)\" in username$")
public void i_enter_in_username(String username) throws Throwable {
	driver.findElement(By.name("email")).sendKeys(username);
   
}

@When("^I enter \"([^\"]*)\" in password$")
public void i_enter_in_password(String password) throws Throwable {
	driver.findElement(By.name("password")).sendKeys(password);
    
}

@When("^I Click on Login$")
public void i_Click_on_Login() throws Throwable {
	driver.findElement(By.xpath("//button[@class='btn w-100 submit-button mt-4 btn-primary py-3']")).click();
	Thread.sleep(10000);
    
  
}

@Then("^Verify Dashboard text in Url$")
public void verify_Dashboard_text_in_Url() throws Throwable {
	if(driver.getCurrentUrl().contains("dashboard"))
	{
		System.out.println("Login Successful");
	}else
	{
		System.out.println("Login Fail");
	}
 
  
}

@When("^Close browser$")
public void close_browser() throws Throwable {
	 driver.close();
    
}



}
