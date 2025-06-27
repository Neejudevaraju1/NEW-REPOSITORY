package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class InputForm extends Base {
	public void enterMessage() {
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		WebElement  enterMessage=driver.findElement(By.id("single-input-field"));
		enterMessage.sendKeys("Hello");
		WebElement showMessage=driver.findElement(By.id("button-one"));
		showMessage.click();
		WebElement value_A=driver.findElement(By.id("value-a"));
		value_A.sendKeys("10");
		WebElement value_B=driver.findElement(By.id("value-b"));
		value_B.sendKeys("20");
		WebElement total=driver.findElement(By.xpath("//button[@id='button-two']"));
		total.click();
	}
	

	public static void main(String[] args) {
		InputForm inputform= new InputForm();
		inputform.browserInitialisation();
		inputform.enterMessage();
		
	}

}
