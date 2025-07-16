package automation_scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPrm {
	
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "G:\\GrowSkillIT\\Automation\\Jar Folder\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		//Send values to prompt alert
		driver.findElement(By.id("name")).sendKeys("Priyanka");
		Thread.sleep(2000);
		
		//Accept alert
		driver.findElement(By.id("alertbtn")).click();
		
		driver.switchTo().alert().accept();
		
		//Send values to prompt alert
		driver.findElement(By.id("name")).sendKeys("Panvith");
		Thread.sleep(2000);
		
		//Accept alert
		driver.findElement(By.id("confirmbtn")).click();
		driver.switchTo().alert().dismiss();
		
		Thread.sleep(2000);
		driver.close();
	}

}
