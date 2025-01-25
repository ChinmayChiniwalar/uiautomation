package pageobjects_amazon;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Mobilespage extends Abstractcompnents {
	WebDriver driver;
	public Mobilespage(WebDriver driver) {
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
		// TODO Auto-generated constructor stub
	}
	@FindBy(xpath="//ul[@aria-labelledby='p_36-title']")WebElement pricefilter;
	@FindBy(xpath="//li/span/a/span")List<WebElement> pricelist;
	@FindBy(css="div.sg-col-20-of-24 div[role='listitem']")List<WebElement> searchresults;
	By productname=By.cssSelector("h2");
	By addtocart=By.cssSelector("button.a-button-text");
//	WebElement price = driver.findElement(By.xpath("//ul[@aria-labelledby='p_36-title']"));
//	js.executeScript("arguments[0].scrollIntoView(true);", price);
//
//	List<WebElement> pricelist = price.findElements(By.xpath("//li/span/a/span"));
//
//	for (WebElement selectprice : pricelist) {
//		if (selectprice.getText().contains("₹10,000 - ₹20,000")) {
//			selectprice.click();
//			System.out.println("clicked on price filter");
//			break;
//		}
//
//	}
	
//	List<WebElement> searchlist = driver.findElements(By.cssSelector("div.sg-col-20-of-24 div[role='listitem']"));
//	for (int i = 0; i < searchlist.size(); i++) {
//		String pnameinweb = searchlist.get(i).findElement(By.cssSelector("h2")).getAttribute("aria-label");
//		if (productlist.contains(pnameinweb)) {
//			searchlist.get(i).findElement(By.cssSelector("button.a-button-text")).click();
//			System.out.println("prodcut added to cart--->" + pnameinweb);
//}
//}
	
	public void filterMobilewithinrange(String amountrange) {
		scrooltoview(pricefilter);
	for (WebElement selectprice : pricelist) {
			if (selectprice.getText().contains(amountrange)) {
				selectprice.click();
				break;
			}
		}
	}
	
	public Cartpage orderphone(List productlist) {
		for (int i = 0; i < searchresults.size(); i++) {
			String pnameinweb = searchresults.get(i).findElement(productname).getAttribute("aria-label");
			if (productlist.contains(pnameinweb)) {
				searchresults.get(i).findElement(addtocart).click();
				
				
	}
	}
		Cartpage cartpage=new Cartpage(driver);
		return cartpage;	
		
	}

}
