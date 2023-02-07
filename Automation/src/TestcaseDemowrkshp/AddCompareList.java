package TestcaseDemowrkshp;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddCompareList {
	static {
		 System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		}

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.partialLinkText("Simple Computer")).click();
		driver.findElement(By.xpath("//input[@id='product_attribute_75_5_31_96']")).click();
		driver.findElement(By.xpath("//input[@value='Add to compare list']")).click();
		driver.navigate().back();
		JavascriptExecutor j=(JavascriptExecutor)driver;
		j.executeScript("window.scrollBy(0,500)");
	   driver.findElement(By.partialLinkText("Compare products list")).click();
		
	
	}
}
