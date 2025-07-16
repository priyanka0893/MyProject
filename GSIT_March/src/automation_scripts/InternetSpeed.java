package automation_scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InternetSpeed {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "G:\\GrowSkillIT\\Automation\\Jar Folder\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://fast.com/");
		driver.manage().window().maximize();
		Thread.sleep(20000);
		
		WebElement speed = driver.findElement(By.id("speed-value"));
		WebElement units = driver.findElement(By.id("speed-units"));
		System.out.println("Internet speed is : " +speed.getText()+" " +units.getText());
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		
		driver.close();
	}

}
