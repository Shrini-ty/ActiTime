package TestcaseDemowrkshp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LogOrder {
	static{
		 System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		}


	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("//a[contains(text(),'Log in')]")).click();
		driver.findElement(By.xpath("//input[@name='Email']")).sendKeys("shriarun12@gmail.com");
		driver.findElement(By.xpath("//input[@name='Password']")).sendKeys("87456321");
		JavascriptExecutor j=(JavascriptExecutor)driver;
		j.executeScript("window.scrollBy(0,500)");
		driver.findElement(By.partialLinkText("Addresses")).click();
		driver.findElement(By.xpath("//input[@name='Email']")).sendKeys("shriarun12@gmail.com");
		driver.findElement(By.xpath("//input[@name='Password']")).sendKeys("87456321");
		driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
		driver.findElement( By.xpath("//input[@class='button-1 add-address-button']")).click();
		driver.findElement(By.xpath("//input[@id='Address_FirstName']")).sendKeys("Varun");
		driver.findElement(By.xpath("//input[@id='Address_LastName']")).sendKeys("devadiga");
		driver.findElement(By.xpath("//input[@id='Address_Email']")).sendKeys("Varu1234@gmail.com");
		driver.findElement(By.xpath("//input[@id='Address_Company']")).sendKeys("TYSS");
		WebElement in = driver.findElement(By.xpath("//select[@id='Address_CountryId']"));
		Select s=new Select(in);
		s.selectByVisibleText("India");
		driver.findElement(By.xpath("//input[@id='Address_City']")).sendKeys("bhatkal");
		driver.findElement(By.xpath("//input[@id='Address_Address1']")).sendKeys("Near bamglore");
		driver.findElement(By.xpath("//input[@id='Address_Address2']")).sendKeys("Near btm");
		driver.findElement(By.xpath("//input[@id='Address_ZipPostalCode']")).sendKeys("534812");
		driver.findElement(By.xpath("//input[@id='Address_PhoneNumber']")).sendKeys("9641253698");
		driver.findElement(By.xpath("//input[@id='Address_FaxNumber']")).sendKeys("4512");
		driver.findElement(By.xpath("//input[@value='Save']")).click();
		
		
		
		

		
		
		

	

}
}