package automation_practise_website;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class UserRegistration {
	
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "G:\\GrowSkillIT\\Automation\\Jar Folder\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://automationexercise.com");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		WebElement loginBtn = driver.findElement(By.xpath("//a[contains(text(),' Signup / Login')]"));
		
		System.out.println(driver.findElement(By.xpath("//a[contains(text(),' Signup / Login')]")).isDisplayed());
		loginBtn.click();
		Thread.sleep(3000);
		
		WebElement fname = driver.findElement(By.xpath("//input[@placeholder='Name']"));
		WebElement emailSignUp = driver.findElement(By.xpath("//input[@data-qa='signup-email']"));
		WebElement signUpBtn = driver.findElement(By.xpath("//button[contains(text(),'Signup')]"));
		
		fname.sendKeys("Pannu");
		emailSignUp.sendKeys("pannu@gmail.com");
		
		signUpBtn.click();
		Thread.sleep(3000);
		
		driver.findElement(By.id("id_gender1")).click();
		driver.findElement(By.id("password")).sendKeys("12345");
		
		Select day = new Select(driver.findElement(By.xpath("//div[@id='uniform-days']")));
		day.selectByValue("6");
		
		Select month = new Select(driver.findElement(By.xpath("//div[@id='months']")));
		month.selectByValue("December");
		
		Select year = new Select(driver.findElement(By.xpath("//div[@id='years']")));
		year.selectByValue("December");
		
		driver.findElement(By.id("newsletter")).click();
		driver.findElement(By.id("optin")).click();
		
		driver.findElement(By.id("first_name")).sendKeys("Panvith");
		driver.findElement(By.id("last_name")).sendKeys("N");
		
		driver.findElement(By.id("company")).sendKeys("Panvith.pvt.Ltd");
		
		
		
		
		
		
		
		
		driver.close();
		
	}

}
