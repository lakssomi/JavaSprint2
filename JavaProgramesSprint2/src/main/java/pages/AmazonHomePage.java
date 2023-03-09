package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AmazonHomePage {
	WebDriver driver;
	WebDriverWait wait;

	@FindBy(xpath = "//input[@id='twotabsearchtextbox']")
	WebElement search;

	@FindBy(xpath = "//i[@class='a-icon a-icon-star-medium a-star-medium-4']")
	WebElement rating;

	@FindBy(xpath = "//div[contains(@class,'rush-component s-featured-result-item')]//span[@class='a-size-medium a-color-base a-text-normal'][contains(text(),'Amazon Fire TV')]")
	WebElement tv;
	@FindBy(id = "add-to-cart-button")
	WebElement addToCartBtn;

	@FindBy(id = "nav-cart-count")
	WebElement count;

	// @FindBy(xpath = "//span[@class='a-button a-button-base
	// abb-intl-decline']//input[@type='submit']")
	WebElement warrenty;

	public AmazonHomePage(WebDriver driver) {
		this.driver = driver;
	}

	public void Search() {
		search.click();
	}

	public void Rating() {
		rating.click();
	}

	public String addToCart() {
		search.sendKeys("television", Keys.ENTER);
		rating.click();

		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(
				"//div[contains(@class,'rush-component s-featured-result-item')]//span[@class='a-size-medium a-color-base a-text-normal'][contains(text(),'Amazon Fire TV')]")));
		tv.click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		addToCartBtn.click();

		// warrenty.click();
		return count.getText();
	}

}
