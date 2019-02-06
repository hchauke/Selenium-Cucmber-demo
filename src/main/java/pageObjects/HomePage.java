package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
	
	public WebDriver driver;
	
	By profile_page = By.xpath("//span[@class='_1vp5']");
	By profile_name = By.xpath("//a[@class='_2nlw _2nlv']");
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getProfile() {
		return driver.findElement(profile_page);
	}

	public WebElement getProfileName() {
		return driver.findElement(profile_name);
	}
}
