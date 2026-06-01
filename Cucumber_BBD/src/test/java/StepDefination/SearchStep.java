package StepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class SearchStep {
	WebDriver driver;
	@And("go to search button and click add inputs")
	public void go_to_search_button_and_click_add_inputs() {
		driver = new EdgeDriver();
        driver.get("http://zero.webappsecurity.com/");
        driver.manage().window().maximize();
        driver.findElement(By.id("searchTerm")).click();
        driver.findElement(By.id("searchTerm"))
              .sendKeys("Online Banking");

		//driver.findElement(By.id("searchTerm")).sendKeys("Online banking");
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	}

	@Then("list of productsFeature: verify Search")
	public void list_of_products_feature_verify_search() {
		System.out.println("Search successfully done");
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
	}


}
