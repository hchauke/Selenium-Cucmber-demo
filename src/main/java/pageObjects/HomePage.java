package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {

	public WebDriver driver;

	By profile_page = By.xpath("//span[@class='_1vp5']");

	public HomePage(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getProfile() {
		return driver.findElement(profile_page);
	}

	public String getPageTitle() {
		return driver.getTitle();
	}
}
