package com.Utilities;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.BaseClass.Baseclass;

public class Dropdown extends Baseclass{

		 public static void selectByValue(WebElement element , String value) {
		      Select   select = new Select(element);
		        select.selectByValue(value);
	}
	

}
