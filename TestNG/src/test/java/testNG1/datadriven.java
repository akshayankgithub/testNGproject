package testNG1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class datadriven {
	WebDriver driver;
	@Test(dataProvider="login")
	public void datadriven(String username,String password)
	{
	System.setProperty("webdriber.chrome.driver","C:\\Users\\hp\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	 driver=new ChromeDriver();
	driver.get("https://www.saucedemo.com/v1/");
	driver.findElement(By.id("user-name")).sendKeys(username);
	driver.findElement(By.id("password")).sendKeys(password);
	driver.findElement(By.id("login-button")).click();
	
	 		

	}
	@AfterClass
	public void datadriven1()
	{
		driver.close();
	}
	@DataProvider(name="login")
	public Object[][]  datadriven2()
	{
		return new Object[][]
				{
			
			{"kukku","09876"},
			{"vian","1234"},
			{"ma","45678"},
			{"kiki","102938"},
			{"standard_user","secret_sauce"}
				};
}
	}

