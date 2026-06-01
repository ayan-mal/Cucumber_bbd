package StepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class Addtocart_ninza {
	WebDriver driver;
	@And("Search the product and add to cart")
	public void search_the_product_and_add_to_cart() throws InterruptedException {
		driver = new EdgeDriver();
		driver.get("https://tutorialsninja.com/demo/");
		WebElement search =driver.findElement(By.xpath("//*[@id=\"search\"]/input"));
		search.sendKeys("iPhone");

		Thread.sleep(2000);
		driver.findElement(	By.xpath("//*[@id=\"search\"]/span/button/i")).click();

		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"content\"]/div[3]/div/div/div[2]/div[2]/button[1]")).click();
		Thread.sleep(2000);
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	}

	@And("Remove the product from cart")
	public void remove_the_product_from_cart() throws InterruptedException {
		 driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[4]/a")).click();
		 Thread.sleep(2000);
		  driver.findElement(By.xpath("//*[@id=\"content\"]/form/div/table/tbody/tr/td[4]/div/span/button[2]/i")).click();
		  Thread.sleep(2000);
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	}

	@And("logout")
	public void logout() throws InterruptedException {
		 driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/a")).click();
		  driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/ul/li[5]/a")).click();
		  Thread.sleep(2000);
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	}

	@Then("user logout successfully")
	public void user_logout_successfully() {
		System.out.println("user logout successfully");
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
	}


}
