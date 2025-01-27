package mobiles_deal;

import static org.testng.Assert.assertTrue;

import java.awt.AWTException;
import java.awt.Robot;
import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;
import pageobjects_amazon.Cartpage;
import pageobjects_amazon.Electronicspage;
import pageobjects_amazon.Homepage;
import pageobjects_amazon.Loginpage;
import pageobjects_amazon.Mobilespage;

public class LoginTest extends Basetesthere {
	String[] productname = { "OnePlus Nord CE4 Lite 5G (Super Silver, 8GB RAM, 128GB Storage)",
			"iQOO Z9x 5G (Tornado Green, 6GB RAM, 128GB Storage) | Snapdragon 6 Gen 1 with 560k+ AnTuTu Score | 6000mAh Battery with 7.99mm Slim Design | 44W FlashCharge" };
	List<String> productlist = Arrays.asList(productname);

	@Test(priority=1)
	public void validuserlogin() throws InterruptedException, Exception {

//Validation of Login with Valid credentials.		
		Homepage hp =login();
		String accountname = hp.verifyaccount();
		System.out.println("assertstartshere-----");
		//Assert.assertTrue(accountname.contains("Chinmay1"));
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertTrue(accountname.contains("Chinmay1"));
		System.out.println("assertsendhere-----------");

	}

	@Test (priority=2)
	public void ordermobilehere() {
		Homepage hp=login();
		Electronicspage ep = hp.secelectmaincategory("Electronics");
		Mobilespage mp = ep.ecletronicssubcategory("Mobiles & Accessories");
		mp.filterMobilewithinrange("₹10,000 - ₹20,000");
		Cartpage cp = mp.orderphone(productlist);
		Assert.assertTrue(true);
		

	}
	


}
