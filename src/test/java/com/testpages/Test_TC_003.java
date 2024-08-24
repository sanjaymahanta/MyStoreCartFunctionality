package com.testpages;


import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.BaseClass.Baseclass;
import com.pages.AddCartPage;
import com.pages.Homepage;


public class Test_TC_003 extends Baseclass{

	
	AddCartPage ac;
	Homepage hp;
	
	@BeforeSuite
	public void setup() {
		initialization();
		reportInit();
	
		
	}
	@Test
	public void test03 () throws Exception {
		hp = new Homepage(driver);
		hp.TC_001();
		ac = new AddCartPage(driver);
		ac.sizeSweater("2");
	ac.quantity("7");
     ac.tabAddCart();
        ac.tabProcedCheckBtn();
        ac.linkAccessories();
        ac.clickMug();
        ac.tabAddCart();
        ac.tabProcedCheckBtn();
        ac.linkArt();
        ac.clickFrame();
        ac.dimensionPoster("20");
        ac.tabAddCart();
        ac.tabProcedCheckBtn();
       
   
}
	//will we use thread sleep in test class or from waitUtils made implicit or explicit.
//here how can we effcientyly used .
}