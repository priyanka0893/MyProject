package automation_assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssButtonAssignment {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "G:\\GrowSkillIT\\Automation\\Jar Folder\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://web-locators-static-site-qa.vercel.app/Button");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		boolean val = driver.findElement(By.cssSelector("p[class='buttonContent']")).isDisplayed();
		if(val == true) {
			System.out.println("Click this button is displayed");
		} else {
			System.out.println("Click this button is not displayed");
		}
		
		boolean val1 = driver.findElement(By.cssSelector("p[class='buttonContent']")).isEnabled();
		if(val1 == true) {
			System.out.println("Click this button is enabled");
		} else {
			System.out.println("Click this button is not enabled");
		}

		
		driver.findElement(By.cssSelector("p[class='buttonContent']")).click();
		System.out.println("Click this button is clicked");
		
		driver.close();

	}

}
