package pageobjects_amazon;

import static org.testng.Assert.assertTrue;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Subhover extends Abstractcompnents {
	WebDriver driver;
	public Subhover(WebDriver driver) {
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);	
	}
	
	@FindBy(xpath="a[href='/s/ref=mega_elec_s23_2_2_1_2?rh=i%3Acomputers%2Cn%3A4363894031&ie=UTF8']")WebElement lenovo;
	
	@FindBy(xpath="//h1/b")List<WebElement> headers;
	
	
	public boolean clickonhoverelement (String movetoelement) {
		lenovo.click();
		
		visibilityofallelements(headers);
		for(WebElement header:headers) {
			
			if(header.getText().contains(movetoelement)) {
				return true;
			}
		}
		return false;
	}
	
	
	
	
	
	

}
