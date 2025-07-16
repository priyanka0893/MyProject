package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

	WebDriver driver;

	public HomePage(WebDriver driver) {
		this.driver = driver;
	}

	By homeLink = By.xpath("//a[contains(text(),'Home')]");
	By practiseLink = By.xpath("//a[text() = 'Practice']");
	By courseLink = By.xpath("//a[text() = 'Courses']");
	By blogLink = By.xpath("//a[text() = 'Blog']");
	By contactLink = By.xpath("//a[text() = 'Contact']");

	public void homeLink() {
		driver.findElement(homeLink).click();
	}

	public void practiseLink() {
		driver.findElement(practiseLink).click();
	}

	public void courseLink() {
		driver.findElement(courseLink).click();
	}

	public void blogLink() {
		driver.findElement(blogLink).click();
	}

	public void contactLink() {
		driver.findElement(contactLink).click();
	}

	

}
