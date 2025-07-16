package automation_practise_website;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(ListenersDemo.class)
public class FactDemo {
	WebDriver driver;
	@BeforeTest
	public void launchBrowser() {
	System.setProperty("webdriver.chrome.driver", "G:\\GrowSkillIT\\Automation\\Jar Folder\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	}
	
    @Test(retryAnalyzer = RetryAnalyzer.class)
    public void sampleTest() throws Exception {
    	driver.get("https://qainterview.pythonanywhere.com/");
    	System.out.println("Home Page is displayed");
		driver.findElement(By.xpath("//a[contains(text(),'About')]")).click();
		System.out.println(("Clicked on about link in home page"));
		Thread.sleep(3000);
		System.out.println("About page is displayed");
		WebElement header = driver.findElement(By.xpath ("//h1[text()='About the QA interview application']"));
		Assert.assertTrue(header.isDisplayed(),"Header is not dispalyed");
    }
    
    @Test(retryAnalyzer = RetryAnalyzer.class)
    public void sampleTest1() throws Exception {
    	driver.get("https://qainterview.pythonanywhere.com/");
    	System.out.println("Home Page is displayed");
		driver.findElement(By.xpath("//a[contains(text(),'About')]")).click();
		System.out.println(("Clicked on about link in home page"));
		Thread.sleep(3000);
		System.out.println("About page is displayed");
		WebElement header = driver.findElement(By.xpath ("//h1[text()='About the QA interview ']"));
		Assert.assertTrue(header.isDisplayed(),"Header is not dispalyed");
    }
    
    @AfterTest
    public void closeBrowser() {
    	if(driver!=null) {
    	driver.quit();
    	}
    }
}
