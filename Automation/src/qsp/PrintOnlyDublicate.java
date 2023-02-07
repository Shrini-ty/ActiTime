package qsp;

import java.util.HashSet;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PrintOnlyDublicate {
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/DELL/Desktop/Hotel.html");
		WebElement mtrListbox3 = driver.findElement(By.id("mtr"));
		HashSet h1=new HashSet();
		Select s=new Select(mtrListbox3);
		List<WebElement> allOption3 = s.getOptions();
		for(WebElement i:allOption3) {
			String text = i.getText();
			if(h1.add( text )==false)
			{
				System.out.println(text);
			}
	
			
		}

	}

}
