package annotation;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class method {
	@BeforeMethod
	public void beforeMethodTest()
	{
	System.out.println("Runs before every method");
	}
	@Test
	public void testcase1()
	{
	System.out.println("Method 1");
	}
	@Test
	public void testcase2()
	{
	System.out.println("Method 2");
	}
	@AfterMethod
	public void afterClassTest()
	{
	System.out.println("***********************************************************");
	}
}
