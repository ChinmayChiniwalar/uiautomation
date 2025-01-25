package pageobjects_amazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class LaptopPage extends Abstractcompnents{
	WebDriver driver;
	public LaptopPage(WebDriver driver) {
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
	
	}
	
	
	
	

}
