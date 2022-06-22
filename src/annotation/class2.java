package annotation;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class class2 {
	@BeforeClass
	public void beforeClassTest()
	{
	System.out.println("Before class case from class2");
	}
	@Test
	public void testcase1()
	{
	System.out.println("testcase 1 from class 2");
	}
	@Test
	public void testcase2()
	{
	System.out.println("testcase 2 from class 2");
	}
	@AfterClass
	public void afterClassTest()
	{
	System.out.println("After Class case from class2");
	}
}
