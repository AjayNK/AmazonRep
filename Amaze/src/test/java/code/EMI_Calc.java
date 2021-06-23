package code;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class EMI_Calc {

	@Test
	public static void emiCalc() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\selenium_jars\\browser_drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.unionbankofindia.co.in/english/emicalculator.aspx");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("loanamount")).sendKeys("100000");
		driver.findElement(By.id("rate")).sendKeys("12");
		driver.findElement(By.id("pmonths")).sendKeys("60");
		driver.findElement(By.id("Button1")).click();
		Thread.sleep(2000);
		driver.close();

	}
	

}
