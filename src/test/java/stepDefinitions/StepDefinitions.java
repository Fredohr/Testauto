package stepDefinitions;

import static org.junit.Assert.assertEquals;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinitions {

	WebDriver driver;
	Random random = new Random(100);

	@Given("I want navigate to https:\\/\\/login.mailchimp.com\\/signup\\/")
	public void i_want_navigate_to_https_login_mailchimp_com_signup() {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\Downloads\\chromedriver_win32ny\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://login.mailchimp.com/signup/");

	}

	@When("I register my larz@lars.com")
	public void i_register_my_larz_lars_com() {

		WebElement searchBox = driver.findElement(By.name("email"));
		searchBox.sendKeys("larz@larz.com");

	}

	@And("I create a Lasse666")
	public void i_create_a_lasse366() {

		WebElement searchBox1 = driver.findElement(By.name("username"));
		searchBox1.sendKeys("Lasse366");

	}

	@And("I Create a Larsipan2! and press sign up")
	public void i_create_a_larsipan2_and_press_sign_up() {

		WebElement searchBox11 = driver.findElement(By.name("password"));
		searchBox11.sendKeys("Larsipan2!");
		searchBox11.submit();

	}
	

		@When("I register my hars@lars.com")
		public void i_register_my_hars_lars_com() {
			
			WebElement searchBox = driver.findElement(By.name("email"));
			searchBox.sendKeys("hars@lars.com");
		  
		}


		@When("I create a Hasse666")
		public void i_create_a_hasse666() {
			
			WebElement searchBox1 = driver.findElement(By.name("username"));
			searchBox1.sendKeys("Hasse676");
			
		}
		@When("I Create a Larsipan1! and press sign up")
		public void i_create_a_larsipan1_and_press_sign_up() {
		    
			WebElement searchBox11 = driver.findElement(By.name("password"));
			searchBox11.sendKeys("Larsipan2!");
			searchBox11.submit();

			
		}




	@Then("I validate that i is re-directed to the confirmation page")
	public void i_validate_that_i_is_re_directed_to_the_confirmation_page() {

		WebElement ReEnter = driver.findElement(
				By.className("signup-wrap"));
		boolean ReEnterDisplayed = ReEnter.isDisplayed();
		assertEquals(true, ReEnterDisplayed);

	}
	
}



