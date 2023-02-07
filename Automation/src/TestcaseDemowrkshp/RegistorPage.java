package TestcaseDemowrkshp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class RegistorPage {
	static{
		 System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		}

	public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://demowebshop.tricentis.com/");
    driver.findElement(By.xpath("//a[contains(text(),'Register')]")).click();
    driver.findElement(By.xpath("//input[@id='gender-male']")).click();
    driver.findElement(By.xpath("//input[@name='FirstName']")).sendKeys("shrinivas");
    driver.findElement(By.xpath("//input[@name='LastName']")).sendKeys("devadiga");
    driver.findElement(By.xpath("//input[@name='Email']")).sendKeys("shriarun1222@gmail.com");
    driver.findElement(By.xpath("//input[@name='Password']")).sendKeys("12345678");
    driver.findElement(By.xpath("//input[@name='ConfirmPassword']")).sendKeys("12345678");
    driver.findElement(By.xpath("//input[@id='register-button']")).click();
    
	

	
}
}
