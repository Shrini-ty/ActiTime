package qsp;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Githunselenium {
	static{
		 System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		}
	

	public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.selenium.dev/downloads/");
	
	driver.findElement(By.xpath("//i[@class='fab fa-github']")).click();
     Set<String> wh = driver.getWindowHandles();
     String i=" ";
	for (String m : wh) {
		i=m;
		
		}
	driver.switchTo().window(i);
			
		 driver.findElement(By.xpath("//a[contains(text(), ' Sign in')] ")).click();
	}
		
	}


