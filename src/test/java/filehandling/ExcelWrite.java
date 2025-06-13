package filehandling;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelWrite {

	public static void main(String[] args) throws IOException {
		
		FileInputStream fis1= new FileInputStream("C:\\flm\\Book1.xlsx");

		XSSFWorkbook wb=new XSSFWorkbook(fis1);
		
		XSSFSheet ws=wb.getSheet("Sheet1");
		//
		//case-1: modifying an existing cell
		//ws.getRow(2).getCell(1).setCellValue("bonda");
		
		//case-2 : creating a cell in existing row
		//ws.getRow(2).createCell(1).setCellValue(789);
	
		//case-3: creating a row and cell in it
		ws.createRow(7).createCell(0).setCellValue("rest");
		
		FileOutputStream fos=new FileOutputStream("C:\\\\flm\\\\Book1.xlsx");
		wb.write(fos);
		
		wb.close();
	}

}
