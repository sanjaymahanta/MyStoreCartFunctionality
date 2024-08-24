package com.testpages;


import org.testng.annotations.Test;

import com.BaseClass.Baseclass;
import com.pages.AddCartPage;


public class Test_TC_002 extends Baseclass { // i repeated to repeat a step .Is this valid code?

	AddCartPage acp = null;

	

	@Test
	public void test002() {
		acp = new AddCartPage(driver);
		
		String[] sizes = { "1", "2", "3", "4" };
		for (String size : sizes) {
             acp.sizeSweater(size);
			acp.tabAddCart();
			acp.tabProcedCheckBtn();
		acp.back();
			

		}
		
	}

}
