package postexecution;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestNGListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import mobiles_deal.Basetesthere;
import utility.ExtentReportscreate;

public class Listnersclass extends Basetesthere  implements ITestListener {
	ExtentReportscreate extentreport=new ExtentReportscreate();
	ExtentTest test;
	public void onTestStart(ITestResult result) {
		ExtentReports extent=extentreport.Reports();
		test=extent.createTest(result.getClass().getName());
		System.out.println("teststarted");
		
	  }

	  public void onTestSuccess(ITestResult result) {
	    // not implemented
	  }

	  public void onTestFailure(ITestResult result) {
		  
		  System.out.println(result.getMethod().getMethodName());
		  String tagetscreenshot=Basetesthere.getscreenshot(result.getMethod().getMethodName());
		  
		  
	  }


	  public void onTestSkipped(ITestResult result) {
	    // not implemented
	  }

	  
	  public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
	    // not implemented
	  }

	 
	  public void onTestFailedWithTimeout(ITestResult result) {
	    onTestFailure(result);
	  }


	  public void onFinish(ITestContext context) {
	   
	  }
	
	

}
