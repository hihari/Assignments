package regression;

import org.testng.annotations.Test;

@Test(groups= "regression")
public class RegressionTestCase2 {
	@Test
	public void loginRegression2() {
		System.out.println("This method is login regression testcase2");
	}

	@Test
	public void homeRegression2() {
		System.out.println("This method is home page regression testcase2");
	}

	@Test
	public void searchRegression2() {
		System.out.println("This method is search page regression testcase2");
	}

	@Test
	public void logoutRegression2() {
		System.out.println("This method is logout page regression testcase2");
	}

}

