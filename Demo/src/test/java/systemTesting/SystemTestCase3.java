package systemTesting;

import org.testng.annotations.Test;

@Test(groups= "systemTesting")
public class SystemTestCase3 {
	@Test
	public void loginSystemTesting3() {
		System.out.println("This method is login SystemTesting testcase3");
	}

	@Test
	public void homeSystemTesting3() {
		System.out.println("This method is home page SystemTesting testcase3");
	}

	@Test
	public void searchSystemTesting3() {
		System.out.println("This method is search page SystemTesting testcase3");
	}

	@Test
	public void logoutSystemTesting3() {
		System.out.println("This method is logout page SystemTesting testcase3");
	}
}

