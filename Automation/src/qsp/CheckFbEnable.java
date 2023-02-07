package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckFbEnable {
	static
	{
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		 boolean check = driver.findElement(By.id("u_0_5_nK")).isEnabled();
		if(check==true)
		{
			System.out.println("login button is enable");
			
		}
		else
		{
			System.out.println("login button not enable");
		}
		driver.close();


	}

}
