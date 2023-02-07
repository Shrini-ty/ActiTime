package TestcaseDemowrkshp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ComputerNOtebookaddchart {
	static {
		 System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		}

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.partialLinkText("Computer")).click();
		driver.findElement(By.partialLinkText("Notebooks")).click();
		WebElement m = driver.findElement(By.xpath("//select[@id='products-orderby']"));
		Select s=new Select(m);
		s.selectByIndex(1);
		WebElement b = driver.findElement(By.xpath("//select[@id='products-pagesize']"));
		Select a=new Select(b);
		a.selectByIndex(1);
		driver.findElement(By.partialLinkText("14.1-inch Laptop")).click();
		driver.findElement(By.xpath("//input[@id='add-to-cart-button-31']")).click();
	

}
}