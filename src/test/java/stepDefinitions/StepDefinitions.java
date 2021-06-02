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
	RandomString Rstring = new RandomString();
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
	public void i_register_my_lar2_lars_com() {

		WebElement searchBox = driver.findElement(By.name("email"));
		searchBox.sendKeys(random + "@larz.com");

	}

	@And("I create a Lasse999")
	public void i_create_a_lasses999() {

		WebElement searchBox1 = driver.findElement(By.name("username"));
		searchBox1.sendKeys("Lasses999" + random);

	}

	@And("I Create a Larsipan2! and press sign up")
	public void i_create_a_larsipan2_and_press_sign_up() {

		WebElement searchBox11 = driver.findElement(By.name("password"));
		searchBox11.sendKeys("Larsipan244!");
		searchBox11.submit();
		
		WebElement ReEnter = driver.findElement(By.className("signup-wrap"));
		boolean ReEnterDisplayed = ReEnter.isDisplayed();
		assertEquals(true, ReEnterDisplayed);

	}

	@When("I register my hars@lars.com")
	public void i_register_my_hars_lars_com() {

		WebElement searchBox = driver.findElement(By.name("email"));
		searchBox.sendKeys("hars@lars.com");

	}

	@When("I create a Hasse666")
	public void i_create_a_hasse686() {

		WebElement searchBox1 = driver.findElement(By.name("username"));
		searchBox1.sendKeys("Hasse686");

	}

	@When("I Create a Larsipan1! and press sign up")
	public void i_create_a_larsipan1_and_press_sign_up() {

		WebElement searchBox11 = driver.findElement(By.name("password"));
		searchBox11.sendKeys("Larsipan1!");
		searchBox11.submit();

	}

	@Then("I validate that i is re-directed to the confirmation page")
	public void i_validate_that_i_is_re_directed_to_the_confirmation_page() {

		WebElement ReEnter = driver.findElement(By.className("invalid-error"));
		boolean ReEnterDisplayed = ReEnter.isDisplayed();
		assertEquals(true, ReEnterDisplayed);

	}
	
		@When("I register my lazz@lars.com")
		public void i_register_my_lazz_lars_com() {
			
			WebElement searchBox = driver.findElement(By.name("email"));
			searchBox.sendKeys(random+"@lars.com");
		   
		}

		@When("I create a ")
		public void i_create_a() {
			
			WebElement searchBox1 = driver.findElement(By.name("username"));
			searchBox1.sendKeys("lars"+Rstring+Rstring+Rstring+Rstring+Rstring);
		    
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


			@When("I create a Lasse656")
			public void i_create_a_lasse656() {
				
				WebElement searchBox1 = driver.findElement(By.name("username"));
				searchBox1.sendKeys("Passe" + random);
			    
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
