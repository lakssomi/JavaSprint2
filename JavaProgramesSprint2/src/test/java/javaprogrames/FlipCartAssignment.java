package javaprogrames;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FlipCartAssignment {
	WebDriver driver;
	WebElement element;

	@BeforeTest
	public void setup() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	}

	@Test
	public void testcase() {

		String title = driver.getTitle();

		driver.findElement(By.xpath("/html/body/div[2]/div/div/button")).click();

		System.out.println("title is " + title);
		Assert.assertTrue(title.contains(
				"Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!"));
	}

	@Test
	public void testcase2() {
		driver.findElement(By.xpath("//input[@placeholder='Search for products, brands and more']"))
				.sendKeys("iphone" + "\n");

		List<WebElement> iphones = driver.findElements(By.xpath("//a[@class='_1fQZEK']"));

		System.out.println(iphones.size());

		System.out.println(iphones.get(0).getText());
		iphones.get(0).getText();

		element = driver.findElement(By.xpath("(//a[@class='_1fQZEK'])[1]"));
		element.click();
		// WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		// wait.until(ExpectedConditions.visibilityOf(element));

	}

	@Test
	public void testcase3() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(element));

		Set<String> handles = driver.getWindowHandles();

		for (String handle : handles) {
			driver.switchTo().window(handle);

		}
		// driver.switchTo().window(handle);
		System.out.println(driver.getTitle());

		WebElement cart = driver.findElement(By.xpath("//button[text()='Add to cart']"));
		// WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
		// wait1.until(ExpectedConditions.elementToBeClickable(cart));

		WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait1.until(ExpectedConditions.elementToBeClickable(cart)).click();

	}

}
