package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Logout {
	public WebDriver driver;
	
	By tools_arrow = By.xpath("//div[@id='userNavigationLabel']");
	By logout = By.xpath("//span[contains(text(),'Log Out')]");
	
	public Logout(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement getArrow() {
		return driver.findElement(tools_arrow);
	}

	public WebElement getLogout() {
		return driver.findElement(logout);
	}
}
