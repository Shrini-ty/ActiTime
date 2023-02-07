package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSugSelenium {
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.google.com/");
	driver.findElement(By.name("q")).sendKeys("selenium");
	Thread.sleep(3000);
	List<WebElement> allSug = driver.findElements(By.xpath("//span[contains(text(),'selenium')]"));
	int count = allSug.size();
	System.out.println(count);
	for(int i=0;i<count;i++) {
		String text = allSug.get(i).getText();
		System.out.println(text);
	}
		allSug.get(count-1).click();
	
	

	}

}
