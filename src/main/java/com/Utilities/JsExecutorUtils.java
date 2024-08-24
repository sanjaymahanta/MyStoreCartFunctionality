package com.Utilities;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import com.BaseClass.Baseclass;

public  class JsExecutorUtils extends Baseclass {

	
	public static  void scroll(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true);", element);
		
	}
	public static void clickElememnt(WebElement element) {
	element.click();
	}
}
