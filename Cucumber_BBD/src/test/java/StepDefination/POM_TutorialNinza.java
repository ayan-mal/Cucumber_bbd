package StepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class POM_TutorialNinza {
	WebDriver driver;
	
	//Registration
	By Profile_logo=By.xpath("//*[@id=\"top-links\"]/ul/li[2]/a/i");
	By Register=By.xpath("//*[@id=\"top-links\"]/ul/li[2]/ul/li[1]/a");
	By First_name=By.id("input-firstname");
	By Last_name=By.id("input-lastname");
	By Email=By.id("input-email");
	By Telephone=By.id("input-telephone");
	By Password=By.id("input-password");
	By Confirm_password=By.id("input-confirm");
	By Radio_button=By.xpath("//*[@id=\"content\"]/form/div/div/input[1]");
	By Register_button=By.xpath("//*[@id=\"content\"]/form/div/div/input[2]");
	// Login
	By profile_logo=By.xpath("//*[@id=\"top-links\"]/ul/li[2]/a");
	By Login=By.xpath("//*[@id=\"top-links\"]/ul/li[2]/ul/li[2]/a");
	By email=By.id("input-email");
	By password=By.id("input-password");
	By Login_button=By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input");
	//Search
	By Search_bar=By.xpath("//*[@id=\"search\"]/input");
	By Search_button=By.xpath("//*[@id=\"search\"]/span/button");
	By Search_bar1=By.xpath("//*[@id='search']/input");
	//Add_to_cart
	By Search_bar2=By.xpath("//*[@id=\"search\"]/input");
	By Search_button2=By.xpath("//*[@id=\"search\"]/span/button/i");
	By Add_to_cart=By.xpath("//*[@id=\"content\"]/div[3]/div/div/div[2]/div[2]/button[1]");
	//Remove from cart
	By Order_button=By.xpath("//*[@id=\"top-links\"]/ul/li[4]/a");
	By Cross_button=By.xpath("//*[@id=\"content\"]/form/div/table/tbody/tr/td[4]/div/span/button[2]/i");
	//Logout
	By User=By.xpath("//*[@id=\"top-links\"]/ul/li[2]/a");
	By Logout=By.xpath("//*[@id=\"top-links\"]/ul/li[2]/ul/li[5]/a");
	
	public POM_TutorialNinza(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void Registration() throws InterruptedException
	{
		driver.findElement(Profile_logo).click();
		driver.findElement(Register).click();
		Thread.sleep(2000);
        driver.findElement(First_name).sendKeys("Ayan");
		driver.findElement(Last_name).sendKeys("Mal");
		driver.findElement(Email).sendKeys("Ayan1234@gmail.com");
		driver.findElement(Telephone).sendKeys("1234567890");
		driver.findElement(Password).sendKeys("Ayan@123");
		driver.findElement(Confirm_password).sendKeys("Ayan@123");
		Thread.sleep(2000);
		driver.findElement(Radio_button).click();
		Thread.sleep(2000);
		driver.findElement(Register_button).click();
		Thread.sleep(2000);

	}
	public void Login() throws InterruptedException {
		driver.findElement(profile_logo).click();
		  driver.findElement(Login).click();
		  Thread.sleep(2000);
		  driver.findElement(email).sendKeys("Ayan1234@gmail.com");
			driver.findElement(password).sendKeys("Ayan@123");
			Thread.sleep(2000);
			driver.findElement(Login_button).click();
			Thread.sleep(3000);
	}
	public void search() throws InterruptedException {
		 WebElement search =driver.findElement(Search_bar);
			search.sendKeys("Canon EOS 5D");
			Thread.sleep(2000);
			driver.findElement(Search_button).click();
			Thread.sleep(3000);
			search = driver.findElement(Search_bar1);
			search.clear();
	}
	public void add_to_cart() throws InterruptedException {
		WebElement search =driver.findElement(Search_bar2);
		search.sendKeys("iPhone");

		Thread.sleep(2000);
		driver.findElement(Search_button2).click();

		Thread.sleep(2000);
		driver.findElement(Add_to_cart).click();
		Thread.sleep(2000);
	}
	public void remove_from_cart() throws InterruptedException {
		driver.findElement(Order_button).click();
		 Thread.sleep(2000);
		  driver.findElement(Cross_button).click();
		  Thread.sleep(2000);
	}
	public void Logout() throws InterruptedException {
		driver.findElement(User).click();
		  driver.findElement(Logout).click();
		  Thread.sleep(2000);
	}
}
