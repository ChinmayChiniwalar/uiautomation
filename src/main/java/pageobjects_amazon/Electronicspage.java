package pageobjects_amazon;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Electronicspage extends Abstractcompnents {
WebDriver driver;
	public Electronicspage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//div[@id='nav-subnav']/a")
	List<WebElement> allelectronics;
	@FindBy(xpath="a[href='/s/ref=mega_elec_s23_2_2_1_2?rh=i%3Acomputers%2Cn%3A4363894031&ie=UTF8']")WebElement lenovo;
	
	@FindBy(xpath="a[href='/s/ref=mega_elec_s23_2_2_1_2?rh=i%3Acomputers%2Cn%3A4363894031&ie=UTF8']")WebElement Laptops_and_accesories;
//	List<WebElement> electronics = driver.findElements(By.xpath("//div[@id='nav-subnav']/a"));
//
//	for (WebElement electronic : electronics) {
//
//		System.out.println(electronic.getText());
//		if (electronic.getText().equalsIgnoreCase("Mobiles & Accessories")) {
//			electronic.click();
//			break;
//		}
//
//	}
	public Subhover elctronicssubmousehover(String movetoelement) {
		
		Actions act=new Actions(driver);
		for (WebElement electronic : allelectronics) {
			
			
			if (electronic.getText().equalsIgnoreCase(movetoelement)) {
				act.moveToElement(electronic).build().perform();
				Subhover hover=new Subhover(driver);
				return hover;
				
			}
			
		}
		
		return null;
		
	}

	public Mobilespage ecletronicssubcategory(String electroniccategory) {
		for (WebElement electronic : allelectronics) {
			
					
					if (electronic.getText().equalsIgnoreCase(electroniccategory)) {
						electronic.click();
						break;
					}
			
		
	}
	
	Mobilespage mobilepage=new Mobilespage(driver);
	return mobilepage;
	}

}
