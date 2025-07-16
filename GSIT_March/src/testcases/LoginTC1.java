package testcases;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import pages.Dashboard;
import pages.LoginPage;

public class LoginTC1 {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "G:\\GrowSkillIT\\Automation\\Jar Folder\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		LoginPage login = new LoginPage(driver);
		Dashboard dashboard = new Dashboard(driver);
		
		Wait<WebDriver> wait = new WebDriverWait(driver, 10);
		
		FileInputStream file = new FileInputStream("G:\\GrowSkillIT\\Eclipse Workspace\\GSIT_March\\excel\\Book1.xlsx");
		Workbook wb = new XSSFWorkbook(file);
		Sheet sh = wb.getSheet("Sheet1");
		
		int rowCount = sh.getLastRowNum() - sh.getFirstRowNum();
		for(int i =1; i<rowCount;i++) {
			Row row = sh.getRow(i);
			
			// Read data from the Excel sheet
            String username = row.getCell(0).getStringCellValue();
            String password = row.getCell(1).getStringCellValue();
            
            driver.get("https://practicetestautomation.com/practice-test-login/");
    		driver.manage().window().maximize();
    		
    		login.enterUserName(username);
    		login.enterPassword(password);
    		login.clickLoginBtn();
    		
    		wait.until(ExpectedConditions.visibilityOfElementLocated(dashboard.logoutBtn));
    		String successMsg = dashboard.getSuccessMsg();
    		System.out.println(successMsg);
    		Thread.sleep(3000);
    		
    		//verify if logout button is displayed
    		System.out.println("Logout Button is displayed: " +driver.findElement(dashboard.logoutBtn).isDisplayed());
    		
    		dashboard.clickLogoutBtn();
    		System.out.println("Executed LoginTC successfully");
		}
		
		wb.close();
		driver.close();
		
	}

}
