package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PracticePage {
	
	WebDriver driver;
	
	public PracticePage(WebDriver driver) {
		this.driver = driver;
	}
	
	
	By testLoginPage = By.xpath("//a[text() = 'Test Login Page']");
	By testException = By.xpath("//a[text() = 'Test Exceptions']");

	
	public void testLoginPage() {
		driver.findElement(testLoginPage).click();
	}

	public void testException() {
		driver.findElement(testException).click();
	}
	
	

}
