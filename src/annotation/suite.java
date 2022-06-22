package annotation;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class suite {
	@AfterSuite
	public void afterSuiteTest()
	{
		System.out.println("After Suite Test case");
	}
	@Test
	public void testcase1()
	{
		System.out.println("Business logic for test case 1");
	}
	@Test
	public void testcase2()
	{
		System.out.println("Business logic for test case 2");
	}
	@BeforeSuite
	public void beforeSuiteTest()
	{
		System.out.println("Before Suite Test case");
	}
}

