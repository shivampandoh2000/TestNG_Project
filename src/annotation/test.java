package annotation;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class test {
	@AfterTest
	public void afterTest()
	{
	System.out.println("After Test case");
	}
	@Test
	public void testcase1()
	{
	System.out.println("testcase 1");
	}
	@Test
	public void testcase2()
	{
	System.out.println("testcase 2");
	}
	@BeforeTest
	public void beforeTest()
	{
	System.out.println("Before Test case");
	}
}
