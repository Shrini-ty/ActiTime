package TestcaseDemowrkshp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoSubscribes {
	static{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}


	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("//a[contains(text(),'Log in')]")).click();
		driver.findElement(By.xpath("//input[@name='Email']")).sendKeys("shriarun12@gmail.com");
		driver.findElement(By.xpath("//input[@name='Password']")).sendKeys("87456321");
		driver.findElement(By.xpath("//input[@id='RememberMe']")).click();
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		driver.findElement(By.xpath("//input[@id='newsletter-email']")).sendKeys("varu5487@gmail.com");
		driver.findElement(By.xpath("//input[@id='newsletter-subscribe-button']")).click();

	}
}
