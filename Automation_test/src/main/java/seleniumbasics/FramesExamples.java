package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesExamples {
	WebDriver driver;
	public void browser() {
		driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/guru99home/");
	}
	public void frames() {
		WebElement iframe1=driver.findElement(By.xpath("//iframe[@src='ads.html']"));
		driver.switchTo().frame(iframe1);
		WebElement frame1= driver.findElement(By.xpath("//img[@src='Jmeter720.png']"));
		frame1.click();
	}

	public static void main(String[] args) {
		FramesExamples frame=new FramesExamples();
		frame.browser();
		frame.frames();
	}

}
