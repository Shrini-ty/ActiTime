package TestcaseDemowrkshp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class JuweleryAddchart {
	static {
		 System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		}

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.partialLinkText("Je")).click();
		WebElement r = driver.findElement(By.xpath("//select[@id='products-orderby']"));
		Select s=new Select(r);
		s.selectByIndex(1);
		WebElement o = driver.findElement(By.xpath("//select[@id='products-pagesize']"));
		Select x=new Select(o);
		x.selectByIndex(1);
		driver.findElement(By.partialLinkText("Create Your Own Jewelry")).click();
		driver.findElement(By.xpath("//input[@id='product_attribute_71_11_17_48']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='add-to-cart-button-71']")).click();
		Thread.sleep(1000);

	}
}
