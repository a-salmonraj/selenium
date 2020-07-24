package stepDefinations;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Newsletters{
	WebDriver driver;

	String name = "newsletter";
@When("^I click on Newsletters button in Menu$")
public void i_click_on_Newsletters_button_in_Menu() throws Throwable {
	driver.findElement(By.xpath("//span[contains(text(),'Newsletters')]")).click();
	Thread.sleep(10000);
    
    
}

@Then("^I should see newsletters text in Url$")
public void i_should_see_newsletters_text_in_Url() throws Throwable {
	if(driver.getCurrentUrl().contains("newsletters"))
	{
		System.out.println("Newsletter is Successful");
	}else
	{
		System.out.println("Newsletter is Fail");
	}
   
    
    
}

@Then("^I click  Add Newsletter button$")
public void i_click_Add_Newsletter_button() throws Throwable {
	driver.findElement(By.xpath("//button[@class='btn btn-primary text-nowrap active']")).click();
	Thread.sleep(1000);
    
    
    
}

@Then("^I Click on Add custom$")
public void i_Click_on_Add_custom() throws Throwable {
	driver.findElement(By.xpath("//button[contains(text(),'Add custom')]")).click();
	Thread.sleep(1000);
    
    
    
}

@Then("^I Fill all the fields with valid data$")
public void i_Fill_all_the_fields_with_valid_data() throws Throwable {
	driver.findElement(By.xpath("//div[contains(@class,'hip-form')]//div//div[1]//fieldset[1]//div[1]//div[1]//input[1]")).sendKeys(name);
	driver.findElement(By.xpath("//div[contains(@class,'hip-form')]//div[2]//fieldset[1]//div[1]//div[1]//input[1]")).sendKeys("Sample");
    
    
}

//@Then("^I Edit the template using HTML or MJML editor$")
//public void i_Edit_the_template_using_HTML_or_MJML_editor() throws Throwable {  
//}

@Then("^I Click on Save button$")
public void i_Click_on_Save_button() throws Throwable {
	driver.findElement(By.xpath("//button[contains(text(),'submit')]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[contains(text(),'OK')]")).click();
	

	// skipping the HTML one
    
}

@Then("^I should see added customised Newsletter in Newsletter page$")
public boolean i_should_see_added_customised_Newsletter_in_Newsletter_page() throws Throwable {
	
	List<WebElement> ele = driver.findElements(By.xpath("//*[@class='mb-0  text-capitalize text-capitalize text-truncate']"));
	for (WebElement webElement : ele) {
		if (webElement.getText().contains(name)) {
			return true;
		}
	}
	return false;
    
    
}



}
