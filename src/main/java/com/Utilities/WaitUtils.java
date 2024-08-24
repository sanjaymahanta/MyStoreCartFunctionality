package com.Utilities;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.BaseClass.Baseclass;

public class WaitUtils extends Baseclass {

	
  public static void waitElement( WebElement element ) {
	 WebDriverWait wait = new WebDriverWait(driver, 10);
	 wait.until(ExpectedConditions.elementToBeClickable(element));
  }
  
  public static void waitApplication() {
	 driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
  }
}
