package mypack;

import java.io.IOException;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class Extenthelper {
	
	public static ExtentReports extent;
	public ExtentTest test;
	
	@BeforeSuite
	public static ExtentReports getExtent() {
		if(extent != null) {
			return extent;
		}
		else {
			extentHelp();
			return extent;
		}
	}
	
	
	public static void extentHelp() {
		ExtentHtmlReporter htmlreporter = new ExtentHtmlReporter(System.getProperty("user.dir")+"/reports/extent.html");
		extent = new ExtentReports();
		extent.attachReporter(htmlreporter);
		
	
	}
	
	@BeforeClass
	public void getExtentTest() {
		test = extent.createTest(getClass().getName());
	}

	
	@AfterMethod
	public void extentListner(ITestResult result) throws IOException {
		
		switch(result.getStatus()) {
		
		case ITestResult.SUCCESS:
			test.log(Status.PASS,result.getName()+" :Passed");
			break;
		case ITestResult.FAILURE:
			//test.log(Status.FAIL,result.getName()+" "+ result.getThrowable()+" :Failed"+MediaEntityBuilder.createScreenCaptureFromPath(System.getProperty("user.dir")+"/reports/2200 AWT REQ 2.2.2.4.20 TOO MANY EFFS.png").build());
			test.fail("test is failed").addScreenCaptureFromPath(System.getProperty("user.dir")+"/reports/2200 AWT REQ 2.2.2.4.20 TOO MANY EFFS.png");
			break;
			
		default :
			test.log(Status.SKIP, result.getThrowable()+"Skip");
			
		
		}
	extent.flush();
		
	}
	
	
	
	
}
