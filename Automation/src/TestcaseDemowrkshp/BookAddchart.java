package TestcaseDemowrkshp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class BookAddchart {
	static{
		 System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		}

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.partialLinkText("Books")).click();
		WebElement d = driver.findElement(By.xpath("//select[@name='products-orderby']"));
		Select s=new Select(d);
		s.selectByIndex(2);
		WebElement e = driver.findElement(By.xpath("//select[@name='products-viewmode']"));
		Select n=new Select(e);
		n.selectByIndex(1);
		driver.findElement(By.partialLinkText("Health Book")).click();
		driver.findElement(By.xpath("//input[@id='add-to-cart-button-22']")).click();
		
	
	

	}

}