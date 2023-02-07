package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintTextActi {
	static
	{
 System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/");
		String text = driver.findElement(By.id("toPasswordRecoveryPageLink")).getText();
		System.out.println(text);
		String text1 = driver.findElement(By.xpath("//a[@href='javascript: void(0)']")).getText();
		System.out.println(text1);
		String text2 = driver.findElement(By.tagName("a")).getText();
		System.out.println(text2);                                                  
		
		
		driver.close();

	}

}
