package automation_scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClassPrgm {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "G:\\GrowSkillIT\\Automation\\Jar Folder\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");

		driver.manage().window().maximize();
		Thread.sleep(3000);

		WebElement element = driver.findElement(By.xpath("//input[@name='email']"));

		Actions action = new Actions(driver);

		action.sendKeys(element, "iphone").build().perform();

		Thread.sleep(3000);
		driver.quit();
	}

}
