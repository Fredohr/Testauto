package stepDefinitions;

import static org.junit.Assert.assertEquals;

import java.util.Random;
import java.lang.Math;


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
	RandmString Rstrings= new RandmString();
	Random rand = new Random(100);
	double randnr = Math.random();

	
	@Given("I want navigate to https:\\/\\/login.mailchimp.com\\/signup\\/")
	public void i_want_navigate_to_https_login_mailchimp_com_signup() {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\Downloads\\chromedriver_win32ny\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://login.mailchimp.com/signup/");

	}

	@When("I register my lars23@larz.com")
	public void i_register_my_lars23_larz_com() {

		WebElement searchBox = driver.findElement(By.name("email"));
		searchBox.sendKeys("lars23@larz.com");

	}

	@And("I create a Lasses879")
	public void i_create_a_Lasses879() {

		WebElement searchBox1 = driver.findElement(By.name("username"));
		searchBox1.sendKeys("Lasses879");

	}

	@And("I Create a Larsipan2! and press sign up")
	public void i_create_a_larsipan2_and_press_sign_up() {

		WebElement searchBox11 = driver.findElement(By.name("password"));
		searchBox11.sendKeys("Larsipan2!");
		searchBox11.submit();
		
		WebElement ReEnter = driver.findElement(By.className("invalid-error"));
		boolean ReEnterDisplayed = ReEnter.isDisplayed();
		assertEquals(true, ReEnterDisplayed);

	}

	@When("I register my hars@lars.com")
	public void i_register_my_hars_lars_com() {

		WebElement searchBox = driver.findElement(By.name("email"));
		searchBox.sendKeys("hars@lars.com");

	}

	@When("I create a Hasse686")
	public void i_create_a_hasse686() {

		WebElement searchBox1 = driver.findElement(By.name("username"));
		searchBox1.sendKeys("Hasse686" + Rstrings);

	}

	@When("I Create a Larsipan1! and press sign up")
	public void i_create_a_larsipan1_and_press_sign_up() {

		WebElement searchBox11 = driver.findElement(By.name("password"));
		searchBox11.sendKeys("Larsipan1!");
		searchBox11.submit();

	}

	@Then("I validate that i is re-directed to the confirmation page")
	public void i_validate_that_i_is_re_directed_to_the_confirmation_page() {

		WebElement ReEnter = driver.findElement(By.className("signup-wrap"));
		boolean ReEnterDisplayed = ReEnter.isDisplayed();
		assertEquals(true, ReEnterDisplayed);

	}
	
		@When("I register my lasz@lars.com")
		public void i_register_my_lasz_lars_com() {
			
			WebElement searchBox = driver.findElement(By.name("email"));
			searchBox.sendKeys("lasz@lars.com");
		   
		}

		@When("I create a ")
		public void i_create_a() {
			
			WebElement searchBox1 = driver.findElement(By.name("username"));
			searchBox1.sendKeys("lars"+Rstrings+Rstrings+Rstrings+Rstrings+Rstrings);
		    
		}
		@When("I Create a Larsipan3! and press sign up")
		public void i_create_a_larsipan3_and_press_sign_up() {
			
			WebElement searchBox11 = driver.findElement(By.name("password"));
			searchBox11.sendKeys("Larsipan3!");
			searchBox11.submit();
		   
			
			WebElement ReEnter = driver.findElement(By.className("invalid-error"));
			boolean ReEnterDisplayed = ReEnter.isDisplayed();
			assertEquals(true, ReEnterDisplayed);
		}

		
			@When("I register my ")
			public void i_register_my() {
			    
			}


			@When("I create a Lasse365")
			public void i_create_a_lasse365() {
				
				WebElement searchBox1 = driver.findElement(By.name("username"));
				searchBox1.sendKeys("Lasse365" + rand);
			    
			}
			@When("I Create a Larsipan4! and press sign up")
			public void i_create_a_larsipan4_and_press_sign_up() {
				
				WebElement searchBox11 = driver.findElement(By.name("password"));
				searchBox11.sendKeys("Larsipan4!");
				searchBox11.submit();
				
				WebElement ReEnter = driver.findElement(By.className("c-entryShellContainer"));
				boolean ReEnterDisplayed = ReEnter.isDisplayed();
				assertEquals(true, ReEnterDisplayed);
				
				
			}





}
