package testngXML;

import org.testng.annotations.Test;

public class ExcludeUsingAnnote {
	@Test
	public void test1() // First test case.
	{
	System.out.println("exclude using annote test1");
	}
	@Test(enabled = false)
	public void test2() // Second test case.
	{
	System.out.println("exclude using annote test2");
	}
}
