package datadriven;

import java.io.File;
import java.io.FileInputStream;

import java.io.IOException;
import java.sql.Date;
import java.text.SimpleDateFormat;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read {
	public static void main(String[] args) throws IOException {
		File loc = new File(System.getProperty("user.dir") + "\\sheet\\New Microsoft Excel Worksheet.xlsx");
		FileInputStream in = new FileInputStream(loc);
		Workbook w = new XSSFWorkbook(in);
		Sheet s = w.getSheet("Sheet1");
		Row r = s.getRow(1);
		Cell c = r.getCell(4);
		System.out.println(c);
		int type = c.getCellType();
		if (type == 1) {
			String stringCellValue = c.getStringCellValue();
			System.out.println(stringCellValue);
		} else if (type == 0) {
			if (DateUtil.isCellDateFormatted(c)) {
				java.util.Date dateCellValue = c.getDateCellValue();
				System.out.println(dateCellValue);
				SimpleDateFormat sd = new SimpleDateFormat("dd/MM/yyyy");
				String val = sd.format(dateCellValue);
				System.out.println("date:" + val);
			} else {
				double numericCellValue = c.getNumericCellValue();
				long l = (long) numericCellValue;
				String stringValue = String.valueOf(l);
				System.out.println(stringValue);
			}
		}
		// to print all the value
	for (int i = 0; i < s.getPhysicalNumberOfRows(); i++) {
		Row row = s.getRow(i);
		
for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {
	Cell cell = row.getCell(j);
	System.out.println(cell);
}
	}
	}
}
