package testNG1;

import org.testng.annotations.Test;

public class arithmatic {
   int a =10;
   int b =20;
   @Test
   public void add()
   {
	   int sum=a+b;
	   System.out.println(sum);
   }
   @Test
   public void subtract() 
   {
	   int sum=a-b;
	   System.out.println(sum);
	   
   }
   @Test
   public void divition()
   {
	  int sum=a/b;
	  System.out.println(sum);
   
   }
   @Test
   public void multiplication()
   {
	   int sum=a*b;
	   System.out.println(sum);
   }
}
