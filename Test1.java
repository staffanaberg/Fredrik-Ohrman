package uppgiftTest;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Test1 {
	@Test
	public void testMailChimp() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\MyDrivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://login.mailchimp.com/signup/");

		WebElement searchBox = driver.findElement(By.name("email"));
		searchBox.sendKeys("lars38@lars.se");

		WebElement searchBox1 = driver.findElement(By.name("username"));
		searchBox1.sendKeys("2w3e4387AA");

		WebElement searchBox11 = driver.findElement(By.name("password"));
		searchBox11.sendKeys("Qwerty123!");
		searchBox11.submit();

		WebElement ReEnter = driver.findElement(
				By.xpath("/html/body/div[1]/div/div[1]/div[2]/main/div/div/div/div/div/div/div/span/div/p[2]/a"));
		boolean ReEnterDisplayed = ReEnter.isDisplayed();
		assertEquals(true, ReEnterDisplayed);

		Thread.sleep(5000);
		driver.quit();
	}
}
