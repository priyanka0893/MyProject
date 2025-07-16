package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import pages.LoginPage;

public class LoginTC3 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "G:\\GrowSkillIT\\Automation\\Jar Folder\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		LoginPage login = new LoginPage(driver);
		WebDriverWait wait = new WebDriverWait(driver, 10);
		
		driver.get("https://practicetestautomation.com/practice-test-login/");
		driver.manage().window().maximize();
		
		login.enterUserName("student");
		login.enterPassword("Testuser");
		login.clickLoginBtn();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(login.invalidMsg));
		boolean val = login.errorMsg();
		System.out.println("Is invalid message displayed : " +val );
		System.out.println("Error value is displayed as : " +login.getInvalidMsg());
		
		driver.close();
	}

}
