package TestcaseDemowrkshp;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddchartRemovAndContinueshop {
	static{
		 System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		}


	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("//a[contains(text(),'Log in')]")).click();
		driver.findElement(By.xpath("//input[@name='Email']")).sendKeys("shriarun12@gmail.com");
		driver.findElement(By.xpath("//input[@name='Password']")).sendKeys("12345678");
		driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
		driver.findElement(By.partialLinkText("14.1-inch Laptop")).click();
		driver.findElement(By.xpath("//input[@id='add-to-cart-button-31']")).click();
		driver.navigate().back();
		JavascriptExecutor j=(JavascriptExecutor)driver;
		j.executeScript("window.scrollBy(0,500)");
		driver.findElement(By.partialLinkText("Shopping cart")).click();
		driver.findElement(By.xpath("//input[@name='continueshopping']")).click();
		driver.findElement(By.partialLinkText("Build your own computer")).click();
		driver.findElement(By.xpath("//input[@id='product_attribute_16_3_6_19']")).click();
		driver.findElement(By.xpath("//input[@id='add-to-cart-button-16']")).click();
		driver.navigate().back();
		driver.navigate().back();
		driver.findElement(By.xpath("//input[@value='2974510']")).click();
		driver.findElement(By.xpath("//input[@name='updatecart']")).click();

		
	
	}

}
