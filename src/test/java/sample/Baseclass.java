package sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Baseclass {
	
	public static WebDriver driver;

	public static void openBrowser() {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\vignesh\\eclipse-workspace\\selenium\\driver\\chromedriver.exe");
driver= new ChromeDriver();

	}
	
	public static void loadUrl(String url) {
		
		driver.get(url);
		
			}
	
	public static void pageTitle() {
		
	String title = driver.getTitle();
	
	System.out.println(title);
		
		}
	public static void pageUrl() {
		
		String curl = driver.getCurrentUrl();
		
		System.out.println(curl);
	}
	
	public static void fill(WebElement e,String Value) {
		
		e.sendKeys(Value);
	}
	
	public static void btnClick(WebElement f) {
		
		f.click();
	}
	
	public static void selectByText(WebElement e,String text) {
		
		Select s = new Select(e);
		
		s.selectByVisibleText(text);
		
	}
	
	public static void dragDrop(WebElement src,WebElement dest) {
		
		Actions a= new Actions(driver);
		
		a.dragAndDrop(src, dest);
	}
	
	

}
