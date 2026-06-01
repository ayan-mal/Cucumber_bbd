package StepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStep {
	WebDriver driver;
	@Given("login page should be open in default browser")
	public void login_page_should_be_open_in_default_browser() {
		driver=new EdgeDriver();
		driver.get("http://zero.webappsecurity.com/login.html");
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	}

	@When("click on username field and add valid user username")
	public void click_on_username_field_and_add_valid_user_username() {
	WebElement user=driver.findElement(By.id("user_login"));
	user.sendKeys("username");
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
	}

	@And("then click on password button and enter valid password")
	public void then_click_on_password_button_and_enter_valid_password() {
	WebElement pass=driver.findElement(By.id("user_password"));
	pass.sendKeys("password");
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	}

	@And("now click on submit button")
	public void now_click_on_submit_button() {
		driver.findElement(By.name("submit")).click();
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
	}

	@Then("login successfully and redirect to home page")
	public void login_successfully_and_redirect_to_home_page() {
		System.out.println("Login successfully done");
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	}

}
