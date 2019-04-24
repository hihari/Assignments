package sanity;

import org.testng.annotations.Test;

@Test(groups= "sanity")
public class SanityTestCase2 {
	@Test
	public void loginSanity2() {
		System.out.println("This method is login sanity testcase2");
	}

	@Test
	public void homeSanity2() {
		System.out.println("This method is home page sanity testcase2");
	}

	@Test
	public void searchSanity2() {
		System.out.println("This method is search page sanity testcase2");
	}

	@Test
	public void logoutSanity2() {
		System.out.println("This method is logout page sanity testcase2");
	}
}
