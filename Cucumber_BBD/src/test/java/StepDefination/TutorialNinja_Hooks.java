package StepDefination;

import io.cucumber.java.After;
import io.cucumber.java.Before;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class TutorialNinja_Hooks {
	public static WebDriver driver;
	//TutorialNinja_Hooks(WebDriver driver){
    //	this.driver=driver;
   // }
  @Before // always execute before all test
  public void setup() {
	  driver = new EdgeDriver();
	  driver.get("https://tutorialsninja.com/demo/");
  }

  @After // always executes after all test 
  public void close() {
	  driver.close();
	  
  }

}
