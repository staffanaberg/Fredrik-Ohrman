package uppgiftTest;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test2 {
	@Test
	public void testUserLong() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\MyDrivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://login.mailchimp.com/signup/");

		WebElement searchBox = driver.findElement(By.name("email"));
		searchBox.sendKeys("lars12@lars.se");

		WebElement searchBox1 = driver.findElement(By.name("username"));
		searchBox1.sendKeys(
				"1Q!w2e3r4t5y6u7i8o9p0åzaxscdvfbgnhmjkälöpksojansjkch476d5s961la9z74n6b3v9x7v7sj010101010101010101010");

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
