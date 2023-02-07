package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class handlingFrame {
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("file:///C:/Users/DELL/Desktop/Page1.html");
	driver.findElement(By.id("t1")).sendKeys("varun");
	driver.switchTo().frame(0);
	driver.findElement(By.id("t2")).sendKeys("shrinivas");
	driver.switchTo().parentFrame();
	driver.findElement(By.id("t1")).sendKeys("Kiran");
	

	}

}
