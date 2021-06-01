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

	WebDriver driver = new ChromeDriver();
	Random random = new Random(100);

	@Given("I want navigate to https:\\/\\/login.mailchimp.com\\/signup\\/")
	public void i_want_navigate_to_https_login_mailchimp_com_signup() {

		driver.manage().window().maximize();
		driver.get("https://login.mailchimp.com/signup/");

		throw new io.cucumber.java.PendingException();
	}

	@When("I register my lars@lars.com")
	public void i_register_my_lars_lars_com() {

		WebElement searchBox = driver.findElement(By.name("email"));
		searchBox.sendKeys("lars@lars.com");

		throw new io.cucumber.java.PendingException();
	}

	@When("I create a Lasse666")
	public void i_create_a_lasse666() {

		WebElement searchBox1 = driver.findElement(By.name("username"));
		searchBox1.sendKeys("Lasse666");

		throw new io.cucumber.java.PendingException();
	}

	@When("I Create a Larsipan1! and press sign up")
	public void i_create_a_larsipan1_and_press_sign_up() {

		WebElement searchBox11 = driver.findElement(By.name("password"));
		searchBox11.sendKeys("Larsipan1!");

		throw new io.cucumber.java.PendingException();
	}

	@Then("I validate that i is re-directed to the confirmation page")
	public void i_validate_that_i_is_re_directed_to_the_confirmation_page() {

		WebElement ReEnter = driver.findElement(
		By.xpath("/html/body/div[1]/div/div[1]/div[2]/main/div/div/div/div/div/div/div/span/div/p[2]/a"));
		boolean ReEnterDisplayed = ReEnter.isDisplayed();
		assertEquals(true, ReEnterDisplayed);

		throw new io.cucumber.java.PendingException();
	}

}


