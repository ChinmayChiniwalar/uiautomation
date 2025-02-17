package pageobjects_amazon;

import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Resultsforsearch extends Abstractcompnents {
	WebDriver driver;

	public Resultsforsearch(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//div[@role='listitem']")
	List<WebElement> resultlist;
	By productpage = By.xpath("/parent::a");

	@FindBy(xpath = "//a[@aria-label='Go to next page, page 2']")
	WebElement pagination;
	@FindBy(xpath = "//div[@role='listitem']//a//h2")
	List<WebElement> all_itemname;
	@FindBy(xpath = "//div[@role='listitem']//a")
	List<WebElement> links;

	public Productpage addtocart(String searchelements) throws InterruptedException {
		boolean product_added = false;
		String searcheditem = null;

		for (WebElement searchitem : all_itemname) {

			searcheditem = searchitem.getDomAttribute("aria-label");
			System.out.println("started fetching products one by one in for loop" + searcheditem);
			scrooltoview(searchitem);

			if (searcheditem != null && searcheditem.contains(searchelements)) {
				System.out.println("Searched element found ");

				searchitem.click();
				product_added = true;
				Productpage pp = new Productpage(driver);
				return pp;

			}

		}

//		if (product_added=true) {
//			//System.out.println(searcheditem+" :Producte added to cart");
//		}
//		if (product_added=false) {
//			
//			pagination.click();
//			addtocart(searchelements);
//			
//		}

		return null;

	}

	public void refreshpage() {

		driver.navigate().refresh();
		System.out.println("pagerefreshed");

	}

}
