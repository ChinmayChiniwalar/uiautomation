package pageobjects_amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Loginpage extends Abstractcompnents {
	WebDriver driver;
	
	public Loginpage(WebDriver driver) {
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);

	}
	
	@FindBy(xpath="//input[@autocomplete='username']")WebElement mobilenumber;
	@FindBy(css=".a-button-input")WebElement continuemobilenum;
	@FindBy(id="ap_password")WebElement pwd;
	@FindBy(id="signInSubmit")WebElement loginSubmit;
	
	
	
	
	
public Homepage loginamazon(String number,String password) {
	
	visibilityofelement(mobilenumber);
	mobilenumber.sendKeys(number);
	continuemobilenum.click();
	pwd.sendKeys(password);
	loginSubmit.submit();
	Homepage hp=new Homepage(driver);
	return hp;
}
	
//	wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//input[@autocomplete='username']"))));
//	driver.findElement(By.xpath("//input[@autocomplete='username']")).sendKeys("8151041889");
//	driver.findElement(By.cssSelector(".a-button-input")).click();
//	driver.findElement(By.id("ap_password")).sendKeys("Amazon@123");
//	driver.findElement(By.id("signInSubmit")).click();


  
}
