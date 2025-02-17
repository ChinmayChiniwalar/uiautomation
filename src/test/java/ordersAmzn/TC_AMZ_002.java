package ordersAmzn;

import org.testng.Assert;
import org.testng.annotations.Test;

import mobiles_deal.Basetesthere;
import pageobjects_amazon.Homepage;
import pageobjects_amazon.Productpage;
import pageobjects_amazon.Resultsforsearch;

public class TC_AMZ_002 extends Basetesthere {

	@Test(groups = { "smoke" })
	public void orderphone() throws InterruptedException {
		Homepage hp = login();
		Resultsforsearch rs = hp.searchitem("Redmi Note 12 Pro 5G (Onyx Black, 12GB RAM, 256GB Storage)");

		Productpage pp = rs.addtocart("Redmi Note 12 Pro 5G (Onyx Black, 12GB RAM, 256GB Storage)");
		pp.addtocart();
		rs.refreshpage();

	}

}
