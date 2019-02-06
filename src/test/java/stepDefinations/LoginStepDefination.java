package stepDefinations;

import static org.junit.Assert.assertTrue;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.HomePage;
import pageObjects.LandingPage;
import pageObjects.LoginPage;
import pageObjects.Logout;
import resources.base;

public class LoginStepDefination extends base {

	@Given("^Initialize the browser with chrome$")
	public void initialize_the_browser_with_chrome() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		driver = initializeDriver();
	}

	@Given("^Navigate to \"([^\"]*)\" Site$")
	public void navigate_to_Site(String url) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		driver.get(url);
	}

	@Then("^Verify that user is succesfully logged in$")
	public void verify_that_user_is_succesfully_logged_in() throws Throwable {

		HomePage home = new HomePage(driver);
		home.getProfile().click();
		Thread.sleep(3000);

		assertTrue(home.getPageTitle().contains("Hlulani"));

		home.getAbout().click();
		Thread.sleep(3000);
		home.getPhotos().click();
		Thread.sleep(3000);
		home.getHome().click();
		Thread.sleep(3000);
	}

	@When("^User enters (.+) and (.+) and logs in$")
	public void user_enters_and_and_logs_in(String username, String password) throws Throwable {
		LoginPage lp = new LoginPage(driver);

		lp.getEmail().sendKeys(username);
		Thread.sleep(3000);
		lp.getPassword().sendKeys(password);
		Thread.sleep(3000);
		lp.getLogin().click();
	}

	@When("^User clicks on logout link$")
	public void user_clicks_on_logout_link() throws Throwable {
		Logout logout = new Logout(driver);

		logout.getArrow().click();
		Thread.sleep(3000);
		logout.getLogout().click();
		
		driver.quit();
	}

	@And("^close browser$")
	public void close_browsers() throws Throwable {
		driver.quit();
	}
}
