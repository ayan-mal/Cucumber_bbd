package StepDefination;

import io.cucumber.java.After;
import io.cucumber.java.Before;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
//import org.openqa.selenium.edge.EdgeDriver;
//import org.openqa.selenium.edge.EdgeOptions;

public class TutorialNinja_Hooks {
	public static WebDriver driver;
	//TutorialNinja_Hooks(WebDriver driver){
    //	this.driver=driver;
   // }
  @Before // always execute before all test
  public void setup() {
	  ChromeOptions options = new ChromeOptions();

      options.addArguments("--headless=new");
      options.addArguments("--no-sandbox");
      options.addArguments("--disable-dev-shm-usage");
      options.addArguments("--disable-gpu");

      driver = new ChromeDriver(options);
	  //driver = new EdgeDriver(); 
	  //driver = new ChromeDriver();//chromedriver working for jenkins that why i use here
	  driver.get("https://tutorialsninja.com/demo/");
  }

  @After // always executes after all test 
  public void close() {
	  if(driver != null) {
        driver.quit();
  } //for cucumber run
	 
}
}
