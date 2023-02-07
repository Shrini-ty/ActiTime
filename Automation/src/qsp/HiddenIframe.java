package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenIframe {
		static{
			 System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
			}
			

			public static void main(String[] args) {
			WebDriver driver=new ChromeDriver();
			driver.get("https://snowcityblr.com/contact-us/");
			driver.switchTo().frame(0);
			driver.findElement(By.xpath("//div[@class='navigate-text']")).click();

	}

}
