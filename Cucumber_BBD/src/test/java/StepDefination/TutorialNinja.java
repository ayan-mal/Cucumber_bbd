package StepDefination;

import org.openqa.selenium.WebDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TutorialNinja {
	WebDriver driver;
	POM_TutorialNinza page;
	//TutorialNinja_Hooks hk;
	@Given("user open TutorialsNinja website")
	public void user_open_tutorials_ninja_website() {
		//hk = new TutorialNinja_Hooks(driver);
		//hk.setup();
		driver = TutorialNinja_Hooks.driver; //call the hooks file driver
		 System.out.println("Browser opened successfully");
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	}

	@When("user register new account")
	public void user_register_new_account() throws InterruptedException {
		
		page=new POM_TutorialNinza(driver);
		page.Registration();
		System.out.println("Registration done successfully");
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	}

	@And("user login with valid credentials")
	public void user_login_with_valid_credentials() throws InterruptedException {
		page=new POM_TutorialNinza(driver);
		page.Login();
			System.out.println("Login successfully");
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	}

	@And("user search product")
	public void user_search_product() throws InterruptedException {
		page=new POM_TutorialNinza(driver);
		page.search();
			System.out.println("Product searched successfully");
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	}

	@And("user add product to add to cart")
	public void user_add_product_to_add_to_cart() throws InterruptedException {
		page=new POM_TutorialNinza(driver);
		page.add_to_cart();
		System.out.println("Product add to cart successfully");
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
	}

	@And("user remove product from cart")
	public void user_remove_product_from_cart() throws InterruptedException {
		page=new POM_TutorialNinza(driver);
		page.remove_from_cart();
		  System.out.println("Product removed successfully");
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	}

	@And("logout from the page")
	public void logout_from_the_page() throws InterruptedException {
		page=new POM_TutorialNinza(driver);
		page.Logout();
		  System.out.println("user logout successfully");
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	}
	@Then("Tutorial ninza working properly")
	public void tutorial_ninza_working_properly() {
		//hk = new TutorialNinja_Hooks(driver);
		//hk.close();
		System.out.println("Tutorial ninza working properly");
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	}

}
