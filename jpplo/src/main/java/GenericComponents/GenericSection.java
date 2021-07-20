package GenericComponents;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class GenericSection {
	
	public void ExcelRead(String sheetname) {
		
		File inputexcel = new File("C:\\Users\\RamMahi\\eclipse-workspace\\jpplo\\src\\main\\java\\DataProvider/InputData.xlsx");
		try {
			FileInputStream fis = new FileInputStream(inputexcel);
			XSSFWorkbook wb = new XSSFWorkbook(fis);
			XSSFSheet sh = wb.getSheet(sheetname);
			Row row;
			Cell cell;
			
			Iterator<Row> itr = sh.iterator();
			while(itr.hasNext())
			{
				row = itr.next();
				
				Iterator<Cell> celliterator = row.iterator();
				 while(celliterator.hasNext())
				 {
					  cell = celliterator.next();
					 
				 }
				
				
			}
			
			
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}
