package TestcaseDemowrkshp;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddcompareListchekAndRemove {
	static {
		 System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		}

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.partialLinkText("Build your own expensive computer")).click();
		driver.findElement(By.xpath("//input[@id='product_attribute_74_5_26_82']")).click();
		driver.findElement(By.xpath("//input[@value='Add to compare list']")).click();
		driver.navigate().back();
		JavascriptExecutor j=(JavascriptExecutor)driver;
		j.executeScript("window.scrollBy(0,500)");
	   driver.findElement(By.partialLinkText("Compare products list")).click();
	   driver.findElement(By.xpath("//input[@value='Remove']")).click();
		
	}
}
