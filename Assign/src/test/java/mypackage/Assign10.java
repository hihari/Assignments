package mypackage;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assign10 {
	WebDriver driver;
	Properties or;

	@BeforeMethod
	public void setup() {
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://demo.guru99.com/V4/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}

	@Test()
	public void uiValidation() throws IOException {
		or = new Properties();
		FileInputStream file = new FileInputStream(System.getProperty("user.dir") +"/properties/config.properties");
		or.load(file);
		System.out.println("User id value from Properties file is " + or.getProperty("uid"));
		driver.findElement(By.name("uid")).sendKeys(or.getProperty("uid"));
		System.out.println("Password value from properties file is " + or.getProperty("pwd"));
		driver.findElement(By.name("password")).sendKeys(or.getProperty("pwd"));
		driver.findElement(By.xpath("//input[@value='LOGIN']")).click();
		System.out.println("Login Clicked");

		if (or.getProperty("uid").equals("mngr190276")) {
			System.out.println("Login credentials are valid, Home page is displayed");
			// driver.findElement(By.xpath("//a[contains(text(),'Log out')]")).click();

		} else {
			Alert alert = driver.switchTo().alert();
			alert.accept();
			System.out.println("Invalid Login credentials");
		}

	}

	@AfterMethod
	public void closeBrowser() {
		driver.quit();
	}

}
