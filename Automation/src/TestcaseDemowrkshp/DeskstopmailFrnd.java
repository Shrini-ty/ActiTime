package TestcaseDemowrkshp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DeskstopmailFrnd {
	static {
		 System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		}

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.partialLinkText("Computer")).click();
		driver.findElement(By.partialLinkText("Desktops")).click();
		WebElement m = driver.findElement(By.xpath("//select[@id='products-orderby']"));
		Select s=new Select(m);
		s.selectByIndex(1);
		WebElement n = driver.findElement(By.xpath("//select[@id='products-pagesize']"));
	   Select a=new Select(n);
	   a.selectByIndex(1);
	   driver.findElement(By.partialLinkText("Build your own computer")).click();
	  WebElement f = driver.findElement(By.xpath("//select[@id='product_attribute_16_5_4']"));
	  Select x=new Select(f);
	  x.selectByIndex(0);
	  WebElement g = driver.findElement(By.xpath("//select[@id='product_attribute_16_6_5']"));
			  Select u=new Select(g);
	  u.selectByIndex(1);
	  driver.findElement(By.xpath("//input[@id='product_attribute_16_3_6_18']")).click();
	  driver.findElement(By.xpath("//input[@id='product_attribute_16_4_7_20']")).click();
	  driver.findElement(By.xpath("//input[@id='product_attribute_16_8_8_24']")).click();
	  driver.findElement(By.xpath("//input[@id='addtocart_16_EnteredQuantity']")).clear();
	  
	  driver.findElement(By.xpath("//input[@id='addtocart_16_EnteredQuantity']")).sendKeys("3");
	  driver.findElement(By.xpath("//input[@value='Email a friend']")).click();
	  driver.findElement(By.xpath("//input[@id='FriendEmail']")).sendKeys("kannadda12@gmail.com");
	  driver.findElement(By.xpath("//input[@id='YourEmailAddress']")).sendKeys("hi123@gmail.com");
	  driver.findElement(By.xpath("//input[@name='send-email']")).click();
	  
	  
	}

}
