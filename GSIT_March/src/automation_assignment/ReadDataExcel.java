package automation_assignment;

import java.io.FileInputStream;

import jxl.Sheet;
import jxl.Workbook;

public class ReadDataExcel {

	public static void main(String[] args) throws Exception {

		// Importing excel file
		FileInputStream file = new FileInputStream("G:\\GrowSkillIT\\Eclipse Workspace\\GSIT_March\\excel\\readData.xls");

		// opening excel sheet
		Workbook wb = Workbook.getWorkbook(file);

		// get the sheet name
		Sheet s = wb.getSheet("Sheet1");

		// get row count
		int rowCount = s.getRows();
		
		//get column count
		int colCount = s.getColumns();
		
		System.out.println("Row = " +rowCount +" Column = " +colCount);
		
		System.out.println("Printing values from excel");
		for (int i = 0; i < rowCount; i++) {
			for(int j =0; j<colCount;j++) {
				System.out.println(s.getCell(j, i).getContents());
			}
			
		}
	}

}
