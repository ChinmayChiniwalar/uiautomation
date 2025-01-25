package pageobjects_amazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Cartpage extends Abstractcompnents{
	WebDriver driver;
	public Cartpage(WebDriver driver) {
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
		// TODO Auto-generated constructor stub
	}

}
