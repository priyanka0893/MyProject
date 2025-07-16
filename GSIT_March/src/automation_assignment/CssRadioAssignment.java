package automation_assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssRadioAssignment {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "G:\\GrowSkillIT\\Automation\\Jar Folder\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://web-locators-static-site-qa.vercel.app/Radio");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		boolean val = driver.findElement(By.cssSelector("input[value='female']")).isSelected();
		if(val == true) {
			System.out.println("Female radio button is selected by default");
		} else {
			System.out.println("Female radio button is not selected by default");
		}
		
		driver.findElement(By.cssSelector("input[value='female']")).click();
		System.out.println("Female radio button is selected manually");
		Thread.sleep(2000);
		
		driver.close();

	}

}
