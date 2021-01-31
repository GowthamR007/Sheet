package com.Sheet;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class all_data {
	public static void alldatas() throws Throwable {
		File f1 = new File("C:\\Users\\Vanitha\\Desktop\\gowtham\\Sheet\\user_details.xlsx");
		FileInputStream fis1 = new FileInputStream(f1);
		Workbook wb1 = new XSSFWorkbook(fis1);
		Sheet sheetAt = wb1.getSheet("datas");
		for (int i = 0; i < sheetAt.getPhysicalNumberOfRows(); i++) {
			Row row = sheetAt.getRow(i);

			for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {
				Cell cell = row.getCell(j);

				CellType cellType = cell.getCellType();

				if (cellType.equals(CellType.STRING)) {
					String stringCellValue = cell.getStringCellValue();
					System.out.println(stringCellValue);
				} else if (cellType.equals(CellType.NUMERIC)) {
					double numericCellValue = cell.getNumericCellValue();
					int value=(int)numericCellValue;
					System.out.println(value);
				}

			}
		}
	}

	public static void main(String[] args) throws Throwable {
		alldatas();
	}
}
