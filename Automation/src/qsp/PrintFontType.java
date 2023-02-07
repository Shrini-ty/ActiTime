package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintFontType {
	static
	{
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		String colour = driver.findElement(By.linkText("Forgotten password?")).getCssValue("font-size");
		String colour1 = driver.findElement(By.linkText("Forgotten password?")).getCssValue("font-weight");
		System.out.println(colour);
		System.out.println(colour1);
		driver.close();
		
		
		

	}

}
