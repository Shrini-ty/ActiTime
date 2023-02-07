package jsp;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingWithoutQuit {

	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.xpath("//a[text()='actiTIME Inc.']")).click();
	     Set<String> wh = driver.getWindowHandles();
	     
	     for(String i:wh) {
	    	 Thread.sleep(3000);
	    	 driver.switchTo().window(i);
	    	 driver.close();
	     }
	}

}
