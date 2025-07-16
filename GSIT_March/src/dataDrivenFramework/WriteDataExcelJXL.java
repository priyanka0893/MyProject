package dataDrivenFramework;


import java.io.FileOutputStream;

import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;

public class WriteDataExcelJXL {

	public static void main(String[] args) throws Exception {
		FileOutputStream fout = new FileOutputStream("G:\\GrowSkillIT\\Eclipse Workspace\\GSIT_March\\excel\\fout.xls");
		
		WritableWorkbook wwb = Workbook.createWorkbook(fout);
		
		WritableSheet wws = wwb.createSheet("Result", 0);
		
		Label l = new Label(0,0,"First Name");
		wws.addCell(l);
		
		Label l1 = new Label(1,1,"Last Name");
		wws.addCell(l1);
		
		Label l2 = new Label(1,2,"Course");
		wws.addCell(l2);
		
		wwb.write();
		wwb.close();
		
	}

}
