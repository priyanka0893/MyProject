package automation_scripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsPrgm {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "G:\\GrowSkillIT\\Automation\\Jar Folder\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		List<WebElement> linkCount = driver.findElements(By.tagName("a"));
		System.out.println("Total number of links : " +linkCount.size());
		
		List<WebElement> img = driver.findElements(By.tagName("img"));
		System.out.println("Total number of images : " +img.size());
		
		if(linkCount.size() > img.size()) {
			System.out.println("link count is grater than image count");
		} else {
			System.out.println("Image count is grater than link count");
		}
		
		System.out.println("Print link starts with m");
		for(WebElement data : linkCount) {
			if(data.getText().startsWith("m") || data.getText().startsWith("M"))
			System.out.println(data.getText());
		}
		
		System.out.println("Print link which contains book");
		for(WebElement data : linkCount) {
			if(data.getText().contains("book") || data.getText().contains("Book"))
			System.out.println(data.getText());
		}
		
		driver.close();
	}

}
