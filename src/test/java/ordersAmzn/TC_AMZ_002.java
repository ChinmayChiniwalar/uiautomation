package ordersAmzn;

import org.testng.annotations.Test;

import mobiles_deal.Basetesthere;
import pageobjects_amazon.Homepage;

public class TC_AMZ_002 extends Basetesthere{
	
	@Test (groups= {"smoke"})
	public  void orderphone() {
		Homepage hp=login();
		hp.searchitem("Redmi note 12 pro");
		
		
		
		
		
		
		
		
	}

}
