package automation_assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownAssignment {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "G:\\GrowSkillIT\\Automation\\Jar Folder\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://web-locators-static-site-qa.vercel.app/Dropdown");
		driver.manage().window().maximize();
		Thread.sleep(3000);

		WebElement ele = driver.findElement(By.className("dropdown"));
		Select select = new Select(ele);
		select.selectByVisibleText("Australia");
		Thread.sleep(2000);
		System.out.println("Single selection dropdown");
		System.out.println("Dropdown is selected as Australia");
		boolean val = select.isMultiple();
		if(val == true) {
			System.out.println("True");
		} else {
			System.out.println("False");
		}
		System.out.println("Is dropdown Multiple select : " + select.isMultiple());
		
		System.out.print("Options in dropdown : ");
		List<WebElement> options = select.getOptions();
		for (WebElement data : options) {
			System.out.print(data.getText() + " ");
		}
		
		String foption = select.getFirstSelectedOption().getText();
		System.out.println("First selected option : " +foption);
		
		//driver.findElement(By.xpath("//button/span[contains(text(),'Multi Select Dropdown')]")).click();
		driver.findElement(By.xpath("//button/span[contains(text(),'Multi Select Dropdown')]")).click();
		//driver.findElement(By.className("MuiButtonBase-root MuiTab-root MuiTab-textColorPrimary css-1q2h7u5")).click();
		Thread.sleep(2000);
		
		System.out.println();
		System.out.println("Multi Select dropdown");
		
		WebElement ele1 = driver.findElement(By.className("multi"));
		Select s1 = new Select(ele1);
		boolean res = s1.isMultiple();
		if(res == true) {
			System.out.println("True");
		} else {
			System.out.println("False");
		}
		System.out.println("Is dropdown Multiple select : " + s1.isMultiple());
		System.out.print("Selected options by default : ");

		List<WebElement> l1 = s1.getAllSelectedOptions();
		for (WebElement data : l1) {
			System.out.print(data.getText() + " ");
		}
		
		s1.selectByValue("Analytics");
		Thread.sleep(2000);
		
		System.out.println();
		System.out.println("Selected options by user : ");

		List<WebElement> l2 = s1.getAllSelectedOptions();
		for (WebElement data : l2) {
			System.out.print(data.getText() + " ");
		}
		driver.close();

	}

}
