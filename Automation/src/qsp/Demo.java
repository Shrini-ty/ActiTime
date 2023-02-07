package qsp;

import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		driver.navigate().to("https://www.gmail.com");
		driver.navigate().back();
	  
		driver.navigate().forward();
		driver.navigate().refresh();
		driver.close();
	
	
	   

	}

}