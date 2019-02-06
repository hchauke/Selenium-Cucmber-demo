package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {

	public WebDriver driver;
	
	By welcome = By.xpath("//div[@class='_ihd _3ma _6s']");

	public LandingPage(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getPageWelcomeTitle() {
		return driver.findElement(welcome);
	}
}
