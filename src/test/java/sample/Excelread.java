package sample;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excelread {
	
	public static void main(String[] args) throws IOException {
		
		File f = new File("C:\\Users\\vignesh\\eclipse-workspace\\mavenproject\\excel\\sampledata.xlsx");
		
		FileInputStream f1 = new FileInputStream(f);
		
		Workbook w = new XSSFWorkbook(f1);
		Sheet s = w.getSheet("Sheet1");
		Row r = s.getRow(0);
		Cell c = r.getCell(0);
		
		;System.out.println(c);
		System.out.println("s");
		int p = r.getPhysicalNumberOfCells();
	
		int ro = s.getPhysicalNumberOfRows();
		
		for (int i = 0; i < p; i++) {
			Row row = s.getRow(i);
			
			for (int j = 0; j<ro; j++) {
				Cell cell = r.getCell(j);
				
		
				
			}
			
		
		
		}}
		

		
	
	}


