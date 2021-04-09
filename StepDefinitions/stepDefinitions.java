package StepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.assertEquals;

import java.util.Random;

public class stepDefinitions {

	WebDriver driver = new ChromeDriver();
	Random random = new Random(100);

	@Given("I want to navigate to <https:\\/\\/login.mailchimp.com\\/signup\\/>")
	public void i_want_to_navigate_to_https_login_mailchimp_com_signup() {

		driver.manage().window().maximize();
		driver.get("https://login.mailchimp.com/signup/");

		throw new io.cucumber.java.PendingException();
	}

	@Given("I want to create a <account> there")
	public void i_want_to_create_a_account_there() {

		WebElement searchBox = driver.findElement(By.name("email"));
		searchBox.sendKeys(random + "@larsipan.se");

		WebElement searchBox1 = driver.findElement(By.name("username"));
		searchBox1.sendKeys("lars" + random);

		throw new io.cucumber.java.PendingException();
	}

	@When("I submit my information for the <account>")
	public void i_submit_my_information_for_the_account() {

		WebElement searchBox11 = driver.findElement(By.name("password"));
		searchBox11.sendKeys("Qwerty!" + random);
		searchBox11.submit();

		throw new io.cucumber.java.PendingException();
	}

	@Then("I want to be redirected to <conformation page>")
	public void i_want_to_be_redirected_to_conformation_page() {

		WebElement ReEnter = driver.findElement(
				By.xpath("/html/body/div[1]/div/div[1]/div[2]/main/div/div/div/div/div/div/div/span/div/p[2]/a"));
		boolean ReEnterDisplayed = ReEnter.isDisplayed();
		assertEquals(true, ReEnterDisplayed);

		throw new io.cucumber.java.PendingException();
	}

}
