package acceptanceTesting;

import org.testng.annotations.Test;

@Test(groups= {"Firstclass", "acceptanceTesting"})
public class AcceptanceTestcase1 {

	@Test
	public void loginAcceptance1() {
		System.out.println("This method is login acceptance testcase1");
	}

	@Test
	public void homeAcceptance1() {
		System.out.println("This method is home page acceptance testcase1");
	}

	@Test
	public void searchAcceptance1() {
		System.out.println("This method is search page acceptance testcase1");
	}

	@Test
	public void logoutAcceptance1() {
		System.out.println("This method is logout page acceptance testcase1");
	}
}

