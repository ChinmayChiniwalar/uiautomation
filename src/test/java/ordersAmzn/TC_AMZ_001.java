package ordersAmzn;

import org.testng.annotations.Test;

import mobiles_deal.Basetesthere;
import pageobjects_amazon.Homepage;

public class TC_AMZ_001 extends Basetesthere{

	@Test
	public void choclateorder() {
		
		Homepage hp=login();
		hp.searchitem("choclate");
		
		
		
		
		
	}
	
	
	
}
