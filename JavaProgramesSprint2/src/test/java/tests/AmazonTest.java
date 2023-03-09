package tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.AmazonHomePage;
import testBase.TestbaseAmazon;

public class AmazonTest extends TestbaseAmazon {
	AmazonHomePage ahp;

	@BeforeClass
	public void init() {
		ahp = PageFactory.initElements(driver, AmazonHomePage.class);
	}

	@Test
	public void verifyAddToCart() {
		String actualCount = ahp.addToCart();
		System.out.println("Actual Count---->" + actualCount);
		Assert.assertEquals(actualCount, "1");

	}

}
