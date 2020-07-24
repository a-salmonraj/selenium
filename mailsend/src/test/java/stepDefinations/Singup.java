package stepDefinations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Singup {
	WebDriver driver;
	
	@When("^I open Signup Url in Chrome browser$")
	public void i_open_Signup_Url_in_Chrome_browser() throws Throwable {
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.get("https://portal.500apps.io/#/signup?app=beta");
		driver.manage().window().maximize();
		Thread.sleep(10000);

	 
	    
	}

	@When("^I enter Email ID$")
	public void i_enter_Email_ID() throws Throwable {
		driver.findElement(By.name("email")).sendKeys("Test@500.com");
		   
		
	 
	    
	}

	@When("^I click Get Started$")
	public void i_click_Get_Started() throws Throwable {
		driver.findElement(By.xpath("//button[contains(text(),'GET STARTED')]")).click();
	 
	    
	}

	@When("^I enter name$")
	public void i_enter_name() throws Throwable {
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Tester");
	 
	    
	}

	@When("^I enter company name$")
	public void i_enter_company_name() throws Throwable {
		driver.findElement(By.xpath("//input[@placeholder='Company']")).sendKeys("500apps");
	 
	    
	}

	@When("^I enter create password$")
	public void i_enter_create_password() throws Throwable {
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("Password123");

	 
	    
	}

	@When("^I Choose Industry$")
	public void i_Choose_Industry() throws Throwable {
		Select dropdown = new Select(driver.findElement(By.xpath("//*[@id=\"app\"]/div[2]/div/div[2]/div[2]/div[2]/div/form/div[4]/div/select"))); 
		dropdown.selectByVisibleText("Music");  
		dropdown.selectByIndex(94);
		
		
	 
	    
	}

	@When("^I choose Region$")
	public void i_choose_Region() throws Throwable {
		Select dropdown = new Select(driver.findElement(By.xpath("//*[@id=\"app\"]/div[2]/div/div[2]/div[2]/div[2]/div/form/div[5]/div/select")));  
		dropdown.selectByVisibleText("US-1");
//		dropdown.selectByIndex(us1);
		
	 
	    
	}

	@When("^I enter mobile number$")
	public void i_enter_mobile_number() throws Throwable {
		driver.findElement(By.xpath("//input[@placeholder='Enter the phone number']")).sendKeys("9876543210");

	 
	    
	}

	@When("^I click on Save and continue button$")
	public void i_click_on_Save_and_continue_button() throws Throwable {
		driver.findElement(By.xpath("//button[contains(text(),'SAVE AND CONTINUE')]")).click();

	   
	}

	@Then("^I should see home text in Url$")
	public void i_should_see_home_text_in_Url() throws Throwable {
		if(driver.getCurrentUrl().contains("home"))
		{
			System.out.println("Signup Successful");
		}else
		{
			System.out.println("Signup Fail");
		}
	 
	
	}

	@When("^I Close home page browser$")
	public void i_Close_home_page_browser() throws Throwable {
		driver.close();
	}



}
