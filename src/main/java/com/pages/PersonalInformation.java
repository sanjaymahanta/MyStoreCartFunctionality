package com.pages;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Utilities.NavigateUtils;
import com.Utilities.WaitUtils;

public class PersonalInformation {

	@FindBy(id = "field-id_gender-1")
	WebElement gender;

	@FindBy(id = "field-firstname")
	WebElement firstName;

	@FindBy(id = "field-lastname")
	WebElement lastName;

	@FindBy(id = "field-email")
	WebElement email;

	@FindBy(id = "field-password")
	WebElement password;

	@FindBy(name = "continue")
	WebElement tabContinue;

	@FindBy(xpath = "(//input[@type='checkbox']//following::span)[2]")
	WebElement terms;

	@FindBy(xpath = "(//input[@type='checkbox']//following::span)[6]")
	WebElement privacy;

	public PersonalInformation(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void genderSelction() {
		gender.click();

	}

	public void fillForm() throws Exception {
		WaitUtils.waitElement(firstName);
		DataFormatter df = new DataFormatter();
		FileInputStream fis = new FileInputStream("Practice.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet("Practice");

		int rowCount = sh.getLastRowNum();
		int columnCount = sh.getRow(0).getLastCellNum();

		for (int i = 0; i <= rowCount; i++) {
			Row row = sh.getRow(i);
			if (row != null) {
				for (int j = 0; j < columnCount; j++) {
					Cell cell = row.getCell(j);
					String cellValue = df.formatCellValue(cell);

					switch (j) {
					case 0:
						firstName.clear();
						firstName.sendKeys(cellValue);
						break;
					case 1:
						lastName.clear();
						lastName.sendKeys(cellValue);
						break;
					case 2:
						email.clear();
						email.sendKeys(cellValue);
						break;
					case 3:
						password.clear();
						password.sendKeys(cellValue);
						break;

					default:
						System.out.println("No corresponding field for column index: " + j);

					}

				}
				tickCheckbox();
				clickContinue();
				Thread.sleep(3000);
			}
		}

		fis.close();
		wb.close();
	}

	public void clickContinue() {
		tabContinue.click();

		NavigateUtils.navigatebackward();
	}

	public void tickCheckbox() {
		terms.click();
		privacy.click();

	}
	public void fillFormsingledata(String fname , String lname ,String emails) {
		gender.click();
		firstName.sendKeys(fname);
		lastName.sendKeys(lname);
		email.sendKeys(emails);
		terms.click();
		privacy.click();
		tabContinue.click();
	}
	
	
}
