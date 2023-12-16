package stepdfs;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.*;

public class LoginSteps {

	WebDriver driver;
	  
	  @Given("I am on the login page")
	  public void iAmOnTheLoginPage() {
	      driver.get("https://www.saucedemo.com/");
	  }

	  @When("I enter {string} and {string} and click submit")
	  public void iEnterUsernameAndPasswordAndClickSubmit(String username, String password) {
	      // Enter username and password and submit
	  }

	  @Then("I should see {string} as page title")
	  public void iShouldSeeTitleAsPageTitle(String expectedTitle) {
	      String actualTitle = driver.getTitle();
	      Assert.assertEquals(expectedTitle, actualTitle);
	  }
	}

