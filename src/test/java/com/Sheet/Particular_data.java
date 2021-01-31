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

public class Particular_data {

	public static void excel() throws Throwable {

		File f = new File("C:\\Users\\Vanitha\\Desktop\\gowtham\\Sheet\\user_details.xlsx");

		FileInputStream file = new FileInputStream(f);

		Workbook wb = new XSSFWorkbook(file);

		Sheet sheetAt = wb.getSheetAt(0);

		Row row = sheetAt.getRow(3);

		Cell cell = row.getCell(0);

		CellType cellType = cell.getCellType();

		if (cellType.equals(CellType.STRING)) {

			String stringCellValue = cell.getStringCellValue();
			System.out.println(stringCellValue);

		} else if (cellType.equals(CellType.NUMERIC)) {

			double numericCellValue = cell.getNumericCellValue();
			System.out.println(numericCellValue);

		}
	}

	
	public static void main(String[] args) throws Throwable {
		excel();
	}

}
