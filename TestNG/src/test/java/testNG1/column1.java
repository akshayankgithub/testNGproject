package testNG1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class column1 {
	
		WebDriver driver;
		@Test (dataProvider= "username")
		public void colomn1(String username,String useremail,String userpassword,String confirmuserpassword) {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Downloads\\msedgedriver.exe");
			EdgeOptions option=new EdgeOptions();
			WebDriver driver=new EdgeDriver();
			driver.manage().window().maximize();
			driver.get("https://demo.wpeverest.com/user-registration/bordered/");
			driver.findElement(By.id("user_login")).sendKeys(username);
			driver.findElement(By.id("user_email")).sendKeys(useremail);
			driver.findElement(By.id("user_pass")).sendKeys(userpassword);
			driver.findElement(By.id("user_confirm_password")).sendKeys(confirmuserpassword);
			driver.findElement(By.xpath("//*[@id=\"user-registration-form-47\"]/form/div[2]/button")).click();
		}
		@AfterTest 
		public void datadriven2() {
			 driver.close();
		}
		@DataProvider (name="username")
		public Object[][]  datadriven3(){
			return new  Object[][]{
			{"arun","arun678@gmail.com","#1234123#","#123123#"},
			{"varun","varun342@gmail.com","#987987#","#987987#"},
			{"tini","tini789@gmail.com","#87898789#","#87898789#"}
			
		};
		}
		}
	


