package filehandling;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead {

	public static void main(String[] args) throws IOException {
		
		FileInputStream fis1= new FileInputStream("C:\\flm\\Book1.xlsx");

		XSSFWorkbook wb=new XSSFWorkbook(fis1);
		
		XSSFSheet ws=wb.getSheet("Sheet1");
		
		int lrn=ws.getLastRowNum();
		
		System.out.println(lrn);
		//retriving including header row
		
		int noofrows=ws.getPhysicalNumberOfRows();
		System.out.println(noofrows);
		
		//to retrive row
		XSSFRow row=ws.getRow(0);
		int lastCellNum=row.getLastCellNum();
		System.out.println("lastCellNum"+lastCellNum);
		//to retrive cells
		int physicalNumberOfCells=row.getPhysicalNumberOfCells();
				System.out.println("physicalNumberOfCells"+physicalNumberOfCells);
				//to focus on single cell
				XSSFCell cell=row.getCell(0);
				System.out.println(cell);
				
		wb.close();
	}

}
