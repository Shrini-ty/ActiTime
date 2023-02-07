package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingHiddenPopups {
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	

	public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.careinsurance.com/rhicl/proposalcp/renew/index-care");
	driver.findElement(By.id("policynumber")).sendKeys("123");
	 driver.findElement(By.id("dob")).click();
	 WebElement mnth = driver.findElement(By.xpath("//select[@ class='ui-datepicker-month']"));
	Select s=new Select(mnth);
	s.selectByIndex(1);
	WebElement yr = driver.findElement(By.xpath("//select[@ class='ui-datepicker-year']"));
	Select s1=new Select(yr);
	s1.selectByValue("1999");
	driver.findElement(By.linkText("7")).click();
	driver.findElement(By.id("alternative_number")).sendKeys("9845098450");
	driver.findElement(By.id("renew_policy_submit")).click();

	}

}
