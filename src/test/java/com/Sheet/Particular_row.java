package com.Sheet;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Particular_row {
	public static void row() throws Throwable {

		File f = new File("C:\\Users\\Vanitha\\Desktop\\gowtham\\Sheet\\user_details.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fis);
		Sheet sheet = wb.getSheet("datas");
		Row row = sheet.getRow(0);
		for (int i = 0; i < row.getPhysicalNumberOfCells(); i++) {
			Cell cell = row.getCell(i);

			CellType cellType = cell.getCellType();
			if (cellType.equals(CellType.STRING)) {
				String stringCellValue = cell.getStringCellValue();
				System.out.println(stringCellValue);
			} else if (cellType.equals(CellType.NUMERIC)) {
				double numericCellValue = cell.getNumericCellValue();
				int value = (int) numericCellValue;
				System.out.println(value);
			}
		}
	}

	public static void main(String[] args) throws Throwable {
		row();
	}
}
