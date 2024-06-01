package testNG1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class conditionalform {
	WebDriver driver;
	@Test (dataProvider="username")
	public void conditionalform( String mra,String input,String useremail,String userpassword,String leave) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Downloads\\msedgedriver.exe");
		EdgeOptions option=new EdgeOptions();
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.wpeverest.com/user-registration/conditional-registration-form/");
		WebElement radiobutton = driver.findElement(By.id("radio_1569481639_Vendor"));
		if (!radiobutton.isSelected()) {
            radiobutton.click();
            driver.findElement(By.id("input_box_1569481765")).sendKeys(mra);
            driver.findElement(By.id("input_box_1569481771")).sendKeys(input);
            driver.findElement(By.xpath("//*[@id=\"check_box_1569482487_Nikon\"]")).click();
		driver.findElement(By.id("user_email")).sendKeys(useremail);
		driver.findElement(By.id("user_pass")).sendKeys(userpassword);
		 }
        WebElement dropdownElement = driver.findElement(By.xpath("//*[@id=\"country_1569483038\"]"));

       
        Select dropdown = new Select(dropdownElement);
        dropdown.selectByVisibleText("United States (US)");
        driver.findElement(By.id("check_box_1569483464_Yes")).click();
        driver.findElement(By.id("textarea_1569483045")).sendKeys(leave);
        driver.findElement(By.cssSelector("#user-registration-form-116 > form > div.ur-button-container > button")).click();

		
	}
	@AfterTest
	public void datadriven2(){
		driver.close();
	}
		
		@DataProvider (name="username")
		
		public Object[][] datadriven(){
			return new Object[][]{
				{"mra","1234","vian22@gmail.com","#vian123@","leave"},
				{"lovely","2345","kukku98@gmail.com","#kukku123@","leave"},
				{"pinky","7865","lilli977@gmail.com","#lilli@123@","leave"}
			
		};
		}
		
		
	}
	


