package testNG1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class registrationform {
	WebDriver driver;
	@Test(dataProvider = "registrationform")
	public void registrationform1(String firstname,String lastname,String useremail,String website,String userpassword,String confirmpassword,String textarea,String number,String inputfield)
	{
		System.setProperty("webdriber.chrome.driver","C:\\Users\\hp\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
				WebDriver driver=new ChromeDriver();
				driver.manage().window().maximize();
		driver.get("https://demo.wpeverest.com/user-registration/form-3/");
		driver.findElement(By.id("first_name")).sendKeys(firstname);
		driver.findElement(By.id("last_name")).sendKeys(lastname);
		driver.findElement(By.id("user_email")).sendKeys(useremail);
		driver.findElement(By.id("user_url")).sendKeys(website);
		driver.findElement(By.id("user_pass")).sendKeys(userpassword);
		driver.findElement(By.id("user_confirm_password")).sendKeys(confirmpassword);
		
		driver.findElement(By.id("check_box_1530100860_Choice1")).click();
		driver.findElement(By.id("check_box_1530100860_Choice2")).click();
		driver.findElement(By.id("check_box_1530100860_Choice3")).click();
		 WebElement radioButton = driver.findElement(By.id("radio_1530100861_Femalie"));

	        // Check if the radio button is not selected, then select it
	        if (!radioButton.isSelected()) {
	            radioButton.click();
	        }
	            WebElement dropdownElement = driver.findElement(By.xpath("//*[@id=\"country_1507714747\"]"));

	           
	            Select dropdown = new Select(dropdownElement);

	           
	            dropdown.selectByVisibleText("United States (US)");
	            driver.findElement(By.id("textarea_1507714757")).sendKeys(textarea);
	            driver.findElement(By.id("number_box_1507716030")).sendKeys(number);
	            WebElement dropdownElement1 = driver.findElement(By.id("select_1507714760"));

		           
	            Select dropdown1 = new Select(dropdownElement1);
	            dropdown1.selectByVisibleText("Option 2");
	            driver.findElement(By.id("input_box_1507714764")).sendKeys(inputfield);
	            driver.findElement(By.cssSelector("#user-registration-form-20 > form > div.ur-button-container > button")).click();
	            

	            
	        }	
	
	
	        @AfterClass
	        public void registrationform2()
	        {
	        	driver.close();
	        }
	        
	        @DataProvider(name="registrationform")
	        public Object[][] registrationform3()
	
	        {

return new Object[][]
		{
	{"aaaaa","bbbb","cccc","ddddd","kkkk","lllll","yyyyy","9865654323","dddd"},
	{"kukku","nk","kukku@gmail.com","https://www.cardekho.com/newcars","akshaya@123","akshaya@123","jhidhih","1234567891","sdhjktrdguhrtyujk"}
		};
	
		}
}