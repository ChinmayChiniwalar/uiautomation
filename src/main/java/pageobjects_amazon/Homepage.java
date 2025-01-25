package pageobjects_amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Homepage extends Abstractcompnents{
	WebDriver driver;

	public Homepage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="//span[@id='nav-link-accountList-nav-line-1']")WebElement signin;
	@FindBy(xpath="//span[@id='nav-link-accountList-nav-line-1']")WebElement account;
	@FindBy(id="searchDropdownBox")WebElement allcategoriesdropdown;
	@FindBy(id="nav-search-submit-button")WebElement searchbutton;
	
//System.out.println(driver.findElement(By.xpath("//span[@id='nav-link-accountList-nav-line-1']")).getText());
//driver.findElement(By.xpath("//span[@id='nav-link-accountList-nav-line-1']")).click();
//	WebElement categoriesdp = driver.findElement(By.id("searchDropdownBox"));
//	Select dropdown = new Select(categoriesdp);
//	dropdown.selectByVisibleText("Electronics");
	
	//driver.findElement(By.id("nav-search-submit-button")).click();
	public Loginpage gotologinpage() {
		
		signin.click();
		Loginpage lp=new Loginpage(driver);
		return lp;
		
	}
	
	public String verifyaccount() {
		return account.getText();
	}
	
	public Electronicspage secelectmaincategory(String category) {
		
//		Select dropdown=new Select(allcategoriesdropdown);
//		dropdown.selectByVisibleText("category");
		selectbyvisibletext(allcategoriesdropdown, category);
		searchbutton.click();
		Electronicspage electronics=new Electronicspage(driver);
		return electronics; 
		
	}
	
	
	
}
