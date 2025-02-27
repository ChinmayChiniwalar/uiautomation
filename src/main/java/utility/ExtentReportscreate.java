package utility;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentReporter;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportscreate {
	public ExtentReports Reports () {
	String timestamp= new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
	
	File reportfile=new File(System.getProperty("User.dir")+"//target//Extentreport_"+timestamp+".html");

	ExtentReports extent=new ExtentReports();
	ExtentSparkReporter htmlreport=new ExtentSparkReporter(System.getProperty("User.dir")+"//target//Extentreport_"+timestamp+".html");
	
	htmlreport.config().setDocumentTitle("Amazon Test Execution Results");
	htmlreport.config().setReportName("Amazon Automation Test Report");
	htmlreport.config().setTheme(Theme.DARK);
	
	extent.setSystemInfo("QA", "Chinmay");
	extent.setSystemInfo("QA", "Edge");
	extent.setSystemInfo("Environment", "IAT");
	
	
	extent.attachReporter(htmlreport);
	
	return extent;
	}
	

}
