package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyAlignmentFb {
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("u_0_0_Gc")).click();
		int y1 = driver.findElement(By.id("u_4_2_oz")).getLocation().getY();
		 int y2 = driver.findElement(By.id("u_f_3_J9")).getLocation().getY();
		 int y3 = driver.findElement(By.id("u_f_4_XF")).getLocation().getY();
		 if(y1==y2 && y2==y3)
		 {
			 System.out.println("Properly aligned and pass");
		 }
		 else
		 {
			 System.out.println("not properly aligned and fail");
		 }
		 
		 
		
		
		

	}

}
