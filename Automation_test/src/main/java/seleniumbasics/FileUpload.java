package seleniumbasics;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {
	WebDriver driver;
	public void browser() {
		driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/upload");
		driver.manage().window().maximize();
		WebElement choosefile=driver.findElement(By.xpath("//input[@id='file-upload']"));
				choosefile.sendKeys("C:\\Users\\User\\Downloads\\uploadAttendance(2).pdf");
			WebElement upload=driver.findElement(By.xpath("//input[@id='file-submit']"));
			upload.click();
	}
	 public void RobotClassForFileUpload() throws AWTException {
		 driver=new ChromeDriver();
		driver.get("https://www.ilovepdf.com/pdf_to_word");
		driver.manage().window().maximize();
		WebElement selectpdf=driver.findElement(By.xpath("//a[@id='pickfiles']"));
		selectpdf.click();
		StringSelection selection=new StringSelection("C:\\Users\\User\\Downloads\\uploadAttendance(2).pdf");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection,null);
		Robot robot=new Robot();
		robot.delay(2000);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
	 }

	public static void main(String[] args) throws AWTException {
		// TODO Auto-generated method stub
FileUpload file= new FileUpload();
//file.browser();
file.RobotClassForFileUpload();
	}

}
