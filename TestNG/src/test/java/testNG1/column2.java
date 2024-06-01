package testNG1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
public class column2 {
	
		
		WebDriver driver;
		@Test (dataProvider= "username")
		public void colomn2(String useremail,String username,String firstname,String lastname,String userpassword,String conformpassword,String nickname,String website) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Downloads\\msedgedriver.exe");
		EdgeOptions option=new EdgeOptions();
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.wpeverest.com/user-registration/column-2/");
		driver.findElement(By.id("user_email")).sendKeys(useremail);
		driver.findElement(By.id("user_login")).sendKeys(username);
		driver.findElement(By.id("first_name")).sendKeys(firstname);
		driver.findElement(By.id("last_name")).sendKeys(lastname);
		driver.findElement(By.id("user_pass")).sendKeys(userpassword);
		driver.findElement(By.id("user_confirm_password")).sendKeys(conformpassword);
		driver.findElement(By.id("nickname")).sendKeys(nickname);
		driver.findElement(By.id("user_url")).sendKeys(website);
		driver.findElement(By.cssSelector("#user-registration-form-16 > form > div.ur-button-container > button")).click();
		}
		@AfterTest 
		public void datadriven1() {
			driver.close();
			
		}
		@DataProvider (name="username")
		public Object[][] datadriven(){
			return new Object[][] {
				{"arunk2gmail.com","arun.k","arun","k","123arun","123arun","aaru","https://www.loreal.com/en/"},
				{"varunkk@gmail.com","varun.kk","varun","kk","456varun","456varun","vaune","https://www.loreal.com/en/"},
				{"kukku98@gmail.com","kukku.nk","kukku","nk","789kukku","789kukku","kuku","https://www.loreal.com/en/"}
			};
			}
			
			
		}
		
		
		
	
		
		
		


