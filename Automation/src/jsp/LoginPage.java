package jsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	
	private WebElement usrtbx;
	private WebElement psrdtbx;
	private WebElement logbtn;
	 
	public LoginPage(WebDriver driver) {
		usrtbx=driver.findElement(By.id("username"));
		psrdtbx=driver.findElement(By.name("pwd"));
		logbtn=driver.findElement(By.xpath("//div[text()='Login ']"));
			
	}
	public void setlogin(String un,String pw) {
		usrtbx.sendKeys(un);
		psrdtbx.sendKeys(pw);
		logbtn.click();
		
	}
	

}
