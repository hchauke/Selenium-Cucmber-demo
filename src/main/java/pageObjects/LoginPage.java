package pageObjects;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

	public WebDriver driver;

	By email = By.cssSelector("[id='email']");
	By password = By.cssSelector("[type='password']");
	By login_button = By.cssSelector("[value='Log In']");

	public LoginPage(WebDriver driver) {

		this.driver = driver;
	}

	public WebElement getEmail() {
		return driver.findElement(email);
	}

	public WebElement getPassword() {
		return driver.findElement(password);
	}

	public WebElement getLogin() {
		return driver.findElement(login_button);
	}
}
