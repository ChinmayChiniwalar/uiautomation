package pageobjects_amazon;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.idealized.Javascript;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Abstractcompnents {
    
	WebDriver driver;

	public Abstractcompnents(WebDriver driver) {
		super();
		this.driver = driver;
	}
	
	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
	
	public void visibilityofelement(WebElement elementname) {
		
		wait.until(ExpectedConditions.visibilityOf(elementname));
			
	}
	
	public void selectbyvisibletext(WebElement dropdowntobe,String category) {
		Select dropdown =new Select(dropdowntobe);
		dropdown.selectByVisibleText(category);
		
	}
	
	public void scrooltoview(WebElement element) {
		
		JavascriptExecutor js =(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true);", element);
	}
	
	public void visibilityofallelements(List<WebElement> elementname) {
		
		wait.until(ExpectedConditions.visibilityOfAllElements(elementname));
	}
	
	
	
	
}
