package automation_assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableAssignment {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "G:\\GrowSkillIT\\Automation\\Jar Folder\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://web-locators-static-site-qa.vercel.app/Web%20Table");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		WebElement table = driver.findElement(By.xpath("//table[@class='MuiTable-root css-1owb465']"));
		List<WebElement> th = table.findElements(By.tagName("th"));
		System.out.println("Total number of columns in the table = " +th.size());
		
		driver.findElement(By.xpath("//span[contains(text(),'Static Table - Subject Topper')]")).click();
		Thread.sleep(2000);
		
		WebElement tableSub = driver.findElement(By.xpath("//table[@class='MuiTable-root css-1owb465']"));
		List<WebElement> thSub = tableSub.findElements(By.tagName("th"));
		
		System.out.println();
		System.out.println("Names of headers");
		for(WebElement data : thSub) {
			System.out.print(data.getText() + " ");
		}
		
		Thread.sleep(2000);
		System.out.println();
		System.out.println("Subject in column 2");
		List<WebElement> subject = tableSub.findElements(By.xpath("//tbody[@class='MuiTableBody-root css-1xnox0e']/tr/td[2]"));
		for(WebElement data : subject) {
			System.out.print(data.getText() +" ");
		}
		Thread.sleep(2000);
		driver.close();
		
	}

}
