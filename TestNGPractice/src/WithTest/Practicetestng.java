package WithTest;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Practicetestng {
	@BeforeTest
	public void logintoapp() {
		System.out.println("bedfore test");
	}

	@AfterTest
	public void logoutapp() {
		System.out.println("logout to application");
	}
@BeforeMethod
	public void connectDB() {
		System.out.println("Connect to db");
	}
@AfterMethod
public void DisconnectDB() {
	System.out.println("disConnect to db");
}
	@Test(priority = 2, description = "this is testing of prirority")
	public void aloginTest() {
		System.out.println("Alogin is succesful");

	}

	@Test(priority = 1, description = "this is testing of prirority")
	public void blogintest() {
		System.out.println("Blogin test is succesful");
	}

}
