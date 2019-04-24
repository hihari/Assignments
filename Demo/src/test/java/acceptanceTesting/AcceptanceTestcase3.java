package acceptanceTesting;

import org.testng.annotations.Test;

@Test(groups= "acceptanceTesting")
public class AcceptanceTestcase3 {
	@Test
	public void loginAcceptance3() {
		System.out.println("This method is login acceptance testcase3");
	}

	@Test
	public void homeAcceptance3() {
		System.out.println("This method is home page acceptance testcase3");
	}

	@Test
	public void searchAcceptance3() {
		System.out.println("This method is search page acceptance testcase3");
	}

	@Test
	public void logoutAcceptance3() {
		System.out.println("This method is logout page acceptance testcase3");
	}
}

