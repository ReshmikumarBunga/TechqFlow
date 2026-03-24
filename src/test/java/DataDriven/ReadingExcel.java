package DataDriven;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadingExcel {

	public static void main(String[] args) throws IOException {
		FileInputStream File=new FileInputStream("C:\\Users\\Administrator\\eclipse-workspace\\TechqFlow\\TestData\\Data.xlsx");
		@SuppressWarnings("resource")
		XSSFWorkbook Workbook=new XSSFWorkbook(File);
		XSSFSheet Sheet=Workbook.getSheet("Sheet1");
		
		int totalrows=Sheet.getLastRowNum();
		int totalcells=Sheet.getRow(0).getLastCellNum();
		
		System.out.println(totalrows);
		System.out.println(totalcells);
		
		for(int r=0;r<=totalrows;r++)
		{
			XSSFRow currentrow=Sheet.getRow(r);
			for(int c=0;c<totalcells;c++)
			{
				String value=currentrow.getCell(c).toString();
				System.out.print(value+"     ");
			}
			System.out.println();
		}

	}

}
