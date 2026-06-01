package StepDefination;

import io.cucumber.java.After;
import io.cucumber.java.Before;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class TutorialNinja_Hooks {
	public static WebDriver driver;
	//TutorialNinja_Hooks(WebDriver driver){
    //	this.driver=driver;
   // }
/*  @Before // always execute before all test
  public void setup() {
	  driver = new EdgeDriver();
	  driver.get("https://tutorialsninja.com/demo/");
  }

  @After // always executes after all test 
  public void close() {
	  if(driver != null) {
        driver.quit();
  }*/ //for cucumber run
	    @Before
	    public void setup() {

	        EdgeOptions options = new EdgeOptions();

	        options.addArguments("--headless=new");
	        options.addArguments("--disable-gpu");
	        options.addArguments("--window-size=1920,1080");
	        options.addArguments("--no-sandbox");
	        options.addArguments("--disable-dev-shm-usage");

	        driver = new EdgeDriver(options);

	        driver.get("https://tutorialsninja.com/demo/");
	    }

	    @After
	    public void close() {
	        if (driver != null) {
	            driver.quit();
	        }
	 
}
}
