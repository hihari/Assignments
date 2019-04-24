package sanity;

import org.testng.annotations.Test;

@Test(groups= "sanity")
public class SanityTestCase3 {
	
	@Test
	public void loginSanity3() {
		System.out.println("This method is login sanity testcase3");
	}

	@Test
	public void homeSanity3() {
		System.out.println("This method is home page sanity testcase3");
	}

	@Test
	public void searchSanity3() {
		System.out.println("This method is search page sanity testcase3");
	}

	@Test
	public void logoutSanity3() {
		System.out.println("This method is logout page sanity testcase3");
	}

}

