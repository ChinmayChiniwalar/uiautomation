package mobiles_deal;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import pageobjects_amazon.Electronicspage;
import pageobjects_amazon.Homepage;
import pageobjects_amazon.Loginpage;
import pageobjects_amazon.Subhover;

public class orderlaptops extends Basetesthere {
	
	@Test (dataProvider="logindata",priority=2,groups= {"smoke"})
	public void orderusinghover(String username,String password) {
		try {
		Homepage hp = new Homepage(driver);
		Loginpage login = hp.gotologinpage();
		hp = login.loginamazon(username, password);
		Electronicspage ep=hp.secelectmaincategory("Electronics");
		Subhover hover=ep.elctronicssubmousehover("Laptops & Accessories");
		Boolean clicked=hover.clickonhoverelement("Lenovo");
		SoftAssert soft=new SoftAssert();
		if(clicked) {
		System.out.println("laptoporderd");
		}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		
		
	}
	
	
	@DataProvider(name="logindata")
	public String[][] getdata() {
		
		String[][] mycredentials= {{"8151041889","Amazon@123"}};
		return mycredentials;
	}

}
