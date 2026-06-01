package StepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class Search_ninza {
	WebDriver driver;
	@And("Search any product and click button")
	public void search_any_product_and_click_button() throws InterruptedException {
		driver = new EdgeDriver();
		driver.get("https://tutorialsninja.com/demo/");
		 WebElement search =driver.findElement(By.xpath("//*[@id=\"search\"]/input"));
			search.sendKeys("Canon EOS 5D");
			Thread.sleep(2000);
			driver.findElement(	By.xpath("//*[@id=\"search\"]/span/button")).click();
		
			Thread.sleep(3000);
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
	}

	@Then("Search product will appear")
	public void search_product_will_appear() {
		System.out.println("Search successfully done");
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
	}



}
