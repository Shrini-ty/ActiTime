package TestcaseDemowrkshp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DigitalShop {
	static {
		 System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		}

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.partialLinkText("Digital downl")).click();
		WebElement r = driver.findElement(By.xpath("//select[@id='products-orderby']"));
		Select s=new Select(r);
		s.selectByIndex(2);
		WebElement o = driver.findElement(By.xpath("//select[@id='products-pagesize']"));
		Select x=new Select(o);
		x.selectByIndex(2);
		driver.findElement(By.partialLinkText("3rd Album")).click();
		driver.findElement(By.partialLinkText("Add your review")).click();
		System.out.println("reviewed");
		

}
}