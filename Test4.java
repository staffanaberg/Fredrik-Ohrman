package uppgiftTest;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test4 {

	@Test
	public void testMailMissing() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\MyDrivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://login.mailchimp.com/signup/");

		WebElement searchBox1 = driver.findElement(By.name("username"));
		searchBox1.sendKeys("2w3e4387AA");

		WebElement searchBox11 = driver.findElement(By.name("password"));
		searchBox11.sendKeys("Qwerty123!");
		searchBox11.submit();

		WebElement invalid = driver.findElement(By.className("invalid-error"));
		boolean invalidDisplayed = invalid.isDisplayed();
		assertEquals(true, invalidDisplayed);
		
		Thread.sleep(5000);
		driver.quit();
	}
}
