package com.testpages;



import org.testng.annotations.Test;
import com.BaseClass.Baseclass;
import com.pages.AddCartPage;



public class TestAddCartPage extends Baseclass {

    AddCartPage ac;
   
    @Test
    public void TC_001() {
    	
    	
    	ac = new AddCartPage(driver);
    	ac.sizeSweater("2");
    	ac.tabAddCart();
    	ac.tabProcedCheckBtn();
    	
    	
    }
  
   //TC_002(exception)
   // Sir in this test case  when i click on run 
   //java.lang.NullPointerException: Cannot invoke 
    //"org.openqa.selenium.SearchContext.findElement(org.openqa.selenium.By)"
   // because "this.searchContext" is null.
    
    //what is that mean?
    
}
