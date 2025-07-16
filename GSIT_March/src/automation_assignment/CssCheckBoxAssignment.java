package automation_assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssCheckBoxAssignment {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "G:\\GrowSkillIT\\Automation\\Jar Folder\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://web-locators-static-site-qa.vercel.app/Checkbox");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		boolean val = driver.findElement(By.xpath("//p[contains(text(),'QA')]/preceding-sibling::div/div/span")).isEnabled();
		if(val == true) {
			System.out.println("QA checkbox is Enabled");
		} else {
			System.out.println("QA checkbox is not enabled");
		}
		
		driver.findElement(By.xpath("//p[contains(text(),'DSA')]/preceding-sibling::div/div/span")).click();
		Thread.sleep(2000);
		
		driver.close();
		

	}

}
