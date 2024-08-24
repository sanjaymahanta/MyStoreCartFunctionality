package com.testpages;







	import org.testng.annotations.BeforeSuite;
	import org.testng.annotations.Test;

	import com.BaseClass.Baseclass;
	import com.pages.AddCartPage;
	import com.pages.AddressPage;
	import com.pages.Homepage;
	import com.pages.PersonalInformation;
	import com.pages.ShipmentPage;
	import com.pages.ShoppingCartPage;

	public class Test_TC_047 extends Baseclass{

		Homepage hp;
		AddCartPage ap;
		ShoppingCartPage sp;
		PersonalInformation pi;
		AddressPage adp;
		ShipmentPage shp;

		@BeforeSuite
		public void setup() {
			initialization();
			reportInit();
		}

		@Test
		public void test022() throws Exception {
			hp = new Homepage(driver);
			hp.TC_001();
			ap = new AddCartPage(driver);
			ap.tabAddCart();
			ap.tabProcedCheckBtn();
			sp = new ShoppingCartPage(driver);
			sp.proceddToCheckout();
			pi = new PersonalInformation(driver);
			pi.fillFormsingledata("Sanjay", "kumar", "hxu9e@gmail.com");
			adp = new AddressPage(driver);
			adp.writeAddress("neyyork");
			adp.typeCity("newyork");
			adp.writePostCode("10001");
			adp.selectState();
			adp.clickContinue();
			shp = new ShipmentPage(driver);
			shp.clickContinue();
		
	}
	}


