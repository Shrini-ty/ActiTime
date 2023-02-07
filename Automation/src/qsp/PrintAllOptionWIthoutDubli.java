package qsp;

import java.util.HashSet;
import java.util.List;

import javax.crypto.SealedObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PrintAllOptionWIthoutDubli {
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/DELL/Desktop/Hotel.html");
		WebElement mtrList2 = driver.findElement(By.id("mtr"));
		HashSet h1=new HashSet();
		Select s=new Select(mtrList2);
		List<WebElement> allOption3 = s.getOptions();
		for(WebElement i:allOption3) {
			String text = i.getText();
			h1.add(text);
		}
		for(Object m:h1) {
			System.out.println(m);
		}
		

	}

}
