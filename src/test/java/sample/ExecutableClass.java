package sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ExecutableClass extends Baseclass {
	
	public static void main(String[] args) {
		
		openBrowser();
		loadUrl("https://www.facebook.com/");
		pageTitle();
		pageUrl();
		
		WebElement txtemail = driver.findElement(By.id("email"));
		
		fill(txtemail,"vicky");
		
		WebElement txtpass = driver.findElement(By.id("pass"));
		
		fill(txtpass,"12345");
		
		WebElement btn = driver.findElement(By.xpath("//input[@value='Log In']"));
		
		btnClick(btn);
		
	}
	
	

}
