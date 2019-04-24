package mypackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assign7 {
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
	public void uiValidation() {
		String title =driver.getTitle();
		if (title.equals("Guru99 Bank Home Page")) {
			System.out.println("Title is :"+title);
		}
		else {
			System.out.println("Title is :"+title);
		}
		
		if(driver.findElement(By.name("uid")).isDisplayed()) {
			System.out.println("User id field is displayed");
		}
		else
		{
			System.out.println("User id field is not displayed");
		}
		
		if(driver.findElement(By.name("password")).isDisplayed()) {
			System.out.println("Password field is displayed");
		}
		else
		{
			System.out.println("Password field is not displayed");
		}
		
		if(driver.findElement(By.xpath("//input[@value='LOGIN']")).isDisplayed()) {
			System.out.println("Login button is displayed");
		}
		else
		{
			System.out.println("Login button is not displayed");
		}
		if(driver.findElement(By.xpath("//input[@value='RESET']")).isDisplayed()) {
			System.out.println("Reset button is displayed");
		}
		else
		{
			System.out.println("Reset button is not displayed");
		}
	}
	
	@AfterMethod
	public void closeBrowser() {
		driver.quit();
	}

}
