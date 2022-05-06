package UtilsLayer;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {
	
	public XSSFWorkbook workbook;
	//constructor with 1 string args
	public ExcelReader(String path) {
		File f=new File(path);
		
		try {
			FileInputStream fis = new FileInputStream(f);
			 workbook=new XSSFWorkbook(fis);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	//non static method with String return type and 3 int args
	public String getDataFromExcel(int sheetIndex,int rowIndex,int columnIndex)
	{
		return workbook.getSheetAt(sheetIndex).getRow(rowIndex).getCell(columnIndex).getStringCellValue();
	}
	
	//non static method with int return type and 1 int args
	public int countTotleRows(int sheetIndex)
	{
		return workbook.getSheetAt(sheetIndex).getLastRowNum();
	}
	
	//non static method with int return type and 1 int arg 
	public int countTotleColumn(int sheetIndex)
	{
		return workbook.getSheetAt(sheetIndex).getRow(0).getLastCellNum();
	}

}
