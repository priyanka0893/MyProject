package automation_assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssImageAssignment {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "G:\\GrowSkillIT\\Automation\\Jar Folder\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://web-locators-static-site-qa.vercel.app/Image");
		driver.manage().window().maximize();
		Thread.sleep(3000);

		String altValue = driver.findElement(By.cssSelector("img[class='Image_image1']")).getAttribute("alt");
		System.out.println("Alt attribute value : " +altValue);
		
		String srcValue = driver.findElement(By.cssSelector("img[class='Image_image1']")).getAttribute("src");
		System.out.println("Src attribute value : " +srcValue);
		
		driver.close();
	}

}
