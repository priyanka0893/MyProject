package automation_scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsPrgm {

	public static void main(String[] args) throws InterruptedException {
				
		System.setProperty("webdriver.chrome.driver", "G:\\GrowSkillIT\\Automation\\Jar Folder\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		driver.findElement(By.id("email")).sendKeys("priyankas11@rocketmail.com");
		Thread.sleep(1000);
		
		driver.findElement(By.id("pass")).sendKeys("Priya@1993");
		Thread.sleep(2000);
		
		driver.findElement(By.id("pass")).clear();
		Thread.sleep(2000);
		
		driver.findElement(By.id("email")).clear();
		driver.close();

	}

}
