package TestcaseDemowrkshp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ElectronicsCameraWhialist {
	static {
		 System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		}

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.partialLinkText("Electronic")).click();
		driver.findElement(By.partialLinkText("Camera, photo")).click();
		WebElement r = driver.findElement(By.xpath("//select[@id='products-orderby']"));
		Select s=new Select(r);
		s.selectByIndex(2);
		WebElement o = driver.findElement(By.xpath("//select[@id='products-pagesize']"));
		Select x=new Select(o);
		x.selectByIndex(1);
		driver.findElement(By.partialLinkText(" Camcord")).click();
		driver.findElement(By.xpath("//input[@value='Add to compare list']")).click();
		
		

}
}
