package automation_scripts;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class FluentWaitPrgm {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "G:\\GrowSkillIT\\Automation\\Jar Folder\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
			
		driver.get("https://facebook.com/");
		driver.manage().window().maximize();
		
		js.executeScript("window.scrollBy(0,250)", "");
		
		Wait<WebDriver> fluentWait = new FluentWait<>(driver)
				.withTimeout(Duration.ofSeconds(10))
				.pollingEvery(Duration.ofSeconds(2))
				.ignoring(Exception.class);
		

		WebElement insta = fluentWait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'Instagram')]")));
		
		System.out.println("Element is visible : " + insta.getText());

		driver.close();
		
	}
}

