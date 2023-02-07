package TestcaseDemowrkshp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GiftcardMailTofrnd {
	static{
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
}


public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.get("https://demowebshop.tricentis.com/");
	driver.findElement(By.xpath("//a[contains(text(),'Log in')]")).click();
	driver.findElement(By.xpath("//input[@name='Email']")).sendKeys("shriarun12@gmail.com");
	driver.findElement(By.xpath("//input[@name='Password']")).sendKeys("12345678");
	driver.findElement(By.xpath("//input[@id='RememberMe']")).click();
	driver.findElement(By.xpath("//input[@value='Log in']")).click();
	driver.findElement(By.partialLinkText("Gift Ca")).click();
	driver.findElement(By.partialLinkText("$100 Physical Gift Card")).click();
	driver.findElement(By.xpath("//input[@value='"
			+ "']")).click();
	driver.findElement(By.xpath("//input[@id='FriendEmail']")).sendKeys("varu124@gmail.com");
	driver.findElement(By.xpath("//input[@name='send-email']")).click();

}
}
