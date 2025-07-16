package dataDrivenFramework;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadDataPOI {

	public static void main(String[] args) throws Exception {
		File f = new File("G:\\GrowSkillIT\\Eclipse Workspace\\GSIT_March\\excel\\Book1.xlsx");
		
		FileInputStream fs = new FileInputStream(f);
		
		try (XSSFWorkbook wb = new XSSFWorkbook(fs)) {
			XSSFSheet sh = wb.getSheet("Sheet1");
			
			int rowCount = sh.getLastRowNum() - sh.getFirstRowNum();
			
			for(int i = 1; i<rowCount; i++) {
				int cellCount = sh.getRow(i).getLastCellNum();
				
				System.out.println("Row " +i +" Data value = ");
				
				for(int j = 1;j<cellCount;j++) {
					System.out.println("User Name = " +sh.getRow(i).getCell(0).getStringCellValue());
					System.out.println("Password = " +sh.getRow(i).getCell(1).getStringCellValue());
				}
				System.out.println();
			}
		}

	}

}
