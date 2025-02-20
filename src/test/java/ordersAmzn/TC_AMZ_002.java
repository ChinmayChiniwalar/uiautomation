package ordersAmzn;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import mobiles_deal.Basetesthere;
import pageobjects_amazon.Homepage;
import pageobjects_amazon.Productpage;
import pageobjects_amazon.Resultsforsearch;
import utility.Excelutility;

public class TC_AMZ_002 extends Basetesthere {

	@Test(groups = { "smoke" })
	public void orderphone() throws InterruptedException, IOException {
		Homepage hp = login();
		int rowcount =Excelutility.getRowCount(xlfilename, xlsheetname);
		
		for(int i=1;i<=rowcount;i++) {
		String productdata=Excelutility.getcelldata(xlfilename, xlsheetname, i, 1);
		Resultsforsearch rs = hp.searchitem(productdata);

		Productpage pp = rs.addtocart(productdata);
		
		pp.addtocart();
		rs.refreshpage();
		hp.clearsearch();
	}

}
}
