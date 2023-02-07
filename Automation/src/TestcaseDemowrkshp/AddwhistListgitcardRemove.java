package TestcaseDemowrkshp;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddwhistListgitcardRemove {
	static {
		 System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		}

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.partialLinkText("Gift Cards")).click();
		driver.findElement(By.partialLinkText("$50 Physical Gift Card")).click();
		driver.findElement(By.xpath("//input[@id='giftcard_3_RecipientName']")).sendKeys("varu");
		driver.findElement(By.xpath("//input[@id='giftcard_3_SenderName']")).sendKeys("Shri");
		driver.findElement(By.xpath("//input[@id='add-to-wishlist-button-3']")).click();
		JavascriptExecutor j=(JavascriptExecutor)driver;
		j.executeScript("window.scrollBy(0,500)");
		driver.findElement(By.partialLinkText("Wishlist")).click();
		driver.findElement(By.xpath("//input[@name='removefromcart']")).click();
		driver.findElement(By.xpath("//input[@name='updatecart']")).click();
		
		
		
}
}