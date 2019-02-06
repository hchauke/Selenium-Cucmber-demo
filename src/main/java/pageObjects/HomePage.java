package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {

	public WebDriver driver;

	By profile_page = By.xpath("//span[@class='_1vp5']");
	By about_page = By.xpath("//a[contains(text(),'About')]");
	By photos = By.xpath("//a[contains(text(),'Photos')]");
	By back_to_home = By.xpath("//a[@class='_2s25']");

	public HomePage(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getProfile() {
		return driver.findElement(profile_page);
	}

	public String getPageTitle() {
		return driver.getTitle();
	}
	
	public WebElement getAbout() {
		return driver.findElement(about_page);
	}
	
	public WebElement getPhotos() {
		return driver.findElement(photos);
	}
	
	public WebElement getHome() {
		return driver.findElement(back_to_home);
	}
}
