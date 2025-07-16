package automation_assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssQkartAssignment {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "G:\\GrowSkillIT\\Automation\\Jar Folder\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://crio-qkart-frontend-qa.vercel.app");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		System.out.println("The text on Login Button : " +driver.findElement(By.xpath("//button[contains(text(),'Login')]")).getText());
		driver.findElement(By.xpath("//button[contains(text(),'Login')]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector("input[id='username']")).sendKeys("admin123");
		driver.findElement(By.cssSelector("input[id='password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[contains(text(),'Login to QKart')]")).click();
		
		System.out.println("Logged in to Qkart application");
		driver.close();
		

	}

}
