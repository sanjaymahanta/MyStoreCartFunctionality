package com.pages;

import java.io.FileInputStream;

import org.apache.poi.common.usermodel.Hyperlink;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.Utilities.AssertUtils;
import com.Utilities.DynamicPrice;
import com.Utilities.HyperLInksUtils;
import com.Utilities.WaitUtils;

public class ShoppingCartPage {

	@FindBy(xpath = "(//i[starts-with(@class,'material')]//parent::button)[1]")
	WebElement up;

	@FindBy(xpath = "(//i[starts-with(@class,'material')]//parent::button)[2]")
	WebElement down;

	@FindBy(xpath = "//span[@class='product-price']")
	WebElement CartPrice;

	@FindBy(xpath = "(//span[@class='value'])[2]")
	WebElement BillPrice;

	@FindBy(id = "notifications")
	WebElement msgMaxLimitCart;

	@FindBy(name = "product-quantity-spin")
	WebElement quantityBox;
	
	@FindBy(name = "email")
	WebElement eText;
	
	@FindBy(xpath = "//input[@value='Subscribe']")
	WebElement subscribe;
	
	@FindBy(xpath = "//a[text()='Proceed to checkout']")
	WebElement tabCheckout;
	

	public ShoppingCartPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void increaseQuantity() {
		WaitUtils.waitElement(up);
		up.click();
	}

	public void decreaseQuantity() {
		WaitUtils.waitElement(down);
		down.click();
	}

	public void checkPrice(int quantity) {             
		WaitUtils.waitElement(BillPrice);
		DynamicPrice.high(CartPrice, BillPrice, quantity);

	}

	public void checkMessage() {
		WaitUtils.waitElement(msgMaxLimitCart);
		AssertUtils.display(msgMaxLimitCart);

	}

	public void messageIsEqual(String expected) {
		WaitUtils.waitElement(msgMaxLimitCart);
		AssertUtils.compare(msgMaxLimitCart, expected);

	}

	public void cartQuantityBox(String quantity) {
		quantityBox.sendKeys(quantity);
	}
	
	public void emailTextBox(String email) {
		eText.sendKeys(email);
	}
	
	public void tabSubscribe() {
		subscribe.click();
	}
	
	public void verifyLinks() {
		HyperLInksUtils.accesLinks();
	}
	
	
	public void proceddToCheckout() {
		tabCheckout.click();
	}
	
	public void readExcel() throws Exception{
		
                 DataFormatter df = new DataFormatter();
		        FileInputStream fis = new FileInputStream("Practice.xlsx");
		        Workbook wb = WorkbookFactory.create(fis);
		        Sheet sh = wb.getSheet("Practice");
		        int rows = sh.getLastRowNum();

		        for (int i = 0; i <= rows; i++) {
		            int cols = sh.getRow(i).getLastCellNum();

		            for (int j = 0; j < cols; j++) { // Updated to avoid ArrayIndexOutOfBoundsException
		                Cell c = sh.getRow(i).getCell(j);
		                System.out.println(df.formatCellValue(c)+ " ");
		       
		                }
		            }
		            System.out.println();
		        }
	
	}
		       
		    
	
