package dataDrivenFramework;

import java.io.FileInputStream;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import jxl.Sheet;
import jxl.Workbook;

public class TestUserPrgmJXL {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "G:\\GrowSkillIT\\Automation\\Jar Folder\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		FileInputStream file = new FileInputStream("G:\\GrowSkillIT\\Eclipse Workspace\\GSIT_March\\excel\\fbUser.xls");
		
		Workbook wb = Workbook.getWorkbook(file);
		
		Sheet sh = wb.getSheet("Sheet1");
		
		for(int i = 1; i<sh.getRows() ; i++) {
			for(int j = 1;j<sh.getColumns();j++) {
				
				String uName = sh.getCell(0, i).getContents();
				String password = sh.getCell(1, j).getContents();
				
				driver.get("https://practicetestautomation.com/practice-test-login/");
				
				driver.manage().window().maximize();
				Thread.sleep(2000);
				
				driver.findElement(By.id("username")).sendKeys(uName);
				Thread.sleep(2000);		
				
				driver.findElement(By.id("password")).sendKeys(password);
				
				driver.findElement(By.id("submit")).click();
				Thread.sleep(2000);
				
				System.out.println();
				driver.findElement(By.tagName("h1")).getText();
			}
		}
		
		driver.close();


	}

}