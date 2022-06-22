package testngXML;

import org.testng.annotations.Test;

public class Group1 {
	@Test(groups = "GroupTestCase")
	public void test1() // First test case.
	{
	System.out.println("group 1, login 1");
	}
	@Test
	public void test2() // Second test case.
	{
	System.out.println("group 1, login 2");
	}
}
