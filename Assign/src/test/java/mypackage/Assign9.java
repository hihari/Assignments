package mypackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assign9 {
	WebDriver driver;
	
	
	@BeforeMethod
	public void setup() {
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://demo.guru99.com/V4/");
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		new WebDriverWait(driver, 15).until((WebDriver driver) -> driver.findElement(By.name("uid")));
		
	}
	
	@DataProvider(name = "loginCredentials")
	public static Object[][] datasource() {
		return new Object[][] { { "mngr190276", "dYgurUp" },{ "mngr190276", "dYgurUp" },{ "mngr190276", "dYgurUp" }, { "Hari", "Hari" },{ "Haribc", "Hari" } };
	}
	
	@Test(dataProvider="loginCredentials")
	public void uiValidation(String uid,String pwd) {
		System.out.println("User id value from dataprovider tag is "+uid);
		driver.findElement(By.name("uid")).sendKeys(uid);
		System.out.println("Password value from dataprovider tag is "+pwd);
		driver.findElement(By.name("password")).sendKeys(pwd);
		driver.findElement(By.xpath("//input[@value='LOGIN']")).click();
		System.out.println("Login Clicked");
		
		if( uid.equals("mngr190276")) {
			System.out.println("Login credentials are valid, Home page is displayed");
			//driver.findElement(By.xpath("//a[contains(text(),'Log out')]")).click();
			
		}
		else {
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
