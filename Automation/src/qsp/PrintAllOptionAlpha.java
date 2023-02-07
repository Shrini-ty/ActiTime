package qsp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PrintAllOptionAlpha {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/DELL/Desktop/Hotel.html");
		WebElement mtrListbox1 = driver.findElement(By.id("mtr"));
		ArrayList<String> a1=new ArrayList<>();
		Select s=new Select( mtrListbox1);
		List<WebElement> alloptions1 = s.getOptions();
		int count = alloptions1.size();
		System.out.println(count);
		for(WebElement i:alloptions1) {
			String text = i.getText();
	
			a1.add(text);
		}
		Collections.sort(a1);
		System.out.println(a1);
		for(String k:a1) {
			System.out.println(k);
		}
		

	   

	}
}
