package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Dashboard {

	WebDriver driver;


	public Dashboard(WebDriver driver) {
		this.driver = driver;
	}

	public By successMsg = By.xpath("//h1[contains(text(),'Logged In')]");
	public By logoutBtn = By.xpath("//a[contains(text(),'Log out')]");

	public String getSuccessMsg() {
		return driver.findElement(successMsg).getText();
	}

	public void clickLogoutBtn() {
		driver.findElement(logoutBtn).click();
	}

}
