package annotation;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class class1 {
	@AfterClass
	public void afterClassTest()
	{
	System.out.println("After class case from class1");
	}
	@Test
	public void testcase1()
	{
	System.out.println("testcase 1 from class1");
	}
	@Test
	public void testcase2()
	{
	System.out.println("testcase 2 from class1");
	}
	@BeforeClass
	public void beforeClassTest()
	{
	System.out.println("Before Class case from class1");
	}
}
