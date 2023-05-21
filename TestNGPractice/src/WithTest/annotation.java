package WithTest;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class annotation {

	@Test(priority = 1, groups = "regression")

	public void testngpractice() {
		System.out.println("hello");
	}

	@BeforeClass
	public void beforeClass() {
		System.out.println("this is beforeclass annotation");
	}

	@AfterClass
	public void afterClass() {
		System.out.println("this is afterclass annotation");
	}

	@BeforeGroups(value = "regression")
	public void beforeGroup() {
		System.out.println("this is beforegroup for regression");
	}

	@Test(priority = 2, groups = "bvt")
	public void dummy1() {
		System.out.println("dummy1");
	}

	@Test(priority = 4, groups = { "regression", "bvt" })
	public void dummy2() {
		System.out.println("dummy2");
	}

	@Test(priority = 3, groups = "bvt")
	public void dummy3() {
		System.out.println("dummy3");
	}

	@Test(priority = 1, groups = "regression")

	public void testngpro() {
		System.out.println("helloo2");
	}
}
