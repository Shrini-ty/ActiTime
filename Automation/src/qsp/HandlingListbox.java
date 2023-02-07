package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingListbox {
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.linkText("Create New Account")).click();
		Thread.sleep(2000);
		WebElement dateListbox = driver.findElement(By.id("day"));
		WebElement monthLiatbox = driver.findElement(By.id("month"));
		WebElement yearListbox = driver.findElement(By.id("year"));
		Select s1=new Select(dateListbox);
		s1.selectByValue("7");
		Select s2=new Select(monthLiatbox);
		s2.selectByIndex(1);
		Select s3=new Select(yearListbox );
		s3.selectByValue("1999");

	}

}
