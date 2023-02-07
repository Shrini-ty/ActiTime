package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PrintAllOptionForE {
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/DELL/Desktop/Hotel.html");
		WebElement mtrListbox = driver.findElement(By.id("mtr"));
		Select s=new Select( mtrListbox);
		List<WebElement> allOption = s.getOptions();
		int count = allOption.size();
		System.out.println(count);
		for(WebElement i:allOption) {
			String text = i.getText();
			System.out.println(text);
		}
			
	

	}

}
