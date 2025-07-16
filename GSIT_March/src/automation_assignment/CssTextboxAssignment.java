package automation_assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssTextboxAssignment {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "G:\\GrowSkillIT\\Automation\\Jar Folder\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://web-locators-static-site-qa.vercel.app/Edit");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		boolean val = driver.findElement(By.cssSelector("input[placeholder='Click here to enter your name here']")).isDisplayed();
		if(val == true) {
			System.out.println("Enter your name text box is displayed");
		} else {
			System.out.println("Enter your name text box is not displayed");
		}
		
		driver.findElement(By.cssSelector("input[placeholder='Click here to enter your name here']")).sendKeys("Priyanka");
		
		driver.findElement(By.cssSelector("input[placeholder='Type your nationality']")).sendKeys("Indian");
		
		Thread.sleep(2000);
		
		driver.close();

	}

}
