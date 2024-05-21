package testNG1;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class parabanktask {
	WebDriver driver;

	
	@Test(dataProvider="register")
	
	public void parabanktask1(String firstname,String lastname,String  street,String city,String state,String zipcode,String phonenumber,String ssn,String username,String password,String repeatedpassword)
	{
	System.setProperty("webdriber.chrome.driver","C:\\Users\\hp\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromediver.exe");
	WebDriver driver=new ChromeDriver();
	 driver.get("https://parabank.parasoft.com/parabank/index.htm");
	 driver.findElement(By.xpath("//*[@id=\"loginPanel\"]/p[2]/a")).click();
	 driver.findElement(By.id("customer.firstName")).sendKeys(firstname);
	 driver.findElement(By.id("customer.lastName")).sendKeys(lastname);
	 driver.findElement(By.id("customer.address.street")).sendKeys(street);
	 driver.findElement(By.id("customer.address.city")).sendKeys(city);
	 driver.findElement(By.id("customer.address.state")).sendKeys(state);
	 driver.findElement(By.id("customer.address.zipCode")).sendKeys(zipcode);
	 driver.findElement(By.id("customer.phoneNumber")).sendKeys(phonenumber);
	 driver.findElement(By.id("customer.ssn")).sendKeys(ssn);
	 driver.findElement(By.id("customer.username")).sendKeys(username);
	 driver.findElement(By.id("customer.password")).sendKeys(password);
	 driver.findElement(By.id("repeatedPassword")).sendKeys(repeatedpassword);
	 driver.findElement(By.xpath("//*[@id=\"customerForm\"]/table/tbody/tr[13]/td[2]/input")).click();
	 
	 
	 

}
	@AfterClass
	public void parabanktask2()
	{
		driver.close();
	}
	@DataProvider(name="register")
	public Object[][] parabanktask3()
	{
		return new Object[][]
				{
			{"kiki","ma","lee","pa","ji","yu","we","pi","ftt","nii","mll"},
			{"aww","dee","bnn","nkk","ghh","ji","dhcj","hruih","huheiu","geuig","gdueg"},
			{"fuyuf","hsuihd","igui","guihiuh","gughiu","yuihih","guigui","guiyhiu9","yiuhi","y8oi","gudh"},
			{"leela","k k","karthika","calicut","kerala","673101","8765454323","897654345","akshaya","123","123"}
				};
	}
}
