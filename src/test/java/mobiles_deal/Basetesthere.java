package mobiles_deal;

import java.io.File;
import java.io.File.*;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.google.common.io.Files;

import pageobjects_amazon.Homepage;
import pageobjects_amazon.Loginpage;

public class Basetesthere {
	public static WebDriver driver;
	public Properties prop;

	@BeforeMethod(groups = "always")

	public void initialsetup() throws IOException {

		System.out.println(System.getProperty("user.dir"));
		prop = new Properties();
		ChromeOptions options = new ChromeOptions();
		FileInputStream fis = new FileInputStream(
				System.getProperty("user.dir") + "//src//main//resources//common.properties");
		prop.load(fis);
		String browser = prop.getProperty("Browser");
		System.out.println(browser);
		if (browser.contains("headless")) {
			options.addArguments("headless");
		}

		if (browser.contains("Chrome")) {
			driver = new ChromeDriver(options);
		} else if (browser.contains("Edge")) {
			driver = new EdgeDriver();

		}
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		System.out.println("i am before method");

	}

	@AfterMethod(groups = "always")

	public void closebrowser() {
		System.out.println("i am after test");
		driver.close();
	}

	public static String getscreenshot(String testcasename) {

		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File target = new File("C://Users//Chinmay//eclipse-workspace//Amazon_Deals" + testcasename + ".png");
		try {
			FileUtils.copyFile(src, target);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "C://Users//Chinmay//eclipse-workspace//Amazon_Deals" + testcasename + ".png";

	}

	public Homepage login() {
		Homepage hp = new Homepage(driver);
		Loginpage login = hp.gotologinpage();
		String username = prop.getProperty("usernumber");
		String password = prop.getProperty("userpassword");

		hp = login.loginamazon(username, password);
		return hp;
	}

}
