package TestcaseDemowrkshp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ComputerAcsseories {
	static {
		 System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		}

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.partialLinkText("Computer")).click();
		driver.findElement(By.partialLinkText("Accessories")).click();
		WebElement k = driver.findElement(By.xpath("//select[@id='products-orderby']"));
		Select s=new Select(k);
		s.selectByIndex(2);
		WebElement l = driver.findElement(By.xpath("//select[@id='products-pagesize']"));
		Select t=new Select(l);
		t.selectByIndex(2);
		driver.findElement(By.partialLinkText("TCP Public RPA/TCD")).click();
		driver.findElement(By.xpath("//input[@id='add-to-wishlist-button-64']")).click();
		

}
}
