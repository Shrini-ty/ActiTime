package TestcaseDemowrkshp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LogproductOrder {
	static{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}


	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("//a[contains(text(),'Log in')]")).click();
		driver.findElement(By.xpath("//input[@name='Email']")).sendKeys("shriarun12@gmail.com");
		driver.findElement(By.xpath("//input[@name='Password']")).sendKeys("87456321");
		driver.findElement(By.xpath("//input[@id='RememberMe']")).click();
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		driver.findElement(By.partialLinkText("Book")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement d = driver.findElement(By.xpath("//select[@name='products-orderby']"));
		Select s=new Select(d);
		s.selectByIndex(2);
		WebElement e = driver.findElement(By.xpath("//select[@name='products-viewmode']"));
		Select n=new Select(e);
		n.selectByIndex(1);
		driver.findElement(By.partialLinkText("Health Book")).click();
		driver.findElement(By.xpath("//input[@id='add-to-cart-button-22']")).click();
		JavascriptExecutor j=(JavascriptExecutor)driver;
		j.executeScript("window.scrollBy(0,500)");
		driver.findElement(By.partialLinkText("Shopping cart")).click();
		WebElement a = driver.findElement(By.xpath("//select[@id='CountryId']"));
		Select l=new Select(a);
		l.selectByVisibleText("India");
		driver.findElement(By.xpath("//input[@id='ZipPostalCode']")).sendKeys("5224586");
		driver.findElement(By.xpath("//input[@name='estimateshipping']")).click();
		driver.findElement(By.xpath("//input[@name='termsofservice']")).click();
		driver.findElement(By.xpath("//button[@id='checkout']")).click();
		driver.findElement(By.xpath("(//input[@title='Continue'])[1]")).click();
		
		//WebElement b=driver.findElement(By.id("billing-address-select"));
		//WebElement c = driver.findElement(By.xpath("//select[@id='shipping-address-select']"));
		//Select v=new Select(b);
		//v.selectByVisibleText("New Address");
		//driver.findElement(By.xpath("//input[@id='BillingNewAddress_FirstName']")).sendKeys("Varun");
		//driver.findElement(By.xpath("//input[@id='Address_LastName']")).sendKeys("devadiga");
		//driver.findElement(By.xpath("//input[@id='Address_Email']")).sendKeys("Varu1234@gmail.com");

		//driver.findElement(By.xpath("//input[@id='BillingNewAddress_Company']")).sendKeys("TSS");
		//WebElement in = driver.findElement(By.xpath("//select[@id='BillingNewAddress_CountryId']"));
		//Select p=new Select(in);
		//p.selectByVisibleText("India");
        //driver.findElement(By.xpath("//input[@name='BillingNewAddress.City']")).sendKeys("mubai");
		//driver.findElement(By.xpath("//input[@id='BillingNewAddress_Address1']")).sendKeys(" near uk");
		//driver.findElement(By.xpath("//input[@id='BillingNewAddress_Address2']")).sendKeys(" near us");
		//driver.findElement(By.xpath("//input[@id='BillingNewAddress_ZipPostalCode']")).sendKeys("580068");
	   // driver.findElement(By.xpath("//input[@id='BillingNewAddress_PhoneNumber']")).sendKeys("9656855425");
		
		
		//driver.findElement(By.xpath("//input[@id='BillingNewAddress_FaxNumber']")).sendKeys("4312");
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//input[@title='Continue'])[1]")).click();
		driver.findElement(By.xpath("//input[@id='PickUpInStore']")).click();
		driver.findElement(By.xpath("(//input[@title='Continue'])[2]")).click();
		driver.findElement(By.xpath("(//input[@value='Continue'])[4]")).click();

		//	driver.findElement(By.partialLinkText("Orders")).click();
		//driver.findElement(By.xpath("//input[@name='Email']")).sendKeys("shriarun12@gmail.com");
		//driver.findElement(By.xpath("//input[@name='Password']")).sendKeys("12345678");
		//driver.findElement(By.xpath("//input[@id='RememberMe']")).click();
		//driver.findElement(By.xpath("//input[@value='Log in']")).click();

	}
}
