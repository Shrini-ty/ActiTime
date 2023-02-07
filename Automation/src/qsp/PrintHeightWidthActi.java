package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintHeightWidthActi {
	static
	{
   System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/");
		WebElement userTbx = driver.findElement(By.id("username"));
		int h1=userTbx.getSize().getHeight();
		int w1=userTbx.getSize().getWidth();
		System.out.println("Height="+h1);
		System.out.println("Width="+w1);
		 WebElement pwdTbx = driver.findElement(By.name("pwd"));
		 int h2=pwdTbx.getSize().getHeight();
		 int w2=pwdTbx.getSize().getWidth();
		 System.out.println("height="+h2);
		 System.out.println("Width="+w2);
		 if((h1==h2)&&(w1==w2))
		 {
			 System.out.println("Both height and width are equal");
			 
		 }
		 else
		 {
			 System.out.println("Both are not equal");
		 }
		  
		driver.close();
		
		
	

	}

}
