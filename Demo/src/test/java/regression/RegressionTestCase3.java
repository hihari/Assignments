package regression;

import org.testng.annotations.Test;

@Test(groups= "regression")
public class RegressionTestCase3 {

	@Test
	public void loginRegression3() {
		System.out.println("This method is login regression testcase3");
	}

	@Test
	public void homeRegression3() {
		System.out.println("This method is home page regression testcase3");
	}

	@Test
	public void searchRegression3() {
		System.out.println("This method is search page regression testcase3");
	}

	@Test
	public void logoutRegression3() {
		System.out.println("This method is logout page regression testcase3");
	}
}

