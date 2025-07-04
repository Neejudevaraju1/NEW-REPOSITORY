package seleniumbasics;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindowHandling {
	WebDriver driver;
	public void windowHandling() {
		driver=new ChromeDriver();
		driver.get("https://webdriveruniversity.com/");
		driver.manage().window().maximize();
		WebElement contactus =driver.findElement(By.xpath("//h1[text()='CONTACT US']"));
		contactus.click();
		WebElement login=driver.findElement(By.xpath("//h1[text()='LOGIN PORTAL']"));
		login.click();
		String parent=driver.getWindowHandle();
		System.out.println(parent);
		Set<String> childwindows=driver.getWindowHandles();
		String title="";
		for(String window:childwindows) {
			if(!window.equals(parent)) {
			System.out.println(window);
			driver.switchTo().window(window);
			 title=driver.getTitle();
			System.out.println(title);
		}
		
		if(title.equals("WebDriver | Contact Us")) {
			WebElement firstname= driver.findElement(By.name("first_name"));
			firstname.sendKeys("Rahul");
		}
		if(title.equals("WebDriver | Login Portal")) {
			WebElement username=driver.findElement(By.xpath("//input[@id='text']"));
			username.sendKeys("henry@gmail.com");
		}
		driver.switchTo().window(parent);
	}

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultipleWindowHandling window=new MultipleWindowHandling();
		window.windowHandling();
	}

}
