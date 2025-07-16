package automation_scripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesPrgm {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "G:\\GrowSkillIT\\Automation\\Jar Folder\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		Thread.sleep(3000);

		// By finding all the web elements using iframe tag
		List<WebElement> iframeElements = driver.findElements(By.tagName("iframe"));
		System.out.println("Total number of iframes are " + iframeElements.size());

		// By executing a java script
		JavascriptExecutor exe = (JavascriptExecutor) driver;
		Integer noOfFrames = Integer.parseInt(exe.executeScript("return window.length").toString());
		System.out.println("No. of iframes on the page are " + noOfFrames);

		// scroll to bottom
		exe.executeScript("window.scrollBy(200,350)");

		// switch to frame using index
		// driver.switchTo().frame(0);

		// switch to frame usingframe name
		driver.switchTo().frame("iframe-name");

		boolean val = driver.findElement(By.xpath("//div[@class='login-btn']/a[contains(text(),'Register')]"))
				.isDisplayed();
		System.out.println(val);

		// switch to main content
		driver.switchTo().defaultContent();
		
		boolean ref = driver.findElement(By.xpath("//button[@id='mousehover']")).isDisplayed();
		if (ref == true) {
			System.out.println("Focus is shifted to main content page");
		} else {
			System.out.println("Focus is not shifted to main content page");
		}

		driver.close();

	}

}
