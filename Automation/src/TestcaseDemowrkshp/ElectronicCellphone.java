package TestcaseDemowrkshp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ElectronicCellphone {
	static {
		 System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		}

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.partialLinkText("Electronic")).click();
		driver.findElement(By.partialLinkText("Cell phone")).click();
		WebElement w = driver.findElement(By.xpath("//select[@id='products-orderby']"));
		Select s=new Select(w);
		s.selectByIndex(2);
		WebElement x = driver.findElement(By.xpath("//select[@id='products-pagesize']"));
		Select p=new Select(x) ;
		p.selectByIndex(2);
		driver.findElement(By.partialLinkText("Smartphone")).click();
		driver.findElement(By.xpath("//input[@id='add-to-wishlist-button-43']")).click();

}
}
