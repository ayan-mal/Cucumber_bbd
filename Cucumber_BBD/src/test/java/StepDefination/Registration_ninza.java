package StepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Registration_ninza {
	WebDriver driver;
	@Given("Registration page open in default browser")
	public void registration_page_open_in_default_browser() {
		driver = new EdgeDriver();
		driver.get("https://tutorialsninja.com/demo/");
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
	}

	@When("click on account and then registration")
	public void click_on_account_and_then_registration() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/a/i")).click();
		driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/ul/li[1]/a")).click();
		 Thread.sleep(2000);
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
	}

	@And("Fill the all section")
	public void fill_the_all_section() throws InterruptedException {
driver.findElement(By.id("input-firstname")).sendKeys("Ayan");

		
		driver.findElement(By.id("input-lastname")).sendKeys("Mal");
		driver.findElement(By.id("input-email")).sendKeys("Ayan1234@gmail.com");
		driver.findElement(By.id("input-telephone")).sendKeys("1234567890");
		driver.findElement(By.id("input-password")).sendKeys("Ayan@123");
		driver.findElement(By.id("input-confirm")).sendKeys("Ayan@123");
		Thread.sleep(2000);
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	}

	@And("click on checkbox and submit registration")
	public void click_on_checkbox_and_submit_registration() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id=\"content\"]/form/div/div/input[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"content\"]/form/div/div/input[2]")).click();
		Thread.sleep(2000);
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	}

	@Then("Registration successfully done")
	public void registration_successfully_done() {
		System.out.println("Registration successfully done");
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	}


}
