package com.Utilities;

import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.BaseClass.Baseclass;

public  class DynamicPrice extends Baseclass{
	
	
	
	
	
	 public static void high(WebElement elementInitial, WebElement elementFinal, int quantity) {
	  
    String initialPriceStr = elementInitial.getText().replaceAll("[^0-9]", "");
    int initialPrice = Integer.parseInt(initialPriceStr);

   
    int expectedFinalPrice = initialPrice * quantity;

    String billPriceStr = elementFinal.getText().replaceAll("[^0-9]", "");
    int billPrice = Integer.parseInt(billPriceStr);

    
    Assert.assertEquals(billPrice, expectedFinalPrice, "The price matched.");
}
}

	

	
		
	




	


