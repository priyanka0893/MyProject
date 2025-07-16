package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public By uName = By.id("username");
	public By password = By.id("password");
	public By loginBtn = By.xpath("//button[@id='submit']");
	public By invalidMsg = By.id("error");
	
	public void enterUserName(String username) {
		driver.findElement(uName).sendKeys(username);
	}
	
	public void enterPassword(String pass) {
		driver.findElement(password).sendKeys(pass);
	}
	
	public void clickLoginBtn() {
		driver.findElement(loginBtn).click();
	}
	
	public boolean errorMsg() {
		return driver.findElement(invalidMsg).isDisplayed();
	}
	
	public String getInvalidMsg() {
		return driver.findElement(invalidMsg).getText();
	}
	
}
