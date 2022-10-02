package week5.day2;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelData2 {

	public static void main(String[] args) throws IOException {
		
		// Step 1: Go to the workbook
		XSSFWorkbook workbook = new XSSFWorkbook("data/CreateLead.xlsx");
		
		// Step 2: Go to the worksheet
		XSSFSheet sheet = workbook.getSheet("Sheet1");
		
		// You need to find how many rows --> 
		int rowcount = sheet.getLastRowNum();
		
		// Column Count 
		short columnCount = sheet.getRow(0).getLastCellNum();
		
		for (int i = 1; i <= rowcount; i++) {
			
			// Step 3: Go to the row
			XSSFRow dataRow = sheet.getRow(i); // first data row
			// Step 4: Go to the column (cell)
			
			for (int j = 0; j < columnCount; j++) {
				
				XSSFCell companyName = dataRow.getCell(j);
				// Step 5: Get the content
				String dataValue = companyName.getStringCellValue();
				System.out.println(dataValue);
			}
			System.out.println("*****************");
		}
		
		// Close the workbook
		workbook.close();

	}

}
