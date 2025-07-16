package automation_assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FBSigninPage {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "G:\\GrowSkillIT\\Automation\\Jar Folder\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/reg/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		WebElement fname = driver.findElement(By.name("firstname"));
		WebElement lname = driver.findElement(By.name("lastname"));
		WebElement email = driver.findElement(By.name("reg_email__"));
		WebElement pwd = driver.findElement(By.id("password_step_input"));
		fname.isDisplayed();
		fname.isEnabled();
		fname.sendKeys("Priyanka");
		Thread.sleep(2000);
		
		lname.isDisplayed();
		lname.isEnabled();
		lname.sendKeys("S");
		Thread.sleep(2000);

		driver.findElement(By.id("day")).sendKeys("8");
		Thread.sleep(2000);

		driver.findElement(By.id("month")).sendKeys("May");
		Thread.sleep(2000);

		driver.findElement(By.id("year")).sendKeys("1993");
		Thread.sleep(2000);
		
		email.isDisplayed();
		email.isEnabled();
		email.sendKeys("priya@gmail.com");
		Thread.sleep(2000);
		
		pwd.isDisplayed();
		pwd.isEnabled();
		pwd.sendKeys("Abcd@123");
		Thread.sleep(2000);

		driver.close();
	}

}
