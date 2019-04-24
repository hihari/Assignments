package systemTesting;

import org.testng.annotations.Test;

@Test(groups= {"Firstclass","systemTesting"})
public class SystemTestCase1 {
	@Test
	public void loginSystemTesting1() {
		System.out.println("This method is login SystemTesting testcase1");
	}

	@Test
	public void homeSystemTesting1() {
		System.out.println("This method is home page SystemTesting testcase1");
	}

	@Test
	public void searchSystemTesting1() {
		System.out.println("This method is search page SystemTesting testcase1");
	}

	@Test
	public void logoutSystemTesting1() {
		System.out.println("This method is logout page SystemTesting testcase1");
	}

}

