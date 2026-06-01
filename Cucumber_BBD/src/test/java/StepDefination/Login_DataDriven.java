package StepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login_DataDriven {

    WebDriver driver;

    @Given("login page should be open in default_browser")
    public void login_page_should_be_open_in_default_browser() {

        driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("http://zero.webappsecurity.com/login.html");
    }

    @When("^click on username field and add valid_user (.*)$")
    public void click_on_username_field_and_add_valid_user(String username1) {

        WebElement user = driver.findElement(By.id("user_login"));
        user.sendKeys(username1);

        System.out.println("Username = " + username1);
    }

    @And("^click on password button and enter valid (.*)$")
    public void click_on_password_button_and_enter_valid(String password1) {

        WebElement pass = driver.findElement(By.id("user_password"));
        pass.sendKeys(password1);

        System.out.println("Password = " + password1);
    }

    @And("^click on submit_button (.*)$")
    public void click_on_submit_button(String status) {

        driver.findElement(By.name("submit")).click();

        System.out.println("Status = " + status);
        System.out.println("****************");
    }

    @Then("login successful and redirect to home")
    public void login_successful_and_redirect_to_home() {

        driver.quit();
    }
}