package acceptanceTesting;

import org.testng.annotations.Test;

@Test(groups= "acceptanceTesting")
public class AcceptanceTestcase2 {

	@Test
	public void loginAcceptance2() {
		System.out.println("This method is login acceptance testcase2");
	}

	@Test
	public void homeAcceptance2() {
		System.out.println("This method is home page acceptance testcase2");
	}

	@Test
	public void searchAcceptance2() {
		System.out.println("This method is search page acceptance testcase2");
	}

	@Test
	public void logoutAcceptance2() {
		System.out.println("This method is logout page acceptance testcase2");
	}
}

