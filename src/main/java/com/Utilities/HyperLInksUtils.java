package com.Utilities;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.BaseClass.Baseclass;

public class HyperLInksUtils extends Baseclass {

	
	public static void accesLinks() {
		List <WebElement> listLIninks = driver.findElements(By.tagName("a"));
		for (WebElement link:listLIninks) {
			System.out.println(link.getText());
		}
	}
}
