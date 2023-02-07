package TestcaseDemowrkshp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GitCards {
	static {
		 System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		}

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.partialLinkText("Gift Cards")).click();
		WebElement r = driver.findElement(By.xpath("//select[@id='products-orderby']"));
		Select s=new Select(r);
		s.selectByIndex(2);
		WebElement o = driver.findElement(By.xpath("//select[@id='products-pagesize']"));
		Select x=new Select(o);
		x.selectByIndex(2);
		
		driver.findElement(By.partialLinkText("$5 Virtual Gift Card")).click();
		driver.findElement(By.xpath("//input[@id='add-to-wishlist-button-1']")).click();
		
		
		

}
}
