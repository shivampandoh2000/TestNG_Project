package testngXML;

import org.testng.annotations.Test;

public class Group2 {
	@Test
	public void test1() // First test case.
	{
	System.out.println("group 2, login 1");
	}
	@Test(groups = "GroupTestCase")
	public void test2() // Second test case.
	{
	System.out.println("group 2, login 2");
	}
}
