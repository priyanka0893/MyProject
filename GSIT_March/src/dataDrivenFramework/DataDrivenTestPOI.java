package dataDrivenFramework;


import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DataDrivenTestPOI {

    public static void main(String[] args) throws IOException, Exception {
  
    	System.setProperty("webdriver.chrome.driver", "G:\\GrowSkillIT\\Automation\\Jar Folder\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        // Load the Excel file
        FileInputStream file = new FileInputStream("G:\\GrowSkillIT\\Eclipse Workspace\\GSIT_March\\excel\\Book1.xlsx");
        Workbook workbook = new XSSFWorkbook(file);
        Sheet sheet = workbook.getSheetAt(0);

        // Iterate through the rows of the Excel file
        for (int i = 1; i < sheet.getLastRowNum(); i++) {
            Row row = sheet.getRow(i);

            // Read data from the Excel sheet
            String username = row.getCell(0).getStringCellValue();
            String password = row.getCell(1).getStringCellValue();

            // Navigate to the login page
            driver.get("https://practicetestautomation.com/practice-test-login/");
            driver.manage().window().maximize();
            Thread.sleep(2000);

            // Perform login action
            driver.findElement(By.id("username")).sendKeys(username);
            driver.findElement(By.id("password")).sendKeys(password);
            driver.findElement(By.id("submit")).click();

            // Verify login success or failure
            String currentURL = driver.getCurrentUrl();
            if (currentURL.equals("https://practicetestautomation.com/logged-in-successfully/")) {
                System.out.println("Login successful for: " + username);
            } else {
                System.out.println("Login failed for: " + username);
            }
        }

        // Close the browser after testing
        driver.close();

        // Close the workbook and the file
        workbook.close();
        file.close();
    }
}