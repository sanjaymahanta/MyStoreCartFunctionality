package com.Utilities;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {

	public static FileInputStream fi;
	public static FileOutputStream fo;
	public static XSSFWorkbook wb;
	public static XSSFSheet ws;
	public static XSSFRow row;
	public static XSSFCell cell;
	public static CellStyle style;

	public static int getRow(String xfile, String xlsheet) throws Exception {

		fi = new FileInputStream(xfile);
		wb = new XSSFWorkbook(fi);
		ws = wb.getSheet(xlsheet);
		int rowcount = ws.getLastRowNum();
		wb.close();
		fi.close();
		return rowcount;
	}

	public static int getCellCount(String xfile, String xlsheet, int rowNum) throws Exception {

		fi = new FileInputStream(xfile);
		wb = new XSSFWorkbook(fi);
		ws = wb.getSheet(xlsheet);
		row = ws.getRow(rowNum);
		int cellCount = row.getLastCellNum();
		wb.close();
		fi.close();
		return cellCount;

	}

	public static String getCellData(String xfile, String xlsheet, int rowNum, int colNum) throws Exception {

		fi = new FileInputStream(xfile);
		wb = new XSSFWorkbook(fi);
		ws = wb.getSheet(xlsheet);
		row = ws.getRow(rowNum);
		cell = row.getCell(colNum);

		String data;

		try {

			DataFormatter formatter = new DataFormatter();
			data = formatter.formatCellValue(cell);
		} catch (Exception e) {
			data = "";
		}

		return data;

	}
	public static void setCellData(String xfile, String xlsheet, int rowNum ,int colNum ,String data) throws Exception {

		fi = new FileInputStream(xfile);
		wb = new XSSFWorkbook(fi);
		ws = wb.getSheet(xlsheet);
		row = ws.getRow(rowNum);
		
		//readingg and wring data from  ths same xsheet
		
		cell = row.createCell(colNum);
		cell.setCellValue(data);
		fo = new FileOutputStream(xfile);
		
	
		wb.close();
		fi.close();
		fo.close();
		

	}
}
