package pageobjects_amazon;

import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Productpage extends Abstractcompnents{
	WebDriver driver;
	public Productpage(WebDriver driver) {
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath ="//div[@class='a-section a-spacing-none a-padding-none']//input[@id='add-to-cart-button']")WebElement addtocartbutton;
	
	@FindBy(xpath="//span[@id='nav-cart-count']")WebElement countcart;
	@FindBy(xpath ="//h4[contains(@class, 'a-alert-heading') and contains(text(), 'Added to cart')]")WebElement confirmation;
	public void addtocart() throws InterruptedException {
		Set<String> windows=driver.getWindowHandles();
		String parentwindow=driver.getWindowHandle();
		for(String handle:windows) {
			if(handle!=parentwindow) {
				driver.switchTo().window(handle);
			}
		}
		System.out.println("i am in product page");
		scrooltoview(addtocartbutton);
		elementtobeclickable(addtocartbutton);
		System.out.println(countcart.getText());
		scrooltoview(countcart);
		addtocartbutton.click();
		Thread.sleep(10000);
		//visibilityofelement(confirmation);
		Resultsforsearch rs=new Resultsforsearch(driver);
		rs.refreshpage();
		
		System.out.println(countcart.getText());
		
		driver.close();
		System.out.println("addedtocart now see-------");
		driver.switchTo().window(parentwindow);
		
	
	
	}	

}
