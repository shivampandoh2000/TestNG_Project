package annotation;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class group {
	@BeforeGroups(groups = "Operations")
	public void beforeClassTest()
	{
	System.out.println("Performing the operation below");
	}
	@Test(groups = "Group1")
	public void testcase1()
	{
	System.out.println("This test case does not belong to any group");
	}
	@Test(groups = {"Operations"})
	public void addition()
	{
		int x = 2+5;
	System.out.println("Add 2 & 5 = " + x);
	}
	@Test(groups = {"Operations"})
	public void multiply()
	{
	System.out.println("Multiply 2 & 5 = " + 2*5);
	}
	@AfterGroups(groups = "Operations")
	public void afterClassTest()
	{
	System.out.println("----------------------------Operation performed----------------------------");
	}
}
