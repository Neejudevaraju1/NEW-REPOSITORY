package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavascriptExample {
	WebDriver driver;
	public void driver() {
		driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		JavascriptExecutor executor= (JavascriptExecutor) driver;
		//executor.executeScript("window.scrollBy(0,1000)");
		//executor.executeScript("window.scrollBy(0,-500)");
		WebElement search=driver.findElement(By.id("nav-search-submit-button"));
		executor.executeScript("arguments[0].click();", search);
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JavascriptExample script=new JavascriptExample();
		script.driver();
	}

}
