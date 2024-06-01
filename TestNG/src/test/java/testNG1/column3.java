package testNG1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class column3 {
	WebDriver driver;
	@Test (dataProvider= "user")
	public void colomn2(String useremail,String username,String firstname,String lastname,String userpassword,String nickname,String website,String textarea) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Downloads\\chromedriver-win64\\chromedriver.exe");
	ChromeOptions option=new ChromeOptions();
	WebDriver driver=new ChromeDriver(option);
	driver.manage().window().maximize();
	driver.get("https://demo.wpeverest.com/user-registration/column-3/");
    driver.findElement(By.id("user_email")).sendKeys(useremail);
    driver.findElement(By.id("user_login")).sendKeys(username);
    driver.findElement(By.id("user_pass")).sendKeys(userpassword);
    driver.findElement(By.id("first_name")).sendKeys(firstname);
    driver.findElement(By.id("last_name")).sendKeys(lastname);
    driver.findElement(By.id("nickname")).sendKeys(nickname);
    driver.findElement(By.id("user_url")).sendKeys(website);
    driver.findElement(By.id("textarea_1530101155")).sendKeys(textarea);
    driver.findElement(By.xpath("//*[@id=\"date_box_1530101157_field\"]/span/input[1]")).click();
    driver.findElement(By.xpath("/html/body/div[5]/div[1]/div/div/div/span[1]")).click();
    driver.findElement(By.xpath("/html/body/div[5]/div[1]/div/div/select")).click();
    driver.findElement(By.xpath("/html/body/div[5]/div[1]/span[2]")).click();

	 WebElement dropdownElement = driver.findElement(By.xpath("/html/body/div[5]/div[1]/div/div/select"));

     
     Select dropdown1 = new Select(dropdownElement);
     dropdown1.selectByVisibleText("October");
	}
	@AfterClass 
	public void datadrivrn1() {
		driver.close();
	}
	@DataProvider (name="user")
	public Object[][] datadriven(){
		return new Object[][] {
			{"kukku@gmail.com","kukkunk","kukku@1234","kukku","nk","kuki","https://www.loreal.com/en/","hlo",},
			{"mimu@gmail.com","mimup","mimu@1234","mimu","p","mimii","https://www.loreal.com/en/","hii",},
			{"leela@gmail.com","leelavp","leela@1234","leela","vp","leelu","https://www.loreal.com/en/","bye",}
		};
	}
}
