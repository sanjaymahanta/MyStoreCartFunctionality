package com.testpages;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.BaseClass.Baseclass;
import com.pages.AddCartPage;
import com.pages.Homepage;
import com.pages.ShoppingCartPage;

public class Test_TC_018 {

	
	public class Test_TC_017 extends Baseclass {

		Homepage hp;
		AddCartPage ap;
		ShoppingCartPage sp;

		@BeforeSuite
		public void setup() {
			initialization();
			reportInit();
		}
		
		
		@Test
		public void test018() {
			hp = new Homepage(driver);
			hp.TC_001();
			ap = new AddCartPage(driver);
			ap.tabAddCart();
			ap.tabProcedCheckBtn();
			sp = new ShoppingCartPage(driver);
			sp.emailTextBox("huihgi@gmail.com");
			sp.tabSubscribe();
			
		}
		
		public void test019() {  //FOR tc_019 I WILL MKE A NEW CLASS OR JUST MAKE ANEW TEST CASE HERE BECAUSE 
			                     //
			
		}
		
		
}
}