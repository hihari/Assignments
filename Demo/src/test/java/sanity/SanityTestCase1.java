package sanity;

import org.testng.annotations.Test;

@Test(groups= {"Firstclass","sanity"})
public class SanityTestCase1 {
	@Test
	public void loginSanity1() {
		System.out.println("This method is login sanity testcase1");
	}

	@Test
	public void homeSanity1() {
		System.out.println("This method is home page sanity testcase1");
	}

	@Test
	public void searchSanity1() {
		System.out.println("This method is search page sanity testcase1");
	}

	@Test
	public void logoutSanity1() {
		System.out.println("This method is logout page sanity testcase1");
	}

}

