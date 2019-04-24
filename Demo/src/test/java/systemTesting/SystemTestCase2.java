package systemTesting;

import org.testng.annotations.Test;

@Test(groups= "systemTesting")
public class SystemTestCase2 {
	@Test
	public void loginSystemTesting2() {
		System.out.println("This method is login SystemTesting testcase2");
	}

	@Test
	public void homeSystemTesting2() {
		System.out.println("This method is home page SystemTesting testcase2");
	}

	@Test
	public void searchSystemTesting2() {
		System.out.println("This method is search page SystemTesting testcase2");
	}

	@Test
	public void logoutSystemTesting2() {
		System.out.println("This method is logout page SystemTesting testcase2");
	}
}

