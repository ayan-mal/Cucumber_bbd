package StepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login_ninza {
	WebDriver driver;
	@Given("login page open in default browser")
	public void login_page_open_in_default_browser() {
		driver = new EdgeDriver();
		driver.get("https://tutorialsninja.com/demo/");
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
	}

	@When("click on Account field and click on login section")
	public void click_on_account_field_and_click_on_login_section() throws InterruptedException {
		 driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/a")).click();
		  driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/ul/li[2]/a")).click();
		  Thread.sleep(2000);
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	}

	@And("then enter valid email and password")
	public void then_enter_valid_email_and_password() throws InterruptedException {
		driver.findElement(By.id("input-email")).sendKeys("Ayan1234@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("Ayan@123");

		Thread.sleep(2000);
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
	}

	@And("now click on login button")
	public void now_click_on_login_button() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input")).click();

		Thread.sleep(3000);
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	}

	@Then("login successfully done")
	public void login_successfully_done() {
		System.out.println("Login successfully done");
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	}

}
