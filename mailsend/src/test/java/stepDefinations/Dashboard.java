package stepDefinations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class Dashboard {
	WebDriver driver;
	@When("^I open mailsend Url in Chrome browser$")
	public void i_open_mailsend_Url_in_Chrome_browser() throws Throwable {
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.get("https://portal.500apps.io/#/login?app=beta");
		driver.manage().window().maximize();
		Thread.sleep(10000);
	  
	    
	}

	@When("^I enter UserName in username$")
	public void i_enter_UserName_in_username() throws Throwable {
		driver.findElement(By.name("email")).sendKeys("mantra.qa12@gmail.com");
	   
	    
	}

	@When("^I enter Password in password$")
	public void i_enter_Password_in_password() throws Throwable {
		driver.findElement(By.name("password")).sendKeys("mantra123");
	  
	}

	@When("^I click on Login button in login$")
	public void i_click_on_Login_button_in_login() throws Throwable {
		driver.findElement(By.xpath("//button[@class='btn w-100 submit-button mt-4 btn-primary py-3']")).click();
		Thread.sleep(10000);
	    
	  
	}

	@Then("^I should see Home text in Url at Global Home$")
	public void i_should_see_Home_text_in_Url_at_Global_Home() throws Throwable {
		if(driver.getCurrentUrl().contains("Home"))
		{
			System.out.println("Home is Successful");
		}else
		{
			System.out.println("Home is Fail");
		}
	   
	  
	}

	@Then("^I Click mailsend$")
	public void i_Click_mailsend() throws Throwable {
		driver.findElement(By.xpath("//h5[contains(text(),'Mailsend')]")).click();
		Thread.sleep(10000);
	   	}

	@Then("^I click try button$")
	public void i_click_try_button() throws Throwable {
		driver.findElement(By.xpath("//button[contains(text(),'Try')]")).click();
		Thread.sleep(10000);
	 
	}

	@Then("^I should see Dashboard Header at Dashboard Url$")
	public void i_should_see_Dashboard_Header_at_Dashboard_Url() throws Throwable {
		if(driver.getCurrentUrl().contains("Dashboard"))
		{
			System.out.println("Dashboard is Successful");
		}else
		{
			System.out.println("Dashboard is Fail");
		}
	   
	}



}
