package DataDriven;


import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WritingExcel {

	public static void main(String[] args) throws IOException {
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		FileOutputStream File=new FileOutputStream("C:\\Users\\Administrator\\eclipse-workspace\\TechqFlow\\TestData\\Employee.xlsx");
		XSSFWorkbook Workbook=new XSSFWorkbook();
		XSSFSheet Sheet=Workbook.createSheet();
		
		for(int r=0;r<5;r++)
		{
			XSSFRow currentrow=Sheet.createRow(r);
			for(int c=0;c<5;c++)
			{
				System.out.println("Enter Value:");
				String value=sc.next();
				currentrow.createCell(c).setCellValue(value);
			}
		}
		Workbook.write(File);
		Workbook.close();
		File.close();

	}

}
