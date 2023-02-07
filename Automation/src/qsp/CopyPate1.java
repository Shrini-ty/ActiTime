package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CopyPate1 {
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.get("file:///C:/Users/DELL/Desktop/Table.html");
	driver.findElement(By.xpath("//input[@type='text']")).sendKeys(Keys.CONTROL+"ac");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//input[@value='B']")).sendKeys(Keys.CONTROL+"av");
	
	

	}
}