package mypackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assign6 {
	WebDriver driver;
	
	@BeforeMethod
	public void setup() {
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://demo.guru99.com/V4/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@Test
	public void titleValidation() {
		String title =driver.getTitle();
		if (title.equals("Guru99 Bank Home Page")) {
			System.out.println("Title is :"+title);
		}
		else {
			System.out.println("Title is :"+title);
		}
	}
	
	@AfterMethod
	public void closeBrowser() {
		driver.quit();
	}

}
