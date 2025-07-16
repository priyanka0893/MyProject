package dataDrivenFramework;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DemoQAReadData {

	public static void main(String[] args) throws Exception {

		File file =    new File("G:\\GrowSkillIT\\Eclipse Workspace\\GSIT_March\\excel\\TestData.xlsx");

        FileInputStream inputStream = new FileInputStream(file);

        try (XSSFWorkbook wb = new XSSFWorkbook(inputStream)) {
			XSSFSheet sheet=wb.getSheet("Sheet1");
			
			int rowCount=sheet.getLastRowNum()-sheet.getFirstRowNum();
			
			for(int i=0;i<=rowCount;i++){
			    
			    int cellcount=sheet.getRow(i).getLastCellNum();
			    
			    System.out.println("Row"+ i+" data is :");
			    
			    for(int j=0;j<cellcount;j++){
			        System.out.print(sheet.getRow(i).getCell(j).getStringCellValue() +",");
			    }
			    System.out.println();
			}
		}

	}

}
