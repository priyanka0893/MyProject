package automation_practise_website;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {

	WebDriver driver = new ChromeDriver();
	
	public void launchDriver() {
		System.setProperty("driver.chrome.driver", "G:\\GrowSkillIT\\Automation\\Jar Folder\\chromedriver.exe");
	}
	
	public void enterUrl(String url) {
		driver.get(url);
	}
	
	public void elementDisplayed(String xpath) {
		driver.findElement(By.xpath(xpath)).isDisplayed();
		
	}
	
	public void elementEnabled(String xpath) {
		driver.findElement(By.xpath(xpath)).isEnabled();
	}
	
	public void clickElement(String signUpBtn) {
		driver.findElement(By.xpath(signUpBtn)).click();
	}
	
	public void maximizeWindow() {
		driver.manage().window().maximize();
	}
}
