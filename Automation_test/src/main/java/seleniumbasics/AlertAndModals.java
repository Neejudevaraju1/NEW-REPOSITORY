package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AlertAndModals extends Base{
	public void alertAndModals() {
		driver.navigate().to("https://selenium.qabible.in/javascript-alert.php");
		WebElement clickButton= driver.findElement(By.xpath("//button[@onclick='jsAlert()']"));
		clickButton.click();
		driver.switchTo().alert().accept();
	}
	public void nextAlert() {
		driver.navigate().to("https://selenium.qabible.in/javascript-alert.php");
		WebElement click= driver.findElement(By.xpath("//button[@onclick='jsConfirm()']"));
		click.click();
		driver.switchTo().alert().dismiss();
	}
	public void messageAlert() {
		driver.navigate().to("https://selenium.qabible.in/javascript-alert.php");
		WebElement message=driver.findElement(By.xpath("//button[@onclick='jsPrompt()']"));
		message.click();
		driver.switchTo().alert().sendKeys("Neeju");
		driver.switchTo().alert().accept();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AlertAndModals alert=new AlertAndModals();
		alert.browserInitialisation();
	//	alert.alertAndModals();
		//alert.nextAlert();
		alert.messageAlert();
	}

}
