package stepDefination;

import org.openqa.selenium.*;
//import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*; // * is importing all function.

/*import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;*/

public class LoginStep {
	WebDriver driver;

	@Given("I enter the login url {string}")
	public void i_enter_the_login_url(String string) {
		driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
	}

	@When("I enter username {string} and password {string}")
	public void i_enter_username_and_password(String string, String string2) {
		driver.findElement(By.id("user-name")).sendKeys(string);
		driver.findElement(By.id("password")).sendKeys(string2);
	}

	@When("I click on login button")
	public void i_click_on_login_button() {
		driver.findElement(By.id("login-button")).click();
	}

	@Then("I verify user land on homepage")
	public void i_verify_user_land_on_homepage() {
		String s = driver.getCurrentUrl();
		if (s.equals("https://www.saucedemo.com/inventory.html")) {
			System.out.println("Verified");
		}
	}

	@But("I should receive message its wrong credentils")
	public void i_should_receive_message_its_wrong_credentils() {
		boolean result = driver.findElement(By.className("error-button")).isDisplayed();
		if (result == true) {
			System.out.println("Error messege pop up");
		}
	}
}
