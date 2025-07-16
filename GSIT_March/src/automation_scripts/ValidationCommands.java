package automation_scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidationCommands {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "G:\\GrowSkillIT\\Automation\\Jar Folder\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);

		WebElement loginBtn = driver.findElement(By.name("login"));
		WebElement searchBtn = driver.findElement(By.name("did_submit"));
		WebElement forgotPwd = driver.findElement(By.className("_97w4"));

		String title = driver.getTitle();
		String url = driver.getCurrentUrl();

		if (title.length() > url.length()) {
			System.out.println("Application length is greater than url");
		} else {
			System.out.println("Application length is not greater than url");
		}

		driver.findElement(By.name("login")).click();
		Thread.sleep(3000);
		System.out.println("Login button is available : " + loginBtn.isDisplayed());

		System.out.println("Login button is enabled : " + loginBtn.isEnabled());

		forgotPwd.click();
		Thread.sleep(3000);

		String forgotTitle = driver.getTitle();

		System.out.println("Title of the page contains Password1 : " + forgotTitle.contains("password1"));

		System.out.println("Search button is displayed : " + searchBtn.isDisplayed());

		System.out.println("Search button is enabled  : " + searchBtn.isEnabled());

		driver.close();

	}

}
