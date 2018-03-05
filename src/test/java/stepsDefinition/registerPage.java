package stepsDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.But;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class registerPage {
	static WebDriver driver;
	@Given("^I go to facebook\\.com$")
	public void i_go_to_facebook_com() throws Throwable {
	   System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rayhan\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
	   driver=new ChromeDriver();
	   driver.get("http://www.facebook.com");
	}


@Then("^i enter valid \"([^\"]*)\" and \"([^\"]*)\"$")
public void i_enter_valid_and(String arg1, String arg2) throws Throwable {
	driver.findElement(By.xpath("//*[@id='email']")).sendKeys("ansrayhan");
   
}

@Then("^i forget to put correct password$")
public void i_forget_to_put_correct_password() throws Throwable {
   
}

	

}
