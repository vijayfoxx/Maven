package utils;

import java.io.IOException;


import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {
	

	public static String[][] getExcelData(String fileName) throws IOException {
	//String fileLocation="./test-data/Login-data.xlsx";
	XSSFWorkbook wbook=new XSSFWorkbook("./data/"+fileName+".xlsx");
	XSSFSheet sheet=wbook.getSheetAt(0);
	int lr = sheet.getLastRowNum();//exclude header
	int plr = sheet.getPhysicalNumberOfRows();//include header
	System.out.println(lr+"+"+plr);
	short lc = sheet.getRow(0).getLastCellNum();
	String[][] data=new String[lr][lc];
	for (int i = 1; i <= lr; i++) {
		XSSFRow row = sheet.getRow(i);
		for (int j = 0; j < lc; j++) {
			XSSFCell cell = row.getCell(j);
			DataFormatter dt=new DataFormatter();
			String value = dt.formatCellValue(cell);
			//String value = cell.getStringCellValue();
			//System.out.println(value);
			data[i-1][j]=value;
		} 
	}
	wbook.close();
	return data;
	}

}
