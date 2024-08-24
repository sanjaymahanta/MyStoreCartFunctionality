package com.Utilities;



import org.openqa.selenium.WebElement;

import org.testng.asserts.SoftAssert;

import com.BaseClass.Baseclass;

public class AssertUtils extends Baseclass {
  
	
	public  static void display(WebElement element ) {
		SoftAssert softassert = new SoftAssert();
		softassert.assertTrue(element.isDisplayed());
	}
	
	public static void compare(WebElement element ,String expected) {
		SoftAssert softassert = new SoftAssert();
		softassert.assertEquals(element.getText(), expected);
	}
	
}
