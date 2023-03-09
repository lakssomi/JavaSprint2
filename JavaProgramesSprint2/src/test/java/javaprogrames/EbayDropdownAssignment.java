package javaprogrames;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EbayDropdownAssignment {
	WebDriver driver;

	@BeforeTest
	public void setUp() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ebay.in/b/Watches/14324");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	}

	@Test
	public void testcase1() {
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals(title, "Electronics, Cars, Fashion, Collectibles, Coupons and More Online Shopping | eBay");

	}

	@Test
	public void testcase2() {
		WebElement element = driver.findElement(By.xpath("//select[@id='gh-cat']"));
		element.click();
		Select s = new Select(element);
		List<WebElement> watches = s.getOptions();
		List actualList = new ArrayList();
		List tempList = new ArrayList();

		int watchcount = watches.size();
		System.out.println("watchcount " + watchcount);
		for (WebElement watch : watches) {
			String name = watch.getText();
			System.out.println(name);
			actualList.add(name);

		}
		tempList = actualList;
		Collections.sort(tempList);
		System.out.println("Sorted temPList : " + tempList);
		Assert.assertEquals(watchcount, 38);

	}

	@AfterTest
	public void teardown() {
		driver.close();
	}

}
