package testNG1;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class testNGtask1 {
	@Test
	public void maven()
	{
		System.out.println("hello world");
		
	}
	
@BeforeTest
	public void maven1() 
{
	System.out.println("hello dubai");
	
	
}
@AfterTest
public void maven2()
{
	System.out.println("hello kerala");
	
}

}
