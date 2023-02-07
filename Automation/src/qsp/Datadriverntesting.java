package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Datadriverntesting {
	@Test(dataProvider = "testdata")
	public void test(String un,String pw) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("//a[contains(text(),'Log in')]")).click();
		driver.findElement(By.xpath("//input[@name='Email']")).sendKeys(un);
		driver.findElement(By.xpath("//input[@name='Password']")).sendKeys(pw);
		driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
		driver.quit();
   //   @DataProvider
		
	}
	

}
