package uppgiftTest;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test3 {

	@Test
	public void testUserExist() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\MyDrivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://login.mailchimp.com/signup/");

		WebElement searchBox = driver.findElement(By.name("email"));
		searchBox.sendKeys("jagFinns1@existens.se");

		WebElement searchBox1 = driver.findElement(By.name("username"));
		searchBox1.sendKeys("F1nn24");

		WebElement searchBox11 = driver.findElement(By.name("password"));
		searchBox11.sendKeys("Qwerty123!");
		searchBox11.submit();

		WebElement ReEnter = driver.findElement(
				By.xpath("/html/body/div[1]/div/div[1]/div[2]/main/div/div/div/div/div/div/div/span/div/p[2]/a"));
		boolean ReEnterDisplayed = ReEnter.isDisplayed();
		assertEquals(true, ReEnterDisplayed);

		driver.get("https://login.mailchimp.com/signup/");

		WebElement searchBox2 = driver.findElement(By.name("email"));
		searchBox2.sendKeys("jagFinns1@existens.se");

		WebElement searchBox22 = driver.findElement(By.name("username"));
		searchBox22.sendKeys("F1nn24");

		WebElement searchBox222 = driver.findElement(By.name("password"));
		searchBox222.sendKeys("Qwerty234!");
		searchBox222.submit();

		WebElement check = driver.findElement(By.className("invalid-error"));

		boolean checkDisplayed = check.isDisplayed();
		assertEquals(true, checkDisplayed);

		Thread.sleep(5000);
		driver.quit();
	}

}
