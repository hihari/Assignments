package mypackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assign8 {
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
	@Parameters({"userId","password"})
	public void uiValidation(String uid,String pwd) {
		System.out.println("User id value from Parameter tag is "+uid);
		driver.findElement(By.name("uid")).sendKeys(uid);
		System.out.println("Password value from Parameter tag is "+pwd);
		driver.findElement(By.name("password")).sendKeys(pwd);
		driver.findElement(By.xpath("//input[@value='LOGIN']")).click();
		System.out.println("Login Clicked");
		Alert alert = driver.switchTo().alert();
		alert.accept();
		System.out.println("Invalid Login");
	}
	
	@AfterMethod
	public void closeBrowser() {
		driver.quit();
	}

}
