package regression;

import org.testng.annotations.Test;

@Test(groups= {"Firstclass","regression"})
public class RegressionTestCase1 {

	@Test
	public void loginRegression1() {
		System.out.println("This method is login regression testcase1");
	}

	@Test
	public void homeRegression1() {
		System.out.println("This method is home page regression testcase1");
	}

	@Test
	public void searchRegression1() {
		System.out.println("This method is search page regression testcase1");
	}

	@Test
	public void logoutRegression1() {
		System.out.println("This method is logout page regression testcase1");
	}
	
}
