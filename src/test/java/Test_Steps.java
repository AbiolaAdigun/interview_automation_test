import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Test_Steps {
	
	public WebDriver driver;
	
	@Given("^I am on the home page$")
	public void i_am_on_the_home_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to("https://next.farmdrop.com/");
		driver.manage().window().maximize();
	}

	@Given("^I click on signup or login button$")
	public void i_click_on_signup_or_login_button() throws Throwable {
		driver.findElement(By.xpath("//*[@id='homepage-wrapper']/div[1]/div/a/div[2]")).click();
	    
	}

	@When("^I clcik on Signup$")
	public void i_clcik_on_Signup() throws Throwable {
		driver.findElement(By.cssSelector("body > div.minimum-whole-viewport-height > div > div > div.session__container > div > div.text-center > a")).click();
	}

	@When("^I enter user email details$")
	public void i_enter_user_email_details() throws Throwable {
		driver.findElement(By.xpath("//*[@id='email']")).sendKeys("abiolaadigun@yahoo.co.uk");
	}

	@When("^I enter user password$")
	public void i_enter_user_password() throws Throwable {
		driver.findElement(By.id("password")).sendKeys("Password1");


	}
	@When("^I enter user postcode$")
	public void i_enter_user_postcode() throws Throwable {
		driver.findElement(By.id("zipcode")).sendKeys("DA14 4EW");
	}

	@When("^I click on Lets fix the food chain button$")
	public void i_click_on_Lets_fix_the_food_chain_button() throws Throwable {
		driver.findElement(By.xpath("//*[@id='email-signup-form-submit']")).click();
		
	}

	@Given("^I enter my email address$")
	public void i_enter_my_email_address() throws Throwable {
	   driver.findElement(By.id("email")).sendKeys("abiolaadigun04@yahoo.co.uk");
	   
	}

	@Given("^I enter my Password$")
	public void i_enter_my_Password() throws Throwable {
	    driver.findElement(By.id("password")).sendKeys("Password1");
	    
	}

	@When("^I click on Login button$")
	public void i_click_on_Login_button() throws Throwable {
	  driver.findElement(By.xpath("//*[@id='email-login-form-submit']")).click();
	}



}
